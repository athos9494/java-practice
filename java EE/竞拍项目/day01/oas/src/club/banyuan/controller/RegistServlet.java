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

@WebServlet(name = "RegistServlet",urlPatterns = "/regist.do")
public class RegistServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        user.setUserName(req.getParameter("userName"));
        user.setUserPwd(req.getParameter("userPwd"));
        boolean flag = false;

        UserService userService = new UserServiceImpl();
        try {
            int id = userService.regist(user);
            if (id > 0 ){
                flag = true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        if (flag){
            resp.sendRedirect("竞拍者登录.html");
        }
        else {
            resp.sendRedirect("竞拍者注册页.html");
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
