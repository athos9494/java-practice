package club.banyuan.controller;

import club.banyuan.entity.User;
import club.banyuan.service.UserService;
import club.banyuan.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet",urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String loginName = request.getParameter("loginName");
        String password = request.getParameter("password");
        String saveCookie = request.getParameter("saveCookie");
//        格式验证

//        调用service处理登录请求
        UserService userService = new UserServiceImpl();
        try {
            User user = userService.login(loginName,password);
            if(user!=null){
                if (saveCookie != null){
                    Cookie cookies = new Cookie("loginName",loginName);
                    //cookie 过期时间一周；
                    cookies.setMaxAge(7*24*3600);
                    //cookie保存到客户端
                    response.addCookie(cookies);

                    cookies = new Cookie("password",password);
                    //浏览器退出生命周期结束
                    cookies.setMaxAge(-1);
                    response.addCookie(cookies);
                }
                request.setAttribute("user",user);
                request.getRequestDispatcher("index.jsp").forward(request,response);
                return ;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        request.getRequestDispatcher("login.html").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
