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
import java.text.ParseException;
import java.text.SimpleDateFormat;

@WebServlet(name = "AlterServlet", urlPatterns = "/alter.do")
public class AlterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LotsServiceDao lotsServiceDao = new LotsServiceDaoImpl();
        HttpSession session = request.getSession();
        String id = request.getParameter("id");
        try {
            Lots lots = lotsServiceDao.getLotsById(Integer.valueOf(id));
            session.setAttribute("alterLots", lots);
            request.getRequestDispatcher("alter.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
