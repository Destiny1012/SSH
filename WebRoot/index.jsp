<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<title>index</title>
<link rel="stylesheet" type="text/css" href="resource/css/main.css">
</head>

<body>
	<ul class="menu">
		<li><a href="user/goToSave" target="_blank">增</a></li>
		<li><a href="user/goToDelete" target="_blank">删</a></li>
		<li><a href="user/goToUpdate" target="_blank">改</a></li>
		<li><a href="user/goToGet" target="_blank">查</a></li>
	</ul>
</body>
</html>
