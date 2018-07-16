<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Add Person</title>
<s:head theme="xhtml"/>
</head>

<body>
	
	<h1>This is an ADD PERSON jsp page</h1>
	<h5 style="font-family: '微软雅黑'">为的是展示新添加的某个person信息</h5>
	<hr>
	
	<s:form action="addPerson" method="post">
		<s:textfield label="id" name="person.id"></s:textfield>
		<s:textfield label="姓名" name="person.name"></s:textfield>
		<s:textfield label="年龄" name="person.age"></s:textfield>
		<s:textfield label="生日" name="person.birthday"></s:textfield>
		<s:textfield label="地址" name="person.address"></s:textfield>
		<s:checkboxlist list="{'游泳','打篮球','踢足球','远足'}" label="爱好" name="hobbies"></s:checkboxlist>
		<s:submit value="提交信息"></s:submit>
	</s:form>
	
	
</body>

</html>



