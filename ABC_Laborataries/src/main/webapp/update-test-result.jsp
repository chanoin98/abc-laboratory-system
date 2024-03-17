<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ABC Laboratory-Update test results</title>
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
<h1 class="font-monospace"> Update Test Results </h1>
</nav>
</div>
</br>
<form action="testmanager" method = "post">

	<h5><label for = "patientName">Patient Name : </label></h5>
	<input  class="form form-control" type = "text" name="patientname" id="patientName"/>
	</br>
	<h5><label for = "refnum">Test Reference Number : </label></h5>
	<input  class="form form-control" type = "text" name="refnum" id="refnum"/>
	</br>
	<h5><label for = "testCode">Test Code : </label></h5>
	<input  class="form form-control" type = "number" name="testCode" id="testCode"/>
	</br>
	<h5><label for = "testName">Test Name : </label></h5>
	<input  class="form form-control" type = "text" name="testName" id="testName"/>
	</br>
	<h5><label for = "testResult">Test Result : </label></h5>
	<input  class="form form-control" type = "text" name="testResult" id="testResult"/>
	</br>
	<h5><label for = "comment">Comment : </label></h5>
	<input  class="form form-control" type = "text" name="comment" id="comment"/>
	</br>
	 <p>
<input type = "hidden" name="actiontype" value= "add"/>
<button type="submit" class="btn btn-outline-success btn-lg">SUBMIT</button>
<input type = "hidden" name="actiontype" value= "add"/>
<button type="reset" class="btn btn-outline-success btn-lg">RESET</button>
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