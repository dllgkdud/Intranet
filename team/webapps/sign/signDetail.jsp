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
				<tbody>
					<tr>
						<th>결재번호</th>
						<td><span>${vo.sno }</span></td>
					</tr>
					<tr>
						<th>결재제목</th>
						<td><span>${vo.title }</span></td>
					</tr>
					<tr>
						<th>결재내용</th>
						<td>
							<c:if test='${sid.equals(vo.email) || sid.equals("admin@naver.com")}'>
								<span>${vo.content }</span>
							</c:if>
						</td>
					</tr>
					<tr>
						<th>결재자</th>
						<td>${vo.email }</td>
					</tr>
					<tr>
						<th>결재상황</th>
						<td>
							<c:if test='${vo.state==0 }'>
								<span>결재처리</span>
							</c:if>
							<c:if test='${vo.state==1 }'>
								<span>결재진행</span>
							</c:if>
							<c:if test='${vo.state==2 }'>
								<span>결재완료</span>
							</c:if>
						</td>
					</tr>
					<tr>
						<th>결재일</th>
						<td>
							<fmt:parseDate value="${vo.regdate }" var="regdate" pattern="yyyy-MM-dd"></fmt:parseDate>
							<fmt:formatDate value="${regdate }" pattern="yyyy-MM-dd" />
						</td>
					</tr>
				</tbody>
			</table>
			<div class="buttons">
				<a href="${path1 }/GetSignListCtrl.do" class="button is-light">목록</a>
				<a href="${path1 }/DelSignCtrl.do?sno=${vo.sno }" class="button is-light">삭제</a>
				<a href="${path1 }/UpSignCtrl.do?sno=${vo.sno }" class="button is-primary">수정</a>
			</div>
		</div>
	</section>
	<jsp:include page="${path1 }/footer.jsp" />
</body>
</html>