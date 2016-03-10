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
<title>save</title>
<link rel="stylesheet" type="text/css" href="resource/css/main.css">
</head>

<body>
	<form action="user/save" class="table">
		<ul>
			<li style="margin-top: 0;">
				<label>Email：</label>
				<input type="text" name="email" placeholder="请输入Email">
			</li>
			<li>
				<label>密码：</label>
				<input type="password" name="password" placeholder="请输入密码">
			</li>
			<li>
				<label>手机：</label>
				<input type="text" name="phone" placeholder="请输入手机">
			</li>
			<li>
				<label>QQ：</label>
				<input type="text" name="qq" placeholder="请输入QQ">
			</li>
			<li>
				<input type="submit" value="提交" style="margin-left: 50px;width: 150px;cursor: pointer;">
			</li>
		</ul>
	</form>
</body>
</html>
