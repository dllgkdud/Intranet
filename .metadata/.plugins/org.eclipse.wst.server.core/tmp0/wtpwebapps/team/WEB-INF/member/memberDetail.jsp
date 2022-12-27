<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<%@ page import="java.util.*, java.lang.*" %>
<%@ page import="java.text.*, java.net.InetAddress" %>
<c:set var="path1" value="<%=request.getContextPath() %>" />
<%-- <c:set var="path1" value="${pageContext.request.contextPath }" />   --%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>회원 상세보기</title>
  </head>
  <body>
  <jsp:include page="/header.jsp" />
  <section class="section">
    <div class="container">
      <h1 class="title">회원 상세보기</h1>
		<table class="table">
		   <tbody>
		    <tr>
		      <th>아이디</th>
		      <td>${dto.id }</td>
		    </tr>
		    <tr>
		      <th>비밀번호</th>
		      <td>${dto.pw }</td>
		    </tr>
		    <tr>
		      <th>이름</th>
		      <td><p>${dto.name }</p></td>
		    </tr>
		    <tr> 
		      <th>전화번호</th>
		      <td><p>${dto.tel }</p></td>
		     </tr>
		     <tr>
		      <th>이메일</th>
		      <td><p>${dto.email }</p></td>
		    </tr>
		    <tr>
		      <th>주소</th>
		      <td><p>${dto.addr }</p></td>
		    </tr>
		    <tr>
		      <th>가입일</th>
		      <td><p>${dto.regdate }</p></td>
		    </tr>
		  </tbody>
		</table>
		<div class="button">
		  <a href="${path1 }/GetMemberListCtrl.do" class="button">목록</a>
		</div>
		<div class="button">
		  <a href="${path1 }/MemberInfoCtrl.do" class="button">회원 수정</a>
		</div>
    </div>
  </section>
  <jsp:include page="/footer.jsp"></jsp:include>
  </body>
</html>