<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Insert title here</title>
    <style type="text/css">
       #wrap {
           width: 800px;
           margin: 0 auto 0 auto;
       }
   
       #detailBoard{
           text-align :center;
       }
       
       #title{
           height : 16;
           font-family :'돋움';
           font-size : 12;
           text-align :center;
       }
    </style>
	<jsp:include page="${path1 }/head.jsp" />
</head>
<body>
	<jsp:include page="${path1 }/header.jsp" />
	<div id="wrap">
	    <br><br>
	    <div id="board">
	        <table id="downList" width="800" border="3" bordercolor="lightgray">
	        	<tr>
	        		<th>번호</th>
	        		<th>작성자</th>
	        		<th>제목</th>
	        		<th>다운로드</th>
	        		<th>업로드일</th>
	        	</tr>
	        	<c:forEach items="${downBoardList }" var="dto" varStatus="status">
				    <tr>
				      <td>${status.count }</td>
				      <td>${dto.email }</td>
				      <td>${dto.title }</td>
				      <td><a href="${path1 }/DownloadCtrl.do?filename=${dto.filename}">${dto.filename }다운로드</a></td>
				      <td>${dto.uploaddate }</td>
				      <td><a href="${path1 }/DelDownBoardCtrl.do?upno=${dto.upno}">삭제</a></td>
				    </tr>		    
			    </c:forEach>
		            <tr align="center" valign="middle">
		                <td colspan="5">
		                    <input type="button" value="메인으로" onclick="javascript:location.href='/'">
		                    <input type="button" value="업로드" onclick="javascript:location.href='./file/uploadForm.jsp'"/>
		                </td>
		            </tr>
	        </table>
	    </div>
	</div>    
<jsp:include page="${path1 }/footer.jsp" />
</body>
</html>