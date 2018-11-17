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
public class Servlet04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getRequestDispatcher("/jsp/head.jsp").include(req,resp);
//        resp.getWriter().write("--------------------------------");
//        req.getRequestDispatcher("/jsp/foot.jsp").include(req,resp);
        resp.sendRedirect("https://www.baidu.com/");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.setCharacterEncoding("UTF-8");
        String userName = req.getParameter("username");
        System.out.println("userName: "+userName);
    }
}
