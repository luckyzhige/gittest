package com.yjxxt.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet
public class Login extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setCharacterEncoding("UTF-8");
    resp.setContentType("text/html;charset=utf-8");

    String uname = req.getParameter("uname");
    String pwd = req.getParameter("pwd");
    if ("admin".equals(uname)&&"admin".equals("pwd")){
        req.setAttribute("uname",uname);
        req.getRequestDispatcher("login_success.jsp").forward(req,resp);
        }else {
        req.setAttribute("mag","错误");
        req.getRequestDispatcher("login.jsp");
        }
    }
}
