package com.yjxxt.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("hello world");
        res.getWriter().write("<h1>HELLO WORLD</h1>");
        req.setAttribute("msg","HELLO");
        req.getRequestDispatcher("login.jsp").forward(req,res);
    }
}
