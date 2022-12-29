<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path1" value="${request.getContextPath() }" />
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	
	<title>email</title>
	<jsp:include page="${path1 }/head.jsp" />
	
</head>
<body>
	<h1>test page</h1>
	<h2> email </h2>
	<a href="./email/sendEmail.jsp">메일 보내기</a>
	<a href="<%=request.getContextPath() %>/GetSendEmailListCtrl.do">보낸 메일 목록</a>
	<h2> board </h2>
	<a href="<%=request.getContextPath() %>/GetBoardListCtrl.do">게시판 목록</a>
	<h2> member </h2>
	<a href="<%=request.getContextPath() %>/GetMemberListCtrl.do">회원 목록</a>
	<h2> JoinMember </h2>
	<a href="./member/joinMember.jsp">회원 가입</a>
</body>
</html>