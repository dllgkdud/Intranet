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
	<title>Sign</title>
	<jsp:include page="${path1 }/head.jsp" />
</head>
<body>
	<jsp:include page="${path1 }/header.jsp" />
	<section class="section">
		<div class="container">
			<h2></h2>
			<table class="table">
				<thead>
					<tr>
						<th><abbr title="Check"><input type="checkbox" id="cbx_chkAll" /></abbr></th>
						<th><abbr title="Sno">결재번호</abbr></th>
						<th><abbr title="Title">결재제목</abbr></th>
						<th><abbr title="Email">결재자</abbr></th>
						<th><abbr title="State">결재상태</abbr></th>
						<th><abbr title="RegDate">결재일</abbr></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${signList }" var="dto" varStatus="no">
					<tr>
						<td><input type="checkbox" name="chk"></td>
						<td><span>${dto.sno }</span></td>
						<td>
							<c:if test='${empty sid }'>
								<span>${dto.title }</span>
							</c:if>
							<c:if test='${sid.equals(dto.email) || sid.equals("admin@naver.com")}'>
								<a href="${path1 }/GetSignDetailCtrl.do?sno=${dto.sno }">${dto.title }</a>
							</c:if>
						</td>
						<td>${dto.email }</td>
						<td>
							<c:if test='${dto.state==0 }'>
								<span>결재처리</span>
							</c:if>
							<c:if test='${dto.state==1 }'>
								<span>결재진행</span>
							</c:if>
							<c:if test='${dto.state==2 }'>
								<span>결재완료</span>
							</c:if>
						</td>
						<td>
							<fmt:parseDate value="${dto.regdate }" var="regdate" pattern="yyyy-MM-dd"></fmt:parseDate>
							<fmt:formatDate value="${regdate }" pattern="yyyy-MM-dd" />
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			<c:if test='${not empty sid}'>
			<div class="buttons">
				<a href="${path1 }/sign/addSign.jsp" class="button is-primary">작성</a>
			</div>
			</c:if>
		</div>
		<script>
          $(document).ready(function() {
            $("#cbx_chkAll").click(function() {
              if($("#cbx_chkAll").is(":checked")) $("input[name=chk]").prop("checked", true);
              else $("input[name=chk]").prop("checked", false);
            });

            $("input[name=chk]").click(function() {
              var total = $("input[name=chk]").length;
              var checked = $("input[name=chk]:checked").length;

              if(total != checked) $("#cbx_chkAll").prop("checked", false);
              else $("#cbx_chkAll").prop("checked", true); 
            });
          });
		</script>
          <!-- 선택 항목만 처리하는 스크립트 -->
          <script>
          $(document).ready(function() {
            
          });
		</script>
	</section>
	<jsp:include page="${path1 }/footer.jsp" />
</body>
</html>