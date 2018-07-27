<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/26 0026
  Time: 下午 4:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    // 获得项目完全路径（假设你的项目叫MyApp，那么获得到的地址就是http://localhost:8080/MyApp/）:
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    %>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
