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
import java.util.List;

@WebServlet(name = "SearchServlet", urlPatterns = "/search.do")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String startTime = request.getParameter("startTime");
        String finishTime = request.getParameter("finishTime");
        String startPrice = request.getParameter("startPrice");

        String sql = "select * from lots where isSelled = 0 ";

        if(name != ""){
            name = " and name like '%" + name + "%' ";
            sql = sql + name;
        }
        if(description != ""){
            description = " and description like '%" + description + "%' ";
            sql = sql + description;
        }
        if(startTime != ""){
            startTime = " and startTime >= '" + startTime + "' ";
            sql += startTime;
        }
        if(finishTime != ""){
            finishTime = " and finishTime <= '"+ finishTime + "' ";
            sql += finishTime;
        }
        System.out.println(sql);
        HttpSession session = request.getSession();
        LotsServiceDao lotsServiceDao = new LotsServiceDaoImpl();
        try {
            List<Lots> lotsList = lotsServiceDao.getLotsByOpinion(sql);
            session.setAttribute("lotsListNotSelled", lotsList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try{
            String userId = session.getAttribute("userId").toString();
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }catch (Exception e){
            String adminId = session.getAttribute("adminId").toString();
            request.getRequestDispatcher("lotsControl.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
