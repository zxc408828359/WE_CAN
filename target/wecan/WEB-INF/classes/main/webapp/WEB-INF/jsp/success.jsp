<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理</title>
	<link rel="stylesheet" href="js/bootstrap.min.css" />
	<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>


<body> 
<c:if test="${User!='ok'}">
<jsp:forward page="/login" />
</c:if>
<div align="center">

<h1>后台管理 </h1>
成功<br/><br/>
<a href="${pageContext.request.contextPath}/mun"><button>返回</button></a>
</div>
</body>
</html>