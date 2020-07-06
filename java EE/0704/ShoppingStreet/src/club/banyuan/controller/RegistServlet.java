package club.banyuan.controller;

import club.banyuan.dao.UserDao;
import club.banyuan.dao.impl.UserDaoImpl;
import club.banyuan.entity.User;
import club.banyuan.service.UserService;
import club.banyuan.service.impl.UserServiceImpl;
import club.banyuan.utils.JdbcUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "RegistServlet",urlPatterns = "/regist.do")
public class RegistServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String loginName = req.getParameter("loginName");
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String mobile = req.getParameter("mobile");
        UserService userService = new UserServiceImpl();
        User user = new User();

        try {
            UserDao userDao = new UserDaoImpl(JdbcUtils.getConnection());

            int count = userDao.add(user);
            if (count!=0){
                req.getAttribute("user");
                req.getRequestDispatcher("index.jsp").forward(req,resp);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        req.getRequestDispatcher("regist.html").forward(req,resp);


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
