package club.banyuan.controller;

import club.banyuan.entity.Auction;
import club.banyuan.entity.Lots;
import club.banyuan.service.AuctionServiceDao;
import club.banyuan.service.impl.AuctionServiceDaoImpl;
import club.banyuan.service.impl.LotsServiceDaoImpl;
import club.banyuan.service.LotsServiceDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "LotsServlet", urlPatterns = "/auction.do")
public class AuctionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        Lots lots = new Lots();
        HttpSession session = request.getSession();
        LotsServiceDao lotsServiceDao = new LotsServiceDaoImpl();
        AuctionServiceDao auctionServiceDao = new AuctionServiceDaoImpl();

        List<Auction> auctionList = new ArrayList<>();
        try {
            lots = lotsServiceDao.getLotsById(id);
            session.setAttribute("lots", lots);
            auctionList = auctionServiceDao.getByLotsId(lots.getId());
            session.setAttribute("auctionList", auctionList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("auction.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
