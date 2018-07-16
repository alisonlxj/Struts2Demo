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
	
	<s:iterator value="people" status="person">
		id：<s:property value="person.id" />
		姓名：<s:property value="person.name" />
		年龄：<s:property value="person.age" />
		生日：<s:property value="person.birthday" />
		地址：<s:property value="person.address" />
	</s:iterator>
	
</body>

</html>