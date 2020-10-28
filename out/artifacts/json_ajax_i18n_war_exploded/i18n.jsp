<%@ page import="java.util.Locale" %>
<%@ page import="java.util.ResourceBundle" %>
<%@ page import="org.apache.tomcat.jni.Local" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="pragma" content="no-cache"/>
    <meta http-equiv="cache-control" content="no-cache"/>
    <meta http-equiv="Expires" content="0"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<%
    Locale locale = request.getLocale();
    String country = request.getParameter("country");
    if ("cn".equals(country)) locale = Locale.CHINA;
    else if ("usa".equals(country)) locale = Locale.US;
    System.out.println(locale);
    ResourceBundle resourceBundle = ResourceBundle.getBundle("i18n", locale);
%>
<a href="i18n.jsp?country=cn">中文</a>|
<a href="i18n.jsp?country=usa">english</a>
<center>
    <h1><%=resourceBundle.getString("register")%>
    </h1>
    <table>
        <form>
            <tr>
                <td><%=resourceBundle.getString("username")%>
                </td>
                <td><input name="username" type="text"/></td>
            </tr>
            <tr>
                <td><%=resourceBundle.getString("password")%>
                </td>
                <td><input type="password"/></td>
            </tr>
            <tr>
                <td><%=resourceBundle.getString("gender")%>
                </td>
                <td><input type="radio"/><%=resourceBundle.getString("male")%><input
                        type="radio"/><%=resourceBundle.getString("female")%>
                </td>
            </tr>
            <tr>
                <td><%=resourceBundle.getString("email")%>
                </td>
                <td><input type="text"/></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="reset" value="<%=resourceBundle.getString("reset")%>"/>&nbsp;&nbsp;
                    <input type="submit" value="<%=resourceBundle.getString("submit")%>"/></td>
            </tr>
        </form>
    </table>
    <br/> <br/> <br/> <br/>
</center>
<%--国际化测试：--%>
<%--1、访问页面，通过浏览器设置，请求头信息确定国际化语言。--%>
<%--2、通过左上角，手动切换语言--%>
</body>
</html>