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
	<title>Upload</title>
	<jsp:include page="${path1 }/head.jsp" />
</head>
<body>
	<jsp:include page="${path1 }/header.jsp" />
	<form action = "UploadCtrl.do" method = "post" enctype = "multipart/form-data">
		<input type = "text" name = "title" placeholder="제목" /><br>
		<input type = "text" name = "email" value="${sid }" readonl /><br>
		<input type = "filename" name = "filename" placeholder="파일" /><br>
		<input type = "submit" value = "업로드">
	</form>
	<jsp:include page="${path1 }/footer.jsp" />
</body>
</html>