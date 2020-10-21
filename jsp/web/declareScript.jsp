<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%--
  User: huzihao
  Date: 2020/10/21
  Time: 22:42
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>声明脚本</title>
</head>
<body>
<%!
    private Integer id;
    private String name;
    private static final Map<String, Object> map;

    static {
        map = new HashMap<>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private static class A {
        private Integer id;
        private String foo = "bar";
    }
%>
</body>
</html>
