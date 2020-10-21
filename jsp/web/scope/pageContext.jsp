<%--
  User: huzihao
  Date: 2020/10/21
  Time: 23:35
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pageContext(当前页面内有效)</title>
</head>
<body>
<%
    pageContext.setAttribute("pageContext", true);
    request.setAttribute("request", true);
    session.setAttribute("session", true);
    application.setAttribute("application", true);
%>
pageContext: <%=pageContext.getAttribute("pageContext")%><br>
request: <%=request.getAttribute("request")%><br>
session: <%=session.getAttribute("session")%><br>
application: <%=application.getAttribute("application")%><br>
<%
    request.getRequestDispatcher("/scope/requestContext.jsp").forward(request, response);
%>
</body>
</html>
