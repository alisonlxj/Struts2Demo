<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="com.alison.pojo.Person, java.util.List"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

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
	
	<s:iterator value='people' var="person">
		<br>id：${person.id}<br>
		姓名：${person.name }<br>
		年龄：${person.age }<br>
		生日：${person.birthday }<br>
		地址：${person.address}
		<hr style="width='30%';">
	</s:iterator>

	
</body>

</html>