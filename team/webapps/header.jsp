<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path2" value="${pageContext.request.contextPath }" />
<div id="nav-group">
	<div class="container navbar navbar-expand-lg">
		<ul class="navbar-nav mr-auto">
			<li class="sidebar-brand-wrapper align-items-left fixed-top logo">
      			<a class="sidebar-brand brand-logo" href="${path1}/GetMainCtrl.do"><img src="${path1 }/assets/images/logo.png" alt="logo"/></a>
    		</li>
            <li class="nav-item">
                <a class="nav-link" href="mail.html">전자메일</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${path2 }/GetSignListCtrl.do">전자결제</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${path2 }/GetBoardListCtrl.do">게시판</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${path2 }/GetDownBoardList.do">자료실</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${path2 }/WriteMemberCtrl.do">예약서비스</a>
            </li>
        </ul>
        <c:if test="${not empty sid }">
        <ul class="navbar-nav" style="margin-right:250px;">
          	<li class="nav-item" style="list-style: none;">
              	<span class="nav-link">${sid }</span>
          	</li>
          	<li class="nav-item">
				<a class="nav-link" href="${path0 }/UserLogoutCtrl.do">로그아웃</a>
	        </li>
	        <li class="nav-item">
	            <a class="nav-link" href="${path0 }/UserInfoCtrl.do">인사정보</a>
	        </li>
	        <c:if test='${sid.equals("admin@naver.com") }'>
	        <li class="nav-item">
				<a class="nav-link" href="${path0 }/GetAdminCtrl.do">관리자</a>
			</li>
			</c:if>
	        <li class="nav-item">
	            <a class="nav-link" href="${path0 }/GetMapCtrl.do">사이트맵</a>
			</li>
		</ul>
		</c:if>
	</div>
</div>