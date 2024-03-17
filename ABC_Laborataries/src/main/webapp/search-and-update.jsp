<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
<h1 class="font-monospace"> Search & Update the Test </h1>
</nav>
<div = "container">
<ul class="nav nav-tabs" >
  <h5><li class="nav-item">
    <a class="nav-link " aria-current="page" href="insert-test.jsp">INSERT NEW TEST</a>
  </li></h5>
 <h5> <li class="nav-item">
    <a class="nav-link active" href="#">SEARCH & UPDATE THE TEST</a>
  </li></h5>
  <h5><li class="nav-item">
    <a class="nav-link" href="gettest?actiontype=all">VIEW ALL TESTS & DELETE SPECIFIC</a>
  </li></h5>
  
</ul>
</br>
<p style="color:red"> ${feedbackMessage}
</p>
</br>

<form actiontype= "gettest">
	<h5><label for "testCode"> Enter Test Code :  </label></h5>
	<input class = "form-control" type="number" id="testCode" name = "testCode" placeholder= "Type the test code"/>
	<input type= "hidden" name="actiontype" value="single"/> 
	</br>
	<button type="submit" class="btn btn-warning btn-lg" > Search </button>
	</br>
</form>
</div>
</div></br>
<div class="progress" role="progressbar" aria-label="Danger example" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100">
  <div class="progress-bar bg-secondary" style="width: 100%"></div>
</div>
</br>
<form action="gettest" method = "post">
	<h5><label for = "testCodeUpdate">Test Code : </label></h5>
	<input class="form-control" type = "number" name="testCode" id="testCodeUpdate" readonly="readonly" disabled value="${test.testCode}"/>
	</br>

	<h5><label for = "testName">Test Name</label></h5>
	<input class="form-control" type ="text" name="testName" id="testName" value="${test.testName}"/>
	</br>
	<h5><label for = "testPrize">Test Prize [LKR]</label></h5>
	<input class="form-control" type = "number" name="testPrize" id="testPrize" value="${test.testPrize}"/>
	</br>
	<h5><label for = "testTimeslot">Test Timeslot</label></h5>
	<input class="form-control" type ="text" name="testTimeslot" id="testTimeslot" value="${test.testTimeslot}"/>
	</br>
	<input type = "hidden" name="actiontype" value= "edit"/>
	<button class="btn btn-success btn-lg" type="submit"> Update The Test </button>
</form>
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