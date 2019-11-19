<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.*" %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%
  try{
  	Class.forName("com.mysql.jdbc.Driver");
  	String url = "jdbc:mysql://localhost:3306/samp_db";
  	String username = "root";
  	String password = "111111";
  	Connection conn = DriverManager.getConnection(url,username,password);
  	out.println(conn);
  	if(conn != null){
  		out.println("数据库连接成功");
  		conn.close();
  	}else{
  		out.println("数据库连接失败");
  	}
  } catch(ClassNotFoundException e) {
  	e.printStackTrace();
  } catch(SQLException e){
  	e.printStackTrace();
  }

%>
</body>
</html>