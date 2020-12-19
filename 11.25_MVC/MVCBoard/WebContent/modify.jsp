<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
<%
	int ch = (int)session.getAttribute("CHECK");
	if(ch==1){
		out.println("alert('수정완료!')");
	}else{
		out.println("alert('수정실패!')");
	}
%>
	location.href='list.do';
	</script>
<%	
	session.invalidate();
%>
</body>
</html>