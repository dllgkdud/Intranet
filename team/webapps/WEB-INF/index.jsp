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
	<jsp:include page="${path1 }/head.jsp" />
</head>
<body>
	<section class="section">
		<div class="container">
			<h1 class="title">로그인</h1>
			<form action="${path1 }/UserLoginCtrl.do" method="post">
				<div class="table">
					<input type="text" name="email" id="email" class="input is-info is-rounded " placeholder="이메일" required>
					<input type="password" name="pw" id="pw" class="input is-info is-rounded " placeholder="비밀번호" required>
				</div>
				<div class="buttons">
					<button type="submit" class="button is-primary">로그인</button>			
				</div>
			</form>				
		</div>
	</section>
</body>
</html>