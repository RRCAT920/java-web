<%--
  User: huzihao
  Date: 2020/10/22
  Time: 01:01
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
头部信息<br>
内容<br>
<jsp:include page="/include/footer.jsp">
    <jsp:param name="username" value="lirongrong"/>
    <jsp:param name="password" value="920"/>
</jsp:include>
</body>
</html>
