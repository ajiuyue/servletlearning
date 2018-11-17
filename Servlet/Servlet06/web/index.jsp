<%--
  Created by IntelliJ IDEA.
  User: September
  Date: 2018/11/4
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>欢迎！</h2>
<a href="/MyServlet03">访问资源</a><br>
  <form action="/MyServlet03" method="post">
  用户名：<input type="text" name="username"><br>
  密码<input type="password" name="password"><br>
  <input type="submit" value="提交">
  </form>
  </body>
</html>
