<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>제목</th>
			<th>날짜</th>
		</tr>
		<c:forEach items="${list}" var="dto"> <!--setAttribute에서 선언된 list -->
		<tr>
			<td>${dto.bId }</td>
			<td>${dto.bName }</td>
			<td><a href="content_view.do?bId=${dto.bId}&bName=${dto.bName }&bTitle=${dto.bTitle}&bContent=${dto.bContent }">${dto.bTitle }</a></td>
			<td>${dto.bDate }</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="5"><a href="write_view.do">글 작성</a></td>
		</tr>
	</table>
</body>
</html>