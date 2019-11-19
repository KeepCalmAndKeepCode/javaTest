<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html" import="java.util.*" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form action="check.jsp">
           用户名：<input type="text" name="uname"/><br/>
           密    码：<input type="password" name="upwd"/><br/>
    <input type="submit" value="登录">
  </form>
</body>
</html>