<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" href="js/bootstrap.min.css" />
	<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理</title>

</head>
<body >
<div align="center">

<c:if test="${User!='ok'}">
<jsp:forward page="/login" />
</c:if>
<br/><br/>
<h1><a style="text-decoration: none;">&nbsp;后台管理</a></h1> <br/> <br/> 
<a href="${pageContext.request.contextPath}/admin/category"><span class="glyphicon glyphicon-send" aria-hidden="true">&nbsp;</span>分类管理</a><br/><br/>
<a href="${pageContext.request.contextPath}/admin/product"><span class="glyphicon glyphicon-send" aria-hidden="true">&nbsp;</span>产品管理</a><br/>
</div>
</body>

</html>