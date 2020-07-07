package club.banyuan.controller;

import club.banyuan.entity.Order;
import club.banyuan.entity.OrderDetail;
import club.banyuan.entity.Product;
import club.banyuan.entity.User;
import club.banyuan.service.OrderService;
import club.banyuan.service.impl.OrderServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

@WebServlet(name = "OrderServlet", urlPatterns = "/order.do")
public class OrderServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double sumcost = Double.valueOf(request.getParameter("sumcost"));
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");


        Order order = new Order();
        order.setUserId(user.getId());
        order.setLoginName(user.getLoginName());
        order.setUserAddress(session.getAttribute("defaultAddress").toString());
        order.setCost(sumcost);
        Date date = new Date();
        order.setCreateTime(date);

        //按照时间随机生成订单号
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String newDate = sdf.format(new Date());
        String result = "";
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            result += random.nextInt(10);
        }

        order.setSerialNumber(newDate + result);


        OrderService orderService = new OrderServiceImpl();
        try {

            int orderId = orderService.addOrder(order);
            Map<Product, Integer> cart = (Map<Product, Integer>) session.getAttribute("cart");
            for (Product product : cart.keySet()) {
                OrderDetail orderDetail = new OrderDetail();
                orderDetail.setOrderId(orderId);
                orderDetail.setProductId(product.getId());
                orderDetail.setQuantity(cart.get(product));
                orderDetail.setCost((Double) (cart.get(product) * product.getPrice()));
                orderService.addOrderDetail(orderDetail);
            }

            //获取用户订单信息
            List<Order> orderList = new ArrayList<>();
            orderList = orderService.selectOrderByUserId(user.getId());
            session.setAttribute("orderList", orderList);


            request.getRequestDispatcher("Member_Order.jsp").forward(request, response);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}