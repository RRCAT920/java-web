<%--
  User: huzihao
  Date: 2020/10/22
  Time: 03:17
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>域数据</title>
</head>
<body>
<%
    pageContext.setAttribute("key1", "pageContext1");
    pageContext.setAttribute("key2", "pageContext2");
    request.setAttribute("key1", "request1");
    session.setAttribute("key1", "session1");
    application.setAttribute("key1", "application1");
%>
${pageScope.key1}<br>
${pageScope.key2}<br>
${requestScope.key1}<br>
${sessionScope.key1}<br>
${applicationScope.key1}<br>
</body>
</html>
