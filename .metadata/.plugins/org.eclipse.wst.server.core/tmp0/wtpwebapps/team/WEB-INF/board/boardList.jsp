<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<%@ page import="java.util.*, java.lang.*" %>
<%@ page import="java.text.*, java.net.InetAddress" %>
<c:set var="path1" value="<%=request.getContextPath() %>" />
<c:set var="path1" value="${pageContext.request.contextPath }" /> 
<!DOCTYPE html>
<html>
 <head>
   <meta charset="UTF-8">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <title>게시판 목록</title>
   <jsp:include page="/head.jsp" />
 </head>
 <body>
 <jsp:include page="/header.jsp" />
 <section class="section">
   <div class="container">
     <h1 class="title">게시판 목록</h1>
	<table class="table">
	  <thead>
	    <tr>
	      <th><abbr title="No">No</abbr></th>
	      <th><abbr title="Title">Title</abbr></th>
	      <th><abbr title="Id">Id</abbr></th>
	      <th><abbr title="Result">Regdate</abbr></th>
	    </tr>
	  </thead>
	   <tbody>
	   <c:forEach items="${list }" var="dto" varStatus="status">
	    <tr>
	      <td>${status.count }</td> 
	      <td><a href="${path1 }/GetBoardDetailCtrl.do?no=${dto.no }">${dto.title }</a></td>
	      <td><a href="${path1 }/GetBoardDetailCtrl.do?no=${dto.no }">${dto.id }</a></td>
	      <td>
	      	<fmt:parseDate value="${dto.regdate }" var="regdate" pattern="yyyy-MM-dd HH:mm:ss" />
	      	<fmt:formatDate value="${regdate }" pattern="yyyy-MM-dd" />
	    </tr>
	    </c:forEach>
		<c:if test="${empty list }">
	    <tr>
	    	<td colspan="3">해당 데이터 목록이 없습니다.</td>
	    </tr>
	    </c:if>
	  </tbody>
	</table>
	<div class="buttons">
	  <a href="${path1 }/board/writeBoard.jsp">글 작성</a>
	</div>
   </div>
 </section>
 <jsp:include page="/footer.jsp"></jsp:include>
  </body>
</html>