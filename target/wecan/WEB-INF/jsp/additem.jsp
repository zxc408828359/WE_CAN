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
<form action="${pageContext.request.contextPath }/admin/additem" method="post" enctype="multipart/form-data">
	<font color="red">${err}</font><br/>
	商品名称：<input type="text" name="itemName" ><br/><br/>
	<input type="hidden" value="${cid}" name="carId">
	<div style="margin-left: 83px">
	封面图片：<input type="file" name="file1" ><br/><br/>
	参数图片：<input type="file" name="file2" multiple="multiple" ><br/><br/>
	</div>
	商品信息：<br/><br/><textarea rows="5" cols="35" name="itemInfo"></textarea>
	<br/><br/>
	<input type="submit" value="提交">
</form></div>
</body>

</html>