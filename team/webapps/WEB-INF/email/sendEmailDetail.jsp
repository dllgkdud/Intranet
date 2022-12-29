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
    <title>보낸 이메일 상세보기</title>
  </head>
  <body>
  <jsp:include page="/header.jsp" />
  <section class="section">
    <div class="container">
      <h1 class="title">보낸 이메일 상세보기</h1>
		<table class="table">
		   <tbody>
		    <tr>
		      <th>작성자</th>
		      <td>${dto. author}</td>
		    </tr>
		    <tr>
		      <th>이메일 주소</th>
		      <td>${dto.fr }</td>
		    </tr>
		    <tr> 
		      <th>연락처</th>
		      <td><p>${dto.tel }</p></td>
		     </tr>
		     <tr>
		      <th>제목</th>
		      <td><p>${dto.title }</p></td>
		    </tr>
		    <tr>
		      <th>내용</th>
		      <td><p>${dto.content }</p></td>
		    </tr>
		    <tr>
		      <th>보낸 날짜</th>
		      <td><p>${dto.regdate }</p></td>
		    </tr>
		  </tbody>
		</table>
		<div class="button">
		  <a href="${path1 }/GetSendEmailListCtrl.do" class="button">목록</a>
		</div>
    </div>
  </section>
  <jsp:include page="/footer.jsp"></jsp:include>
  </body>
</html>