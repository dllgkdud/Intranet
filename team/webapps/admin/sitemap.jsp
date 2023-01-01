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
	<title>SiteMap</title>
	<jsp:include page="${path1 }/head.jsp" />
</head>
<body>
	<jsp:include page="${path1 }/header.jsp" />
	<div class="container-scroller">
		<nav class="sidebar sidebar-offcanvas" id="sidebar"></nav>
		<section class="page" style="background-color: #191c24; color: white; position: absolute; margin-top: 100px; margin-left: 500px;">
	          <div class="page_wrap">
	              <div class="frm">
	                  <nav class="sitemap_area">
	                    <ul class="menu menu1">
	                        <li class="item1">
	                            <a href="" class="dp1">전자메일</a>
	                            <ul class="sub">
	                                <li><a href="product.html#page1">전체메일함</a></li>
	                                <li><a href="product.html#page2">받은메일함</a></li>
	                                <li><a href="product.html#page3">보낸메일함</a></li>
	                                <li><a href="product.html#page3">임시보관함</a></li>
	                                <li><a href="product.html#page3">내게쓴메일함</a></li>
	                                <li><a href="product.html#page3">휴지통</a></li>
	                            </ul>
	                        </li>
	                        <li class="item2">
	                            <a href="" class="dp1">전자결제</a>
	                            <ul class="sub">
	                                <li><a href="technology.html#page1">전체문서</a></li>
	                                <li><a href="technology.html#page2">문서작성</a></li>
	                                <li><a href="technology.html#page2">결재대기</a></li>
	                                <li><a href="technology.html#page2">결재완료</a></li>
	                                <li><a href="technology.html#page2">결재보류</a></li>
	                            </ul>
	                        </li>
	                        <li class="item3">
	                            <a href="" class="dp1">게시판</a>
	                            <ul class="sub">
	                                <li><a href="esg.html#page1"></a></li>
	                                <li><a href="esg.html#page2"></a></li>
	                                <li><a href="esg.html#page3"></a></li>
	                            </ul>
	                        </li>
	                        <li class="item4">
	                            <a href="" class="dp1">자료실</a>
	                            <ul class="sub">
	                                <li><a href="company.html#page1"></a></li>
	                                <li><a href="company.html#page2"></a></li>
	                                <li><a href="company.html#page3"></a></li>
	                            </ul>
	                        </li>
	                        <li class="item5">
	                            <a href="" class="dp1">예약서비스</a>
	                            <ul class="sub">
	                                <li><a href="invest.html#page1">예약현황</a></li>
	                                <li><a href="invest.html#page2">차량신청</a></li>
	                                <li><a href="invest.html#page3">휴가신청</a></li>
	                                <li><a href="invest.html#page3">회의실예약</a></li>
	                            </ul>
	                        </li>
						</ul>
					</nav>
				</div>
			</div>
		</section>
	</div>
	<jsp:include page="${path1 }/footer.jsp" />	
</body>
</html>