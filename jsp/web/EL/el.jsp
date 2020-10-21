<%--
  User: huzihao
  Date: 2020/10/22
  Time: 02:24
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式概述</title>
</head>
<body>
<%
    request.setAttribute("key", "value");
%>
表达式脚本：<%=request.getAttribute("key")%><br>
EL：${key}<br>

不存在时：<br>
表达式脚本：<%=request.getAttribute("key1")%><br>
EL：${key1}<br>
</body>
</html>
