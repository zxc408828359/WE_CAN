<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理</title>

</head>
<body >
<div align="center">
<c:if test="${User!='ok'}">
<jsp:forward page="/login" />
</c:if>
<h1>后台管理 </h1>
<form action="${pageContext.request.contextPath }/admin/addcategory" method="post">
	<font color="red">${err}</font><br/>
	分类名称：<input type="text" name="categoryName" ><br/><br/>
	
	<input type="submit" value="提交">
</form></div>
</body>

</html>