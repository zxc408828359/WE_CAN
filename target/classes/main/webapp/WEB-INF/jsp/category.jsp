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


<body> 
<c:if test="${User!='ok'}">
<jsp:forward page="/login" />
</c:if>
<div align="center">

<h1><a style="text-decoration: none;">后台管理</a></h1> 
<br>${err}
<c:forEach items="${list}" var="cat">

<img src="${pageContext.request.contextPath}/web/imgaes/doc.png" style="width: 22px;height: 22px;" />|<a href="${pageContext.request.contextPath}/admin/item?cid=${cat.categoryId}">
${cat.categoryName}</a>|
<a href="${pageContext.request.contextPath}/admin/categoryDel?cid=${cat.categoryId}">
<button >删除</button></a><br/><br/>
</c:forEach>

> <a href="${pageContext.request.contextPath}/addcat">
<button >添加分类</button></a> <
<br/> <br/>
> <a href="${pageContext.request.contextPath}/mun"><button>返回</button></a> <
</div>
</body>

</html>