<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %><%--
  User: huzihao
  Date: 2020/10/22
  Time: 02:59
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>empty运算</title>
</head>
<body>
<%
    pageContext.setAttribute("emptyNull", null);
    pageContext.setAttribute("emptyString", "");
    pageContext.setAttribute("emptyArray", new Object[0]);
    pageContext.setAttribute("emptyList", new ArrayList<>());
    pageContext.setAttribute("emptyMap", new HashMap<>());
%>
${empty emptyNull}<br>
${empty emptyString}<br>
${empty emptyArray}<br>
${empty emptyList}<br>
${empty emptyMap}<br>
</body>
</html>
