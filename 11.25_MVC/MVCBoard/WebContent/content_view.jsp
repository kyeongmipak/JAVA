<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글내용 보기</title>
</head>
	
<body>	


	<table>
		<form action="updateCheck.jsp" method="post">
			<tr>
				<td>번호</td>
				<td><input type="text" name="bId" size="10" value="${content_view.bId}" readonly="readonly"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="bName" size="30" value="${content_view.bName}"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="bTitle" size="50" value="${content_view.bTitle}"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="10" cols="50" name="bContent">${content_view.bContent}</textarea> </td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="수정">&nbsp;&nbsp;<a href="list.do">목록 보기</a>&nbsp;&nbsp;<a href="delete.do?bId=${content_view.bId}">삭제</a></td>
			</tr>
		</form>
	</table>
	
</body>
</html>