package com.jiuyue.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create bySeptember
 * 2018/11/1
 * 20:06
 */
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet请求相应");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        resp.getWriter().write("service写业务逻辑输出HelloWorld!");
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public ServletConfig getServletConfig() {
        return super.getServletConfig();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
