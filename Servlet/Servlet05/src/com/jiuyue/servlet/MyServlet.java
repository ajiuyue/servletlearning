package com.jiuyue.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 * Create bySeptember
 * 2018/11/4
 * 15:25
 */
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gzipOutputStream= new GZIPOutputStream(byteArrayOutputStream);
        gzipOutputStream.write(s.getBytes());
        //gzipOutputStream有缓冲，把缓冲清了，并顺便关闭流
        gzipOutputStream.close();
        //将压缩的数据取出来
        byte [] bytes = byteArrayOutputStream.toByteArray();
        //获取数据长度，输出到浏览器
        resp.setHeader("Content-Encoding","gzip");
        resp.getOutputStream().write(bytes);
        System.out.println("压缩后的数据长度："+bytes.length);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        //获取数据长度，输出到浏览器
        resp.getWriter().write("原来数据长度："+s.getBytes().length+"</br>");
        //相应数据输出到浏览器
        resp.getWriter().write(s);
    }
}
