package club.banyuan.controller;

import club.banyuan.dao.AdministratorDao;
import club.banyuan.dao.impl.AdministratorDaoImpl;
import club.banyuan.entity.Administrator;
import club.banyuan.service.AdministratorService;
import club.banyuan.service.impl.AdministratorServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "administratorLoginServlet", urlPatterns = "/adminLogin.do")
public class AdministratorLoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String adminName = req.getParameter("adminName");
        String adminPwd = req.getParameter("adminPwd");
        AdministratorService administratorService = new AdministratorServiceImpl();
        Administrator administrator = null;
        try {
            administrator = administratorService.login(adminName, adminPwd);
            if (administrator != null) {
                req.getRequestDispatcher("lotsControl.jsp").forward(req, resp);
                return;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        req.getRequestDispatcher("administratorLogin.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
