<%@page import="com.spring.org.aboutBean.person"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>这是测试标题</title>
</head>
<body>
<%  WebApplicationContext ctx= WebApplicationContextUtils.getWebApplicationContext(application);
	person p=ctx.getBean("p1",person.class);
	person p1=ctx.getBean("p1",person.class);
	out.println(p==p1);
%>
</body>
</html>