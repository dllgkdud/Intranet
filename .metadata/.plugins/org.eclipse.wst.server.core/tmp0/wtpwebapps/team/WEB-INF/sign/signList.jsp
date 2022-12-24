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
	<title>Sign</title>
	<jsp:include page="${path1 }/head.jsp" />
</head>
<body>
	<jsp:include page="${path1 }/header.jsp" />
	<section class="section">
		<div class="container">
			<h2></h2>
			<table class="table">
				<thead>
					<tr>
						<th><abbr title="Sno"></abbr></th>
						<th><abbr title="Title"></abbr></th>
						<th><abbr title="Content"></abbr></th>
						<th><abbr title="Sid"></abbr></th>
						<th><abbr title="State"></abbr></th>
						<th><abbr title="RegDate"></abbr></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${signList }" var="dto" varStatus="no">
					<tr>
						<td><span>${dto.sno }</span></td>
						<td>
							<c:if test='${empty sid }'>
								<span>${dto.title }</span>
							</c:if>
							<c:if test='${sid.equals(dto.sid) || sid.equals("admin")}'>
								<a href="${path1 }/GetSignDetailCtrl.do?no=${dto.no }">${dto.title }</a>
							</c:if>
						</td>
						<td>${dto.sid }</td>
						<td>
							<fmt:parseDate value="${dto.regDate }" var="regdate" pattern="yyyy-MM-dd"></fmt:parseDate>
							<fmt:formatDate value="${regdate }" pattern="yyyy-MM-dd" />
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			<c:if test='${not empty sid}'>
			<div class="buttons">
				<a href="${path1 }/sign/signList.jsp" class="button is-primary">작성</a>
			</div>
			</c:if>
		</div>
	</section>
	<jsp:include page="${path1 }/footer.jsp" />
</body>
</html>