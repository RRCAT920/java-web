<%@ page import="pojo.Person" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%--
  User: huzihao
  Date: 2020/10/22
  Time: 02:38
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>输出复杂Bean对象</title>
</head>
<body>
<%
    Person person = new Person();
    person.setName("李容蓉");
    person.setPhones(new String[]{"123123", "123213123", "2123123123"});
    person.setCities(Arrays.asList("长沙", "贵阳", "北京"));
    Map<String, Object> map = new HashMap<>();
    map.put("key1", "value1");
    map.put("key2", "value2");
    map.put("key3", "value3");
    person.setMap(map);

    pageContext.setAttribute("p", person);
%>
Person对象: ${p}<br>
name: ${p.name}<br>
phones: ${Arrays.toString(p.phones)}<br>
phone0: ${p.phones[0]}<br>
cities: ${p.cities}<br>
city0: ${p.cities[0]}<br>
map: ${p.map}<br>
map.key1: ${p.map.key1}<br>
</body>
</html>
