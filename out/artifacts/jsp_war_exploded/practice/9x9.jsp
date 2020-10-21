<%--
  User: huzihao
  Date: 2020/10/22
  Time: 01:30
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>九九乘法表</title>
</head>
<body>
<%
for (int i = 1; i <= 9; i++) {
    for (int j = 1; j <= i; j++) {
%>
<%="%2d x%2d = %2d".formatted(j, j, j * j)%>
<%
    }
%>
<br>
<%
}
%>
</body>
</html>
