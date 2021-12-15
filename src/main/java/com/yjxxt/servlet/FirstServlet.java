package com.yjxxt.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设定编码
        req.setCharacterEncoding("UTf-8");
        resp.setContentType("text/html;charset-8");
        //获取参数
        String method = req.getMethod();
        System.out.println("method"+method);
        //请求协议
        String protocol = req.getProtocol();
        System.out.println("protocol="+protocol);
        //请求参数
        String name = req.getParameter("name");
        System.out.println("name="+name);
        //获取复选框
        String[] hobbies = req.getParameterValues("hobby");
        System.out.println(Arrays.toString(hobbies));
        //请求参数
        String queryString = req.getQueryString();
        System.out.println(queryString+"===");
        //项目名称
        String contextpath = req.getContextPath();
        System.out.println("contestpath"+contextpath);
        //获取请求资源定位符
        StringBuffer url = req.getRequestURL();
        System.out.println("url="+url);
        //请求资源标识符
        String uri = req.getRequestURI();
        System.out.println("uri="+uri);
        //servlet 请求映射路径
        String servletPath = req.getServletPath();
        System.out.println(servletPath+"===");
        //端口号
        int servletport = req.getLocalPort();
        System.out.println("==="+servletport);
        //存储数据到作用域
        req.setAttribute("msg","hello msg");
        //转发
        req.getRequestDispatcher("hello.jsp").forward(req,resp);

    }
}
