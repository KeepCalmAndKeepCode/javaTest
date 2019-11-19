<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>一个简单的JSP页面</title>
<style>
  img{
    width:200px;
  }
</style>
</head>
<body>
<jsp:include page="top.jsp"/>
<div>
	<%
		Date date = new Date();
  	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  	String today = df.format(date);
  %>
  
  当前时间：<%=today %>

      你好，<%@ include file="./top.jsp" %>
  
  <%String manager = "dgw"; %>
       管理员：<%=manager %>
  <% String url="imgs.png";%>
  <img alt="" src="<%=url%>">
  <%!
  	int number = 0;
  	int count(){
  	  number++;
  	  return number;
  	}
  %>
  <%=count()%>
  </div>
 <%--  <jsp:include page="copyright.jsp"/> --%>
  
  <%--  
  	include指令通过file属性指定被包含的文件，并且file不支持表达式；
  	<jsp:include>通过page属性指定被包含的文件，切支持jsp表达式。
  
  	include指令会将文件原封不动的插入包含页，然后再由JSP编译器将合成后的文件最终编译成Java文件；
  	<jsp:include>执行时会将程序转发到被包含的页面，并在浏览器输出结果然后返回包含页继续执行下边的代码；编译器会分别编译。
  	
  	include包含的文件最终会生成一个文件，所以包含文件中不能有重名的变量或方法；
  	<jsp:include>单独编译不受此影响。
  --%>
  
  <%-- <jsp:forward page="forward.jsp">
  	<jsp:param value="777" name="clearlove"/>
  </jsp:forward> --%>
  
  
  <!-- 此方法类似于js页面跳转传参  -->
  <a href="forward.jsp?id=777">77777</a>
  
  <!-- 此方法类似于WebStroage -->
  
  <%
  	String Money = "money";
  	request.setAttribute("result", Money);
  %>
  
  <%-- <jsp:forward page="deal.jsp" /> --%>
  
  <%
  	response.setHeader("refresh", "10");
  %>
  
  <%
  	out.println("5666");
  %>
</body>
</html>