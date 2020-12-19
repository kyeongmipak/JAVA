<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 작성</title>
</head>
<body>
	<script type="text/javascript" src="Function.js">
	
	</script>


	<table>

		<form name="input" action="write.do" method="post" onsubmit="return check()">
			<tr>
				<td>이름</td>
				<td><input type="text" name="bName" size="30"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="bTitle" size="30"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="입력" name="submit">&nbsp;&nbsp;<a href="list.do">목록 보기</a></td>
			</tr>
		</form>
	</table>

</body>
</html>