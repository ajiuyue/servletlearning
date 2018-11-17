package com.jiuyue.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * Create bySeptember
 * 2018/11/1
 * 21:12
 */
public class MyServlet03 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //调用ServletResponse对象的方法向浏览器输出HelloWorld
        servletResponse.setContentType("text/html;charset=utf-8");
        servletResponse.getWriter().write("输出HelloWorld!");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
