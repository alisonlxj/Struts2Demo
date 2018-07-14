<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="com.alison.pojo.Person, java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Show The Person</title>
</head>

<body>
	
	<h1>This is the SHOW SOME PERSON jsp page</h1>
	<hr>
	<h3>成功找到了所有人员</h3>
	<% 
		List<Person> people = (List<Person>)request.getAttribute("people");
		for(Person person : people){ %>
			<%=person %><br/>
	<%	} 
	%>
	
</body>

</html>