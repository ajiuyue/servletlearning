package com.jiuyue.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create bySeptember
 * 2018/11/1
 * 20:10
 */
//urlPatterns指定访问的url
@WebServlet(name = "MyServlet02",urlPatterns = "/MyServlet02")
public class MyServlet02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write("到达doPost请求");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //可以在doGet调用doPost方法
        //doPost(request,response);
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write("到达doGet请求");
    }
}
