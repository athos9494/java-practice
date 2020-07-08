package club.banyuan.controller;

import club.banyuan.entity.User;
import club.banyuan.service.UserService;
import club.banyuan.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet",urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String loginName = req.getParameter("userName");
        String password = req.getParameter("userPwd");

        UserService userService = new UserServiceImpl();
        try {
            User user = userService.login(loginName,password);
            if(user!=null){
                req.setAttribute("user",user);
                req.getRequestDispatcher("index.jsp").forward(req,resp);
                return ;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        req.getRequestDispatcher("竞拍者登录.html").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
