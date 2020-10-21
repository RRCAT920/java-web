<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="pojo.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  User: huzihao
  Date: 2020/10/22
  Time: 03:52
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>core标签库</title>
    <style>
        table {
            border: 1px solid black;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid black;
        }
    </style>
</head>
<body>
<c:set scope="request" var="lirongrong" value="choumaomi"/>
${requestScope.lirongrong}<br>
<hr>
<c:if test="${12 == 12}">
    <h1>成立</h1>
</c:if>
<hr>
<c:set scope="request" var="height" value="198"/>
<c:choose>
    <c:when test="${requestScope.height > 190}">
        <h2>小巨人</h2>
    </c:when>
    <c:when test="${requestScope.height > 180}">
        <h2>很高</h2>
    </c:when>
    <c:when test="${requestScope.height > 170}">
        <h2>还可以</h2>
    </c:when>
    <c:otherwise>
        <h2>还能接受</h2>
    </c:otherwise>
</c:choose>
<hr>
1. 遍历 1 到 10，输出 <br>
<c:forEach var="i" begin="1" end="10" step="1">
    ${i}<br>
</c:forEach>
<hr>
2. 遍历 Object 数组 <br>
<%
    request.setAttribute("arr", new String[]{"18610541354", "18688886666", "18699998888"});
%>
<c:forEach var="str" items="${requestScope.arr}">
    ${str}<br>
</c:forEach>
<hr>
3. 遍历 Map 集合 <br>
<%
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("key1", "value1");
    map.put("key2", "value2");
    map.put("key3", "value3");
    request.setAttribute("map", map);
%>
<c:forEach var="entry" items="${requestScope.map}">
    ${entry.key}=${entry.value}<br>
</c:forEach>
<hr>
4. 遍历 List 集合---list 中存放 Student 类，有属性：编号，用户名，密码，年龄， 电话信息 <br>
<%
    List<Student> studentList = new ArrayList<>();
    for (int i = 1; i <= 10; i++) {
        studentList.add(new Student(i, "name" + i, 18 + i, "phone" + i));
    }
    request.setAttribute("studentList", studentList);
%>
<table>
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>电话</th>
        <th>数量</th>
    </tr>
<c:forEach var="student" items="${requestScope.studentList}" begin="2" end="7" step="2"
           varStatus="status">
    <tr>
        <td>${student.id}</td>
        <td>${student.name}</td>
        <td>${student.age}</td>
        <td>${student.phone}</td>
        <td>${status.count}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
