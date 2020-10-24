<%--
  User: huzihao
  Date: 2020/10/24
  Time: 16:59
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>登录</title>
    <base href="http://localhost:8080/cookie_session/">
</head>
<body>
<form action="login?action=login" method="post">
    用户名: <input type="text" name="username" value="${cookie.username.value}"><br>
    密码: <input type="password" name="password"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
