<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.util.*, java.lang.*" %>
<%@ page import="java.text.*, java.net.InetAddress" %>
<c:set var="path1" value="<%=request.getContextPath() %>" />
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>게시판 글 상세보기</title>
    <jsp:include page="${path1 }/head.jsp" />
  </head>
  <body>
  <jsp:include page="${path1 }/header.jsp" />
  <section class="section">
    <div class="container">
      <h1 class="title">게시판 글 상세보기</h1>
		<table class="table">
		   <tbody>
		    <tr>
		      <th>번호</th>
		      <td>${dto.no }</td>
		    </tr>
		    <tr>
		      <th>제목</th>
		      <td>${dto.title }</td>
		    </tr>
		    <tr>
		      <th>내용</th>
		      <td>${dto.content }</td>
		    </tr>
		    <tr>
		      <th>작성자</th>
		      <td>${dto.email}</td>
		    </tr>
		    <tr> 
		      <th>작성일</th>
		      <td>
		      	<fmt:parseDate value="${dto.regdate }" var="regdate" pattern="yyyy-MM-dd HH:mm:ss" />
		      	<fmt:formatDate value="${regdate }" pattern="yyyy-MM-dd" />
		      </td>
		    </tr>
		  </tbody>
		</table>
		<div class="buttons">
			<a href="${path1 }/GetBoardListCtrl.do" class="button">목록</a>
			<a href="${path1 }/DeleteBoardCtrl.do?no=${dto.no }" class="button">글 삭제</a>
			<a href="${path1 }/ModifyBoardCtrl.do?no=${dto.no }" class="button">글 수정</a>
		</div>
    </div>
  </section>
  <jsp:include page="${path1 }/footer.jsp"></jsp:include>
  </body>
</html>