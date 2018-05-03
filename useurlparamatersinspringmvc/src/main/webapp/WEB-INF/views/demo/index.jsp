

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Use Parameter(s)</title>
</head>
<body>
	<h3>Use Parameter(s)</h3>
	<a href="${pageContext.request.contextPath }/demo/hello/ilbars">One
		Parameter(ilbars)</a>
	<br>
	<a href="${pageContext.request.contextPath }/demo/sum/5/7">Multiple
		Parameters(5 + 7)</a>
</body>
</html>