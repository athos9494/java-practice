package club.banyuan.controller;

import club.banyuan.entity.Product;
import club.banyuan.service.ProductService;
import club.banyuan.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "AddCartServlet",urlPatterns = "/addCart.do")
public class AddCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.valueOf(request.getParameter("productId"));
        int num = Integer.valueOf(request.getParameter("num"));
        ProductService productService = new ProductServiceImpl();
        Product product = null;
        try {
            product = productService.getProductById(id);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        if(product!=null) {
            Map<Product, Integer> cart = new HashMap<>();
            cart.put(product,num);
            request.setAttribute("cart",cart);
        }

        request.getRequestDispatcher("buycar.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
