<%--
  User: huzihao
  Date: 2020/10/21
  Time: 23:05
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>代码脚本</title>
</head>
<body>
<%
    int i = 12;
    if (12 == i) {
        System.out.println("hello");
    } else {
        System.out.println("hi");
    }
%>
<ul>
    <%
        for (int j = 0; j < 10; j++) {
    %>
    <li>
        <%=j + 1%>
    </li>
    <%
        }
    %>
</ul>
<%
    System.out.println(request.getRemoteHost());
%>
</body>
</html>
