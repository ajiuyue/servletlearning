package com.jiuyue.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * Create bySeptember
 * 2018/11/2
 * 15:18
 */
public class ServleDownload extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取资源路径
        String name= req.getParameter("fName");
        System.out.println("name: "+name);//比如name=1.jpg
        String path = this.getServletContext().getRealPath("/resource/"+name);
        //文件输入流读取资源
        FileInputStream fileInputStream = new FileInputStream(path);
        //获取文件名
        //substring() 方法返回字符串的子字符串。
        //lastIndexOf() 方法可返回一个指定的字符串值最后出现的位置，
        // 在一个字符串中的指定位置从后向前搜索
        String fileName = path.substring(path.lastIndexOf("\\")+1);
        //设置消息头，告诉浏览器，我要下载1.jpg这个图片
        //resp.setHeader("Content-Disposition", "attachment; filename="+fileName);
        resp.setHeader("Content-Disposition", "attachment; filename="+URLEncoder.encode(fileName,"UTF-8"));
        int len = 0;
        byte[] bytes = new byte[1024];
        ServletOutputStream  servletOutputStream = resp.getOutputStream();
        while((len=fileInputStream.read(bytes))>0){
            servletOutputStream.write(bytes, 0, len);
        }
        //关闭资源
        servletOutputStream.close();
        fileInputStream.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
