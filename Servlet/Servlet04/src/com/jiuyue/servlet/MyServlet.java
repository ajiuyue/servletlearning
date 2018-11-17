package com.jiuyue.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Create bySeptember
 * 2018/11/2
 * 11:00
 */
public class MyServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //获取ServletOutputStream流对象
            //ServletOutputStream servletOutputStream = resp.getOutputStream();
            //输出到浏览器
            //servletOutputStream.print("Hello,World");
            //servletOutputStream.print("你好，世界");
            //resp.getOutputStream().write("aaa".getBytes());
            //resp.getOutputStream().write("你好，世界".getBytes());
            //resp.getOutputStream().write("你好，世界".getBytes("GBK"));
            //设置头信息，告诉浏览器我输出的数据编码是utf-8的
            //resp.setHeader("Content-Type","text/html;charset=UTF-8");
            //resp.getOutputStream().write("你好，世界".getBytes("UTF-8"));
            resp.setContentType("text/html;charset=UTF-8");
            //获取printWriter对象
            PrintWriter printWriter = resp.getWriter();
            printWriter.write("看完记得点个赞吧");

        }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
