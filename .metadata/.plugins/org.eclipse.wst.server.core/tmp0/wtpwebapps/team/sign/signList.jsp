<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<%@ page import="java.util.*, java.lang.*" %>
<%@ page import="java.text.*, java.net.InetAddress" %>
<c:set var="path1" value="<%=request.getContextPath() %>" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>전자결재</title>
	
	<jsp:include page="${path1 }/head.jsp" />	
</head>
<body>
	<jsp:include page="${path1 }/header.jsp" />
	<div class="select">
		<select name="select" id="select" required>
			<option value="">전체</option>
			<option value="<%=request.getContextPath() %>/GetWait.do">결재대기</option>
			<option value="<%=request.getContextPath() %>/GetComplete.do">결재완료</option>
		</select>
	</div>
	<table class="sign-table">
		<thead>
			<tr>
				<th>No</th>
				<th>Title</th>
				<th>Id</th>
				<th>RegDate</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${list }" var="dto" varStatus="status">
			<tr>
				<td>${status.count }</td>
				<td><a href="${path1 }/GetSignDetailCtrl.do?sid=${dto.sid }">${dto.title }</a></td>
				<td>${dto.sid }</td>
				<td>${dto.regdate }</td>
			</tr>
		</c:forEach>
		<c:if test="${empty list }">
			<tr>
				<td colspan="4">결재 항목이 존재하지 않습니다.</td>
			</tr>
		</c:if>
		</tbody>
	</table>
	<button id="signOpen">결재처리</button>
	<jsp:include page="${path1 }/footer.jsp" />
</body>
</html>