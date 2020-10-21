<%@ page import="java.util.Arrays" %>
<%--
  User: huzihao
  Date: 2020/10/22
  Time: 03:33
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>其他内置对象</title>
</head>
<body>
${param.username}<br>
${paramValues.username[0]}<br>
${paramValues.username[1]}<br>
${Arrays.toString(paramValues.username)}<br>
<hr>
${header["User-Agent"]}<br>
${header.Connection}<br>
${headerValues["User-Agent"][0]}<br>
<hr>
${cookie.JSESSIONID.name}<br>
${cookie.JSESSIONID.value}<br>
<hr>
${initParam.username}<br>
${initParam.url}<br>
</body>
</html>
