<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix = "tag" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>ABC-Laboratary</title>
	<link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;600&display=swap" rel="stylesheet">
    <link href = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"> </script>
</head>
<body style ="background:#Afe1AF">
<span class="navbar-caption-wrap" style ="background:#FFFFFF" ><a class="navbar-caption text-success display-2">ABC LABORATORY</a>
</span>
<div class="d-grid gap-4 d-md-block">

<a class="nav-link" href="Home.jsp"><button  class="btn btn-secondary" type="button" data-bs-toggle="popover">HOME</button></a>

</div>
<div = "container">

</br>
<nav class="navbar" style="background-color: #66CDAA;">
<h1 class="font-monospace"> View All Tests & Delete Specific </h1>
</nav>
<div = "container">
<ul class="nav nav-tabs">
 <h5> <li class="nav-item">
    <a class="nav-link " aria-current="page" href="insert-test.jsp">INSERT NEW TEST</a>
  </li></h5>
 <h5> <li class="nav-item">
    <a class="nav-link " href="search-and-update.jsp">SEARCH & UPDATE THE TEST</a>
  </li></h5>
 <h5> <li class="nav-item">
    <a class="nav-link active" href="#">VIEW ALL TESTS & DELETE SPECIFIC</a>
  </li></h5>
  
</ul>

</br>

<p style="color:red"> ${feedbackMessage}</p>

</br>

<table style="width:100% "class="table table-striped">
	<thead>
		<tr class="table-success">
			<th>Test Code </th>
			<th>Test Name</th>
			<th>Test Prize [LKR]</th>
			<th>Time Slot </th>
		</tr>
	</thead>
	<tbody> 
		<tag:forEach var="test" items ="${testList}">
		<tr>
			<td>${test.testCode}</td>
			<td>${test.testName}</td>
			<td>${test.testPrize}</td>
			<td>${test.testTimeslot}</td>
			
			<td>
				<form action = "testmanager" method="post">
				<input type="hidden" name="testCode" value = "${test.testCode}">
				<input type="hidden" name="actiontype" value = "delete">
				<button type = "submit" class="btn btn-danger">Delete the test</button>
				
				</form>
			 </td>
		</tr>
		</tag:forEach>
	</tbody> 
</table>
</div>
<p style="  padding :30px";>
<hr>
<footer>
  <p >C.H.WEDAGEDARA @ 2024</p>
</footer>
<style>
footer {
  text-align: center;
  color: black;
  font-family:Monospace;
  font-size:20px
}
form{
  font-family:Monospace;
}
li{
  font-family:Monospace;
}
h5{
  font-family:Monospace;
    color: black;
  
  
}
</style>
</body>
</html>