<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<link rel="stylesheet" href="../css/lib.css" type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="body-wrapper container-fluid">
	<form method="post" action="next">
		<input type="radio" name="menu" value="1">Add a student<br/>
		<input type="radio" name="menu" value="2">Add a book<br/>
		<input type="radio" name="menu" value="3">Search a book<br/>
		<input type="radio" name="menu" value="4">Search a student<br/>
		<input type="radio" name="menu" value="5">Issue Book<br/>
		<input type="radio" name="menu" value="6">Return Book<br/>
		<button id="submit" value="Submit" type="submit">Submit</button>
	</form>
</div>
</body>
</html>