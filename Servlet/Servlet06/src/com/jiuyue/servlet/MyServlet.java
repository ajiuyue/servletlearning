package com.jiuyue.servlet;


import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
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
        //在内存中生成一张图片，长80，高20，类型GRB
        BufferedImage bufferedImage = new BufferedImage(80,20,BufferedImage.TYPE_3BYTE_BGR);
        //获取到这张图片
        Graphics graphics = bufferedImage.getGraphics();
        //设置图片颜色字体
        graphics.setColor(Color.WHITE);
        graphics.setFont(new Font(null,Font.BOLD,20));

        //一般数字都是随机的
        graphics.drawString("12345",0,20);

        resp.setHeader("ContentType","jpeg");
        ImageIO.write(bufferedImage, "jpg", resp.getOutputStream());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
    }
}
