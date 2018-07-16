<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Add Person</title>
</head>

<body>
	
	<h1>This is an ADD PERSON jsp page</h1>
	<h5 style="font-family: '微软雅黑'">为的是展示新添加的某个person信息</h5>
	<hr>
	
	<form action="addPerson" method="post">
		id：<input type="text" name="person.id"> <br>
		姓名:<input type="text" name="person.name"> <br/>
		年龄: <input type="text" name="person.age"> <br>
		生日：<input type="text" name="person.birthday"> <br>
		地址:<input type="text" name="person.address"> <br>
		<input type="submit" value="提交">
	</form>
	
</body>

</html>



