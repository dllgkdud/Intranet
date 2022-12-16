<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<%@ page import="java.util.*, java.lang.*" %>
<%@ page import="java.text.*, java.net.InetAddress" %>
<%-- <c:set var="path1" value="<%=request.getContextPath() %>" /> --%>
<c:set var="path1" value="${request.getContextPath() }" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Login</title>
</head>
<body>
	<div class="container">
		<h2>로그인</h2>
		<form action="main.do" method="post">
			<table>
				<tr>
					<th><label for="email"><b>Email</b></label></th>
					<td><input type="text" placeholder="Email" name="email" required></td>
				</tr>
				<tr>
					<th><label for="pwd"><b>Password</b></label></th>
					<td><input type="password" placeholder="Password" name="pwd" required></td>
	        	</tr>
	 		</table>
	 	</form>
 		<div>
			<input type="checkbox" checked="checked" name="remember"> Remember
   			<button type="submit">Login</button>
   		</div>
 	</div>
</body>
</html>