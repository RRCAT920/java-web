<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  User: huzihao
  Date: 2020/10/22
  Time: 03:06
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>中括号运算</title>
</head>
<body>
<%
    Map<String, Object> map = new HashMap<>();
    map.put(".", "dot");
    map.put("[", "left middle par");

    request.setAttribute("map", map);
%>
${map["."]}
${map["["]}
</body>
</html>
