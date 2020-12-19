<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		
		session.setAttribute("BNAME2",bName);
		session.setAttribute("BTITLE2",bTitle);
		session.setAttribute("BCONTENT2",bContent);
	%>

	<table>
		<form action="modify.do" method="post">
			<tr>
				<th colspan="2">변경 전</th><th colspan="2">변경 후</th>
			</tr>
			<tr>
				<td colspan="2">번호</td>
				<td colspan="2"><input type="text" name="bId" size="10" value="<%= session.getAttribute("BID")%>" readonly="readonly"></td>
				
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="bName1" size="30" value="<%= session.getAttribute("BNAME")%>" readonly="readonly"></td>
				<td>이름</td>
				<td><input type="text" name="bName" size="30" value="<%= session.getAttribute("BNAME2")%>"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="bTitle1" size="50" value="<%= session.getAttribute("BTITLE")%>" readonly="readonly"></td>
				<td>제목</td>
				<td><input type="text" name="bTitle" size="50" value="<%= session.getAttribute("BTITLE2")%>"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="10" cols="50" name="bContent1" readonly="readonly"><%= session.getAttribute("BCONTENT")%></textarea> </td>
				<td>내용</td>
				<td><textarea rows="10" cols="50" name="bContent"><%= session.getAttribute("BCONTENT2")%></textarea> </td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="완료"></td>
			</tr>
		</form>
	</table>
	

</body>
</html>