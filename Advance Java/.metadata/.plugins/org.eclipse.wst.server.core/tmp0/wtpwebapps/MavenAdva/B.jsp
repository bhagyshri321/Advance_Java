<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	B JSP
	<%
	request.setAttribute("B", "Showroom");
%>
	<jsp:forward page="C.jsp"></jsp:forward>


</body>
</html>