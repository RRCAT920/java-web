<%--
  User: huzihao
  Date: 2020/10/22
  Time: 03:20
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pageContext内置对象</title>
</head>
<body>
<%
    pageContext.setAttribute("req", request);
    pageContext.setAttribute("session", session);
%>
${pageContext}<br>
1. 协议：${req.protocol}<br>
2. 服务器 ip：${req.serverName}<br>
3. 服务器端口：${req.serverPort}<br>
4. 获取工程路径：${req.contextPath}<br>
5. 获取请求方法：${req.method}<br>
6. 获取客户端 ip 地址：${req.remoteHost}<br>
7. 获取会话的 id 编号：${session.id}<br>
</body>
</html>
