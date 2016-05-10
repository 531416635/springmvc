<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>首页</title>
</head>
<body>
	<h1>Hello world!</h1>
	<h3><a href="<%=path %>/items1name.action">查询商品列表BeanNameUrlHandlerMapping	SimpleControllerHandlerAdapter</a></h3>
	<h3><a href="<%=path %>/items1.action">查询商品列表simpleUrlHandlerMapping	SimpleControllerHandlerAdapter</a></h3>
	<h3><a href="<%=path %>/items2.action">查询商品列表simpleUrlHandlerMapping	HttpRequestHandlerAdapter</a></h3>
	<h3><a href="<%=path %>/queryItem.action">查询商品列表	注解映射器和适配器</a></h3>
</body>
</html>
