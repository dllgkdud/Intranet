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
    <title>회원 추가</title>
    <jsp:include page="${path1 }/head.jsp" />
  </head>
  <body>
  <jsp:include page="${path1 }/header.jsp" />
  <section class="section">
    <div class="container">
      <h1 class="title">글 작성</h1>
      	<form action="${path1 }/WriteMemberCtrl.do" method="post">
			<table class="table">
			   <tbody>
			    <tr>
			      <th>이메일</th>
			      <td>
			      	<input type="email" class="input" maxlength="100" name="email" id="email" placeholder="이메일 입력" required>
			      	<input type="button" class="button" value="중복 확인" onclick="emailCheck()">
					<input type="hidden" name="mailck" id="mailck" value="no">
					<div>
						<c:if test="${empty sid }">
						<h6 id="msg">아직 아이디 중복 체크를 하지 않으셨습니다.</h6>
						</c:if>
						<c:if test="${not empty sid }">
						<h6 id="msg">아이디 중복 체크 후 수정하였습니다.</h6>
						</c:if>
					</div>
			      </td>
			    </tr>
			    <tr>
			      	<th>비밀번호</th>
			      	<td><input type="password" class="input" name="pw" id="pw" placeholder="비밀번호 입력" required></td>
			    </tr>
			    <tr>
			      	<th>비밀번호 확인</th>
			      	<td><input type="password" class="input" name="pw2" id="pw2" placeholder="비밀번호 확인" required></td>
			    </tr>
			    <tr>
					<th>이름</th>
					<td><input type="text" name="ename" id="ename" placeholder="이름 입력" class="input" required /></td>
				</tr>
			  </tbody>
			</table>
			<div class="buttons">
				<a href="${path1 }/GetMemberListCtrl.do" class="button"><button>목록</button></a>
				<button type="reset" class="button">취소</button>
			  <button type="submit" class="button">등록</button>
			</div>
		</form>
		<script>
		$(document).ready(function(){
			$("#id").keyup(function(){
				$("#idck").val("no");
				if($(this).val()!=""){
					$("#msg").html("<strong>아이디 입력중입니다.</strong>");
				} else {
					$("#msg").html("아직 아이디 중복 체크를 하지 않으셨습니다.");
				}
			});
		});
		</script>
    </div>
  </section>
  <jsp:include page="${path1 }/footer.jsp"></jsp:include>
  </body>
</html>