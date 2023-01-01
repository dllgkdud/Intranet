<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path2" value="${pageContext.request.contextPath }" />
<div id="nav-group">
	<div class="container">
		<div class="navbar-end" id="tnb">
			<%-- <c:if test="${empty sid }">
				<a class="button is-primary" href="${path0 }/user/userAgree.jsp"><strong>회원가입</strong></a>
	        </c:if> --%>
	        <c:if test="${not empty sid }">
				<a class="button is-light" href="${path0 }/UserLogoutCtrl.do">로그아웃</a>	        
				<a class="button is-primary" href="${path0 }/UserInfoCtrl.do"><strong>인사정보</strong></a>
				<c:if test='${sid.equals("admin@naver.com") }'>
					<a class="button is-light" href="${path0 }/AdminCtrl.do">관리자</a>
				</c:if>
	        </c:if>
		</div>
		<div class="navbar-start" id="gnb">
			<div class="navbar-item">
				<a class="navbar-item" href="<%=request.getContextPath() %>/"><img src="#" alt=""></a>
				<a href="#">전자메일</a>
				<a href="${path2 }/GetSignListCtrl.do">전자결재</a>
				<a href="${path2 }/GetBoardListCtrl.do">게시판</a>
				<a href="${path2 }/GetDownBoardList.do">자료실</a>
				<a href="#">예약서비스</a>
			</div>
		</div>
	</div>
</div>