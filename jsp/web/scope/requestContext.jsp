<%--
  User: huzihao
  Date: 2020/10/22
  Time: 00:26
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>request(一次请求内有效)</title>
</head>
<body>
pageContext: <%=pageContext.getAttribute("pageContext")%><br>
request: <%=request.getAttribute("request")%><br>
session: <%=session.getAttribute("session")%><br>
application: <%=application.getAttribute("application")%><br>
</body>
</html>
