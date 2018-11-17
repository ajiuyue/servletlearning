package com.jiuyue.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create bySeptember
 * 2018/11/6
 * 21:02
 */
public class Servlet03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取网页从哪里来的
        String referer = req.getHeader("Referer");
        //如果不是从我的首页或从地址栏直接访问的
        if(referer==null||referer.contains("localhost:8080/Servlet06/index.jsp")){
        //回到首页去
        resp.sendRedirect("/index.jsp");
        return;
        }
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("获取最新资源分享");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.setCharacterEncoding("UTF-8");
        String userName = req.getParameter("username");
        System.out.println("userName: "+userName);
    }
}
