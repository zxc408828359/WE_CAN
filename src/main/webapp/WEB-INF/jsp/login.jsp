<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<link rel="stylesheet" href="js/bootstrap.min.css" />
	<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>后台管理</title>
</head>
<body >
<div align="center">
<br/><br/>
<h1>   &nbsp;&nbsp;&nbsp;后台管理 </h1>
<form action="${pageContext.request.contextPath }/admin/login" method="post">
	<font color="red">${err}</font><br/>
	<label for="exampleInputEmail2">用户名：</label><input type="text" name="username" ><br/><br/>
	<label for="exampleInputEmail2">密码：&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="password" name="password" ><br/><br/>
	<input style="margin-left: 25px" type="submit" value="提交"   class="btn btn-success"></input>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<button type="button" class="btn btn-primary">首页</button>
</form></div>
</body>

</html>