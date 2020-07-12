package club.banyuan.controller;

import club.banyuan.entity.Lots;
import club.banyuan.service.impl.LotsServiceDaoImpl;
import club.banyuan.service.LotsServiceDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "DeleteServlet",urlPatterns = "/delete.do")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        LotsServiceDao lotsServiceDao = new LotsServiceDaoImpl();
        HttpSession session = request.getSession();
        int i = 0;
        try {
            i = lotsServiceDao.deleteLots(id);
            if(i != 0){

                List<Lots> lotsListNotSelled = new ArrayList<Lots>();
                lotsListNotSelled = lotsServiceDao.getLotsBySell(0);
                session.setAttribute("lotsListNotSelled", lotsListNotSelled);

                request.getRequestDispatcher("lotsControl.jsp").forward(request, response);
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
