<%--
  User: huzihao
  Date: 2020/10/26
  Time: 20:38
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    System.out.println("a.jsp");
    Object user = session.getAttribute("user");
    if (null == user) {
        request.getRequestDispatcher("/login.jsp").forward(request, response);
        return;
    }
%>
我是a.jsp文件
</body>
</html>
