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
	<form method="post" name="index" action="index">
		<div class="fieldDv">
			<label>User ID</label>
		</div>
		<div class="fieldDv">
			<input id="userName" name="userName" style="width:200px; height:18px;" /><br />
		</div>
		<div class="fieldDv">
			<label>Password</label>
			<br />
			<input type="password" id="password" name="password" style="width:200px; height:18px;" /><br />
		</div>
		<div class="fieldDv">
			<button id="submit" value="Sign In" type="submit">Submit</button>
		</div>
	</form>
</div>
</body>
</html>