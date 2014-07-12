<!DOCTYPE html>

<%@page import="java.net.InetAddress"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		<h1>Viettel.One service</h1>
		IP Address: <% out.print(InetAddress.getLocalHost().getHostAddress()); %>
	</body>
</html>
