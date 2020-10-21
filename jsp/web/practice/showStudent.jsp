<%@ page import="pojo.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%--
  User: huzihao
  Date: 2020/10/22
  Time: 01:39
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>10个学生信息</title>
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
<%
    @SuppressWarnings("unchecked")
    List<Student> studentList = (List<Student>) request.getAttribute("studentList");
%>
<table>
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>电话号码</th>
        <th>操作</th>
    </tr>
    <%
        if (studentList != null) {
            for (Student student : studentList) {
    %>
    <tr>
        <td><%=student.getId()%>
        </td>
        <td><%=student.getName()%>
        </td>
        <td><%=student.getAge()%>
        </td>
        <td><%=student.getPhone()%>
        </td>
        <td><%="删除、修改"%>
        </td>
    </tr>
    <%
            }
        }
    %>
</table>
</body>
</html>
