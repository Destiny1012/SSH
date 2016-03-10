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
<title>get</title>
<link rel="stylesheet" type="text/css" href="resource/css/main.css">
</head>

<body>
	<form action="user/get" class="table">
		<input type="text" name="id" placeholder="请输入ID">
		<input type="submit" value="执行" style="width: 80px; height:30px;">
	</form>
</body>
</html>
