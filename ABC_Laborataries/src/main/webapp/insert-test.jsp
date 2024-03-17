<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix = "tag" uri="http://java.sun.com/jstl/core" %>
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
<h1 class="font-monospace"> Registering New Test </h1>
</nav>
<div = "container">
<ul class="nav nav-tabs">
  <h5><li class="nav-item link-underline-opacity-0 link-dark">
    <a class="nav-link active" aria-current="page" href="#">INSERT NEW TEST</a>
  </li></h5>
  <h5><li class="nav-item link-underline-opacity-0 link-dark">
    <a class="nav-link" href="search-and-update.jsp">SEARCH & UPDATE THE TEST</a>
  </li></h5>
 <h5> <li class="nav-item link-underline-opacity-0 link-dark">
    <a class="nav-link" href="gettest?actiontype=all">VIEW ALL TESTS & DELETE SPECIFIC</a>
  </li></h5>
  <h5><li class="nav-item link-underline-opacity-0 link-dark">
    <a class="nav-link" href="View-all.jsp"></a>
  </li></h5>
  
</ul>
</br>
<p style="color:red"> 
${feedbackMessage}
</p>

</br>
<form action="testmanager" method = "post">
	<h5><label for = "testName">Test Name : </label></h5>
	<input class="form form-control" type = "text" name="name" id="testName"/>
	</br>
	<h5><label for = "testPrize">Test Prize [LKR] : </label></h5>
	<input class="form form-control" type = "number" name="prize" id="testPrize"/>
	</br>
	<h5><label for = "testTimeslot">Time Slot : </label></h5>
	<input class="form form-control" type = "text" name="timeslot" id="testTimeslot"/>
	</br>
	<input type = "hidden" name="actiontype" value= "add"/>
	<button class="btn btn-success btn-lg" type="submit"> Add The Test </button>
</form>
</div>
<p style="  padding :30px";>
<hr>
<footer>
  <p >Copyright @ 2024-ABC Lab</p>
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