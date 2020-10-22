<%--
  User: huzihao
  Date: 2020/10/22
  Time: 04:53
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
    <base href="http://localhost:8080/jsp/">
</head>
<body>
<form action="upload" method="post" enctype="multipart/form-data">
    <table>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>头像</td>
            <td><input type="file" name="photo"></td>
        </tr>
        <tr>
            <td><input type="submit" value="上传"></td>
        </tr>
    </table>
</form>
</body>
</html>
