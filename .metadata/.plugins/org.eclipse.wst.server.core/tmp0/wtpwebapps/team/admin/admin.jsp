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
	<title>Admin</title>
	<jsp:include page="${path1 }/head.jsp" />
</head>
<body>
	<jsp:include page="${path1 }/header.jsp" />
	<section class="section">
		<div class="container-scroller">
			<nav class="sidebar sidebar-offcanvas" id="sidebar">
	          	<ul class="nav">
	            	<li class="nav-item profile">
		              <div class="profile-desc">
		                <div class="profile-pic">
		                  <div class="count-indicator">
		                    <img class="img-xs rounded-circle " src="https://cdn-icons-png.flaticon.com/512/4623/4623635.png" alt="member">
		                    <span class="count bg-success"></span>
		                  </div>
		                  <div class="profile-name">
		                    <h5 class="mb-0 font-weight-normal">ADMIN</h5>
		                    <span>관리자 계정</span>
		                  </div>
		                </div>
		                <div class="dropdown-menu dropdown-menu-right sidebar-dropdown preview-list" aria-labelledby="profile-dropdown">
		                  <a href="#" class="dropdown-item preview-item">
		                    <div class="preview-thumbnail">
		                      <div class="preview-icon bg-dark rounded-circle">
		                        <i class="mdi mdi-settings text-primary"></i>
		                      </div>
		                    </div>
		                    <div class="preview-item-content">
		                      <p class="preview-subject ellipsis mb-1 text-small">Account settings</p>
		                    </div>
		                  </a>
		                  <div class="dropdown-divider"></div>
		                  <a href="#" class="dropdown-item preview-item">
		                    <div class="preview-thumbnail">
		                      <div class="preview-icon bg-dark rounded-circle">
		                        <i class="mdi mdi-onepassword  text-info"></i>
		                      </div>
		                    </div>
		                    <div class="preview-item-content">
		                      <p class="preview-subject ellipsis mb-1 text-small">Change Password</p>
		                    </div>
		                  </a>
		                  <div class="dropdown-divider"></div>
		                  <a href="#" class="dropdown-item preview-item">
		                    <div class="preview-thumbnail">
		                      <div class="preview-icon bg-dark rounded-circle">
		                        <i class="mdi mdi-calendar-today text-success"></i>
		                      </div>
		                    </div>
		                    <div class="preview-item-content">
		                      <p class="preview-subject ellipsis mb-1 text-small">To-do list</p>
		                    </div>
		                  </a>
		                </div>
		              </div>
	            	</li>
		            <li class="nav-item nav-category">
		              <span class="nav-link">현재 페이지 기능</span>
		            </li>
		            <li class="nav-item menu-items">
		              <a class="nav-link" href="index.html">
		                <span class="menu-icon">
		                  <i class="mdi mdi-speedometer"></i>
		                </span>
		                <span class="menu-title">전체문서</span>
		              </a>
		            </li>
		            <li class="nav-item menu-items">
		              <a class="nav-link" href="index.html">
		                <span class="menu-icon">
		                  <i class="mdi mdi-speedometer"></i>
		                </span>
		                <span class="menu-title">문서작성</span>
		              </a>
		            </li>
		            <li class="nav-item menu-items">
		              <a class="nav-link" href="pages/forms/basic_elements.html">
		                <span class="menu-icon">
		                  <i class="mdi mdi-playlist-play"></i>
		                </span>
		                <span class="menu-title">결재대기</span>
		              </a>
		            </li>
		            <li class="nav-item menu-items">
		              <a class="nav-link" href="pages/tables/basic-table.html">
		                <span class="menu-icon">
		                  <i class="mdi mdi-table-large"></i>
		                </span>
		                <span class="menu-title">결재완료</span>
		              </a>
		            </li>
	            	<li class="nav-item menu-items">
		                <a class="nav-link" href="pages/tables/basic-table.html">
		                  <span class="menu-icon">
		                    <i class="mdi mdi-table-large"></i>
		                  </span>
		                  <span class="menu-title">결재보류</span>
		                </a>
					</li> 
	          	</ul>
	        </nav>
	    </div>
		<div class="container">
			<h2>${sid }님 환영합니다.</h2>
		</div>
	</section>
	<jsp:include page="${path1 }/footer.jsp" />
</body>
</html>