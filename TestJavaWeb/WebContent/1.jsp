<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title></title>
</head>
<body>
  <jsp:useBean id="javaBeantest" class="com.javaBeantest" scope="page"></jsp:useBean>
  
  <%=javaBeantest.getName() %>
</body>
</html>