<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path1" value="<%=request.getContextPath() %>" />
<!DOCTYPE html>
<html>
 <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>게시판 글 작성</title>
    <jsp:include page="${path1 }/head.jsp" />
  </head>
  <body>
  <jsp:include page="${path1 }/header.jsp" />
  <section class="section">
    <div class="container">
      <h1 class="title">글 작성</h1>
      	<form action="${path1 }/WriteBoardCtrl.do" method="post">
			<table class="table">
			   <tbody>
			    <tr>
			      <th><label for="title">제목</label></th>
			      <td><input type="text" class="input" maxlength="120" name="title" id="title" placeholder="제목 입력" required></td>
			    </tr>
			    <tr>
			      <th><label for="content">내용</label></th>
			      <td><textarea rows="8" cols="100" name="content" id="content" class="textarea" placeholder="내용 입력" required></textarea></td>
			    </tr>
			  </tbody>
			</table>
			<div class="buttons">
				<a href="${path1 }/GetBoardListCtrl.do" class="button"><button>목록</button></a>
				<button type="reset" class="button">취소</button>
			  <button type="submit" class="button">등록</button>
			</div>
		</form>
    </div>
  </section>
  <jsp:include page="${path1 }/footer.jsp"></jsp:include>
  </body>
</html>