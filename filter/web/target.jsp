<%--
  User: huzihao
  Date: 2020/10/26
  Time: 21:48
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    System.out.println("target.jsp");
    System.out.println("target: " + Thread.currentThread().getName());
    System.out.println("1: " + request.getParameter("username"));

%>
</body>
</html>
