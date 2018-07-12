<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
  <!-- 引入BootStrap的CSS -->
<link rel="stylesheet" type="text/css" href="/Springmvc002/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/Springmvc002/bootstrap/css/bootstrap-theme.min.css" />
 
<!-- 引入JS-->
<script type="text/javascript" src="/bootstrap/js/jquery-1.4.2.min.js" ></script>
<script type="text/javascript" src="/bootstrap/js/bootstrap.min.js" ></script>
  
  
  
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	
	<meta charset="utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  
  	<h2> This is my JSP page. </h2>
  
	<div class="container">
		<div class="row">
			<div class='col-sm-2'>姓名</div>
			<div class='col-sm-10'><input type="text" name="name" value="请输入您的名字"></div>
		</div>
	
	</div>
    
  </body>
</html>






