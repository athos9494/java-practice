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
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AlterLotsServlet",urlPatterns = "/alterLots.do")
public class AlterLotsServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        HttpSession session = request.getSession();
        LotsServiceDao lotsServiceDao = new LotsServiceDaoImpl();
        //获取修改后的商品属性
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String startPrice = request.getParameter("startPrice");
        String basePrice = request.getParameter("basePrice");
        String startTime = request.getParameter("startTime");
        String finishTime = request.getParameter("finishTime");
        String fileName = request.getParameter("fileName");
        //构造成Lots对象
        Lots lots = new Lots();
        lots.setName(name);
        lots.setDescription(description);
        lots.setStartPrice(Double.valueOf(startPrice));
        lots.setBasePrice(Double.valueOf(basePrice));
        try {
            lots.setStartTime(sdf.parse(startTime));
            lots.setFinishTime(sdf.parse(finishTime));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        lots.setFileName(fileName);
        //获取要修改的商品ID
        Integer alterLotsId = (Integer)session.getAttribute("alterLotsId");
        lots.setId(alterLotsId);


        int i = 0;
        try {
            i = lotsServiceDao.updateLots(lots);
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
        request.getRequestDispatcher("alter.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
