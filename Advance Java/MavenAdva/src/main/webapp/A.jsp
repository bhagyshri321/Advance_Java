<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	A JSP
	<%
	request.setAttribute("A", "System");
%>
	<jsp:forward page="B.jsp"></jsp:forward>

 
</body>
</html>