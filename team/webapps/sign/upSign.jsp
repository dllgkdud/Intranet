<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<%@ page import="java.util.*, java.lang.*" %>
<%@ page import="java.text.*, java.net.InetAddress" %>
<c:set var="path1" value="<%=request.getContextPath() %>" />
<%-- <c:set var="path1" value="${request.getContextPath() }" /> --%>
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
			<form action="${path1 }/UpSignProCtrl.do" method="post">
			<input type="hidden" name="sno" id="sno" value="${dto.sno }"/>
				<table class="table">
					<tbody>
						<tr>
							<th><label for="title">결재제목</label></th>
							<td><input type="text" name="title" id="title" class="input is-info" placeholder="제목" value="${dto.title }" required></td>
						</tr>
						<tr>
							<th><label for="content">결재내용</label></th>
							<td><textarea cols="100" rows="10" name="content" id="content" class="textarea is-info" maxlength="900" placeholder="내용" style="resize:none;" required>${dto.content }</textarea></td>
						</tr>
					</tbody>
				</table>
				<c:if test='${not empty sid}'>
				<div class="buttons">
					<a href="${path1 }/GetSignListCtrl.do" class="button is-light">목록</a>
					<button type="submit" class="button is-primary">수정</button>
				</div>
				</c:if>
			</form>
		</div>
	</section>
	<jsp:include page="${path1 }/footer.jsp" />
</body>
</html>