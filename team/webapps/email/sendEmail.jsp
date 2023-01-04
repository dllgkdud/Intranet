<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<%@ page import="java.util.*, java.lang.*" %>
<%@ page import="java.text.*, java.net.InetAddress" %>
<c:set var="path1" value="<%=request.getContextPath() %>" />
<!DOCTYPE html>
<html>
<head>
<title>sendEmail</title>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<jsp:include page="/head.jsp" />
	<link rel="stylesheet" href="${path1 }/resource/datatables.min.css">
	<script src="${path1 }/resource/datatables.min.js"></script>
</head>
<body>
 <section class="section">
    	<div class="container">
            <h2 class="title">전자메일</h2>
            <br><hr><br>
            <p style="clear:both"> 내용 확인 후 연락드립니다.</p>
			<div class="frm1">
				<form name="frm" class="frm"  action="${path1 }/SendEmailCtrl.do" action="sendEmailPro.jsp" method="post">
					<table class="table">
						<tbody>
							<tr>
								<th><label for="author">작성자</label></th>
								<td>
									<input type="text" value="admin" name="name" id="author" class="input" required>
								</td>
							</tr>
							<tr>
								<th><label for="from">이메일 주소</label></th>
								<td>
									<input type="email" value="admin@intranet.com" name="fr" id="fr" class="input" required >
								</td>
							</tr>
							<tr>
								<th><label for="tel">연락처</label></th>
								<td>
									<input type="tel" value="1111" name="tel" id="tel" class="input" required >
								</td>
							</tr>
							<tr>
								<th><label for="title">제목</label></th>
								<td><input type="text" value="보내는 메일 내용 저장 테스트" name="title" id="title" maxlength="100" class="input" required></td>
							</tr>
							<tr>
								<th><label for="content">내용</label></th>
								<td>
									<textarea cols="100" rows="6" name="content" id="content" maxlength="600" class="textarea">"보내는 메일 내용 저장 테스트"</textarea>
								</td>
							</tr>
						</tbody>
					</table>
					<div class="btn_group">
						<button type="submit" class="button">메일보내기</button>
					</div>
				</form>
			</div>
		</div>
	</section>
</body>
</html>