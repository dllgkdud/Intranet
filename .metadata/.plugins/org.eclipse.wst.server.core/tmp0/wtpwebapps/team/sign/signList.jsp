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
						<th><abbr title="Sno">번호</abbr></th>
						<th><abbr title="Title">제목</abbr></th>
						<th><abbr title="Email">결재자</abbr></th>
						<th><abbr title="State">결재상태</abbr></th>
						<th><abbr title="RegDate">결재일</abbr></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${signList }" var="dto" varStatus="no">
					<tr>
						<td><span>${dto.no }</span></td>
						<td>
							<c:if test='${empty sid }'>
								<span>${dto.title }</span>
							</c:if>
							<c:if test='${sid.equals(dto.email) || sid.equals("admin@naver.com")}'>
								<a href="${path1 }/GetSignDetailCtrl.do?no=${dto.sno }">${dto.title }</a>
							</c:if>
						</td>
						<td>${dto.sid }</td>
						<td>
							<c:if test='${dto.state==0 }'>
								<span>결재처리</span>
							</c:if>
							<c:if test='${dto.state==1 }'>
								<span>결재진행</span>
							</c:if>
							<c:if test='${dto.state==2 }'>
								<span>결재완료</span>
							</c:if>
						</td>
						<td>
							<fmt:parseDate value="${dto.regdate }" var="regdate" pattern="yyyy-MM-dd"></fmt:parseDate>
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			<c:if test='${not empty sid}'>
			<div class="buttons">
				<a href="#" class="button is-primary">작성</a>
			</div>
			</c:if>
		</div>
	</section>
	<jsp:include page="${path1 }/footer.jsp" />
</body>
</html>