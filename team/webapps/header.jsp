<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path2" value="${pageContext.request.contextPath }" />
<div id="nav-group">
	<div class="container navbar navbar-expand-lg">
		<ul class="navbar-nav mr-auto" > 
            <li class="nav-item" style="list-style: none;">
                <a class="nav-link" href="mail.html" style="color: rgba(232, 230, 227, 0.5);">전자메일</a>
            </li>
            <li class="nav-item" style="list-style: none;">
                <a class="nav-link" href="approval.html" style="color: rgba(232, 230, 227, 0.5);">전자결제</a>
            </li>
            <li class="nav-item" style="list-style: none;">
                <a class="nav-link" href="board.html" style="color: rgba(232, 230, 227, 0.5);">게시판</a>
            </li>
            <li class="nav-item" style="list-style: none;">
                <a class="nav-link" href="board2.html" style="color: rgba(232, 230, 227, 0.5);">자료실</a>
            </li>
            <li class="nav-item" style="list-style: none;">
                <a class="nav-link" href="reservation.html" style="color: rgba(232, 230, 227, 0.5);">예약서비스</a>
            </li>
        </ul>
        <ul class="navbar-nav" style="margin-right:250px;">
          	<li class="nav-item" style="list-style: none;">
              	<span class="nav-link" style="color: rgba(232, 230, 227, 0.5);">${sid }
              	</span>
          	</li>
          	<li class="nav-item" style="list-style: none;">
				<a class="nav-link" href="#" style="color: rgba(232, 230, 227, 0.5);">로그아웃</a>
	          </li>
	          <li class="nav-item" style="list-style: none;">
	              <a class="nav-link" href="mypage.html" style="color: rgba(232, 230, 227, 0.5);">인사정보</a>
	          </li>
	          <li class="nav-item" style="list-style: none;">
	            <a class="nav-link" href="sitemap.html" style="color: rgba(232, 230, 227, 0.5);">사이트맵</a>
	        </li>
		</ul>
		<div class="navbar-end" id="tnb">
			<%-- <c:if test="${empty sid }">
				<a class="button is-primary" href="${path0 }/user/userAgree.jsp"><strong>회원가입</strong></a>
	        </c:if> --%>
	        <c:if test="${not empty sid }">
				<a class="button is-light" href="${path0 }/UserLogoutCtrl.do">로그아웃</a>	        
				<a class="button is-primary" href="${path0 }/UserInfoCtrl.do"><strong>인사정보</strong></a>
				<c:if test='${sid.equals("admin@naver.com") }'>
					<a class="button is-light" href="${path0 }/GetAdminCtrl.do">관리자</a>
				</c:if>
	        </c:if>
		</div>
		<div class="navbar-start" id="gnb">
			<div class="navbar-item">
				<a class="navbar-item" href="<%=request.getContextPath() %>/"><img src="#" alt=""></a>
				<a href="#">전자메일</a>
				<a href="${path2 }/GetSignListCtrl.do">전자결재</a>
				<a href="${path2 }/GetBoardListCtrl.do">게시판</a>
				<a href="#">자료실</a>
				<a href="${path2 }/WriteMemberCtrl.do">예약서비스</a>
			</div>
		</div>
	</div>
</div>