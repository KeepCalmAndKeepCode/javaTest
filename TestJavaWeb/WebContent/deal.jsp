<%@page import="java.net.URLEncoder"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
	<head>
  	<meta charset="utf-8">
  	<title></title>
	</head>
	<body>
		<%-- <%
			String message = request.getAttribute("result").toString();
		%>
		<%=message %> --%>
		
		<%
			request.setCharacterEncoding("GB18030");
			String user = URLEncoder.encode(request.getParameter("user"),"utf-8");
			
			Cookie cookie = new Cookie("mrCookie",user+"#"+new java.util.Date().toLocaleString());
			cookie.setMaxAge(60*60*24*30);
			response.addCookie(cookie);
			
		%>
	</body>
	<script>
		window.location.href="cookie.jsp"
	</script>	
</html>