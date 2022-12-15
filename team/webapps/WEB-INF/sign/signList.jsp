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
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>전자결재</title>
	
	<!-- bootstrap4 (modal 확인용) -->
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	
	<!-- jquery -->
	<script src="https://code.jquery.com/jquery-latest.js"></script>
	
	<script>
		$(document).ready(function(){
			$("#select").change(function(){
				var hrefUrl = $(this).val();
				if($(this).val!=""){
					window.open(hrefUrl, "new Window");
				}
			});
		});
	</script>
</head>
<body>
	<div class="select">
		<select name="select" id="select" required>
			<option value="">전체</option>
			<option value="<%=request.getContextPath() %>/GetWait.do">결재대기</option>
			<option value="<%=request.getContextPath() %>/GetComplete.do">결재완료</option>
		</select>
	</div>
	<table class="sign-table">
		<thead>
			<tr>
				<th>No</th>
				<th>Title</th>
				<th>Id</th>
				<th>RegDate</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${list }" var="dto" varStatus="status">
			<tr>
				<td>${status.count }</td>
				<td><a href="${path1 }/GetSignDetailCtrl.do?sid=${dto.sid }">${dto.title }</a></td>
				<td>${dto.sid }</td>
				<td>${dto.regdate }</td>
			</tr>
		</c:forEach>
		<c:if test="${empty list }">
			<tr>
				<td colspan="4">결재 항목이 존재하지 않습니다.</td>
			</tr>
		</c:if>
		</tbody>
	</table>
	<button type="button" class="btn btn-dark" data-toggle="modal" data-target="#exampleModalCenter">결재처리</button>
	<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLongTitle">결재처리</h5>
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form name="frm" action="${path1 }/AddSignCtrl.do" method="post">
						<table>
							<tbody>
								<tr>
									<td><input type="hidden" name="sno" id="sno" value=""></td>
								</tr>
								<tr>
									<td><input type="text" name="title" id="title" placeholder="결재 제목 입력" class="input" maxlength="100" required /></td>
								</tr>
								<tr>
									<td><textarea cols="60" rows="20" name="content" id="content" placeholder="결재 내용 입력" class="input" maxlength="1000" style="resize: none;" required></textarea></td>
								</tr>
							</tbody>
						</table>
						<button type="submit" class="btn btn-dark">결재요청</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>