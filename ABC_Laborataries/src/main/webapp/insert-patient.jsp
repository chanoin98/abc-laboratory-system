<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix = "tag" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
<title>ABC Laboratory - New Patient Registration</title>
	 <link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;600&display=swap" rel="stylesheet">
    <link href = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"> </script>
</head>
<body style ="background:#1F456E">

<span class="navbar-caption-wrap" style ="background:#FFFFFF" ><a class="navbar-caption text-primary display-2">ABC LABORATORY</a>
</span>
<div class="d-grid gap-4 d-md-block">

<a class="nav-link" href="Home.jsp"><button  class="btn btn-secondary" type="button" data-bs-toggle="popover">HOME</button></a>

</div>
<div = "container">

</br>
<nav class="navbar" style="background-color: #e3f2fd;" >
<h1 class="font-monospace"> New Patient Registration </h1>
</nav>

<img src="NewPatient.jpg" width="800" height="1070" align="right"  >
<div class="box" >

<form  action="patientmanager" method = "post" style ="background:#c8dfea" align="left" >
</br>
	<h5><label for = "patientName">Patient Name : </label></h5>
	<input  class="form form-control" type = "text" name="patientname" id="patientName"/>
	</br>
	<h5><label for = "patientNic">Patient NIC : </label></h5>
	<input class="form form-control"  type = "text" name="patientnic" id="patientNic"/>
	</br>
	<h5><label for = "patientAge">Patient Age : </label></h5>
	<input class="form form-control" type = "number" name="patientage" id="patientAge"/>
	</br>
	<h5><label for = "patientAddress">Patient Address : </label></h5>
	<input class="form form-control" type = "text" name="patientaddress" id="patientAddress"/>
	</br>
	<h5><label for = "patientContactnumber">Patient Contact Number : </label></h5>
	<input class="form form-control" type = "number" name="patientcontactnumber" id="patientContactnumber"/>
	</br>
	<h5><label for = "patientEmail">Patient E-mail : </label></h5>
	<input class="form form-control" type = "text" name="patientemail" id="patientEmail"/>
	</br>
	</br>
	
  
<div class="form-check">
  <input class="form-check-input" type="radio" name="gender" id="flexRadioDefault1" value="Female">
  <h5><label class="form-check-label" for="flexRadioDefault1">
    Female
  </label>
  </div>
<div class="form-check">
  <input class="form-check-input" type="radio" name="gender" id="flexRadioDefault2" checked value="Male">
 <h5> <label class="form-check-label" for="flexRadioDefault2">
    Male
  </label></h5>
</div>


</br>

<div class="row g-3 align-items-center">
  <div class="col-auto">
  
   <h5> <label for="username" class="col-form-label" type = "text"  id="username">Username</label></h5>
  </div>
  <div class="col-auto">
    <input type="text" id="username" class="form-control" name="patientusername" >
  </div>
  
  <div class="row g-3 align-items-center">
  <div class="col-auto">
   <h5> <label for="password" class="col-form-label" type = "password"  id="password">Password</label></h5>
  </div>
  <div class="col-auto">
    <input type="password" id="password" class="form-control" name="patientpassword">
  </div>
  
   <div class="row g-3 align-items-center" >
  <div class="col-auto">
  <h5>  <label for="confirmpassword" class="col-form-label" type = "password"  id="confirmpassword">Confirm Password</label></h5>
  </div>
  <div class="col-auto">
    <input type="password" id="confirmpassword" class="form-control" name="confirmpassword" >
  </div>
  <p>
 
<input type = "hidden" name="actiontype" value= "add"/>
<button type="submit" class="btn btn-outline-primary btn-lg">SUBMIT</button>
<input type = "hidden" name="actiontype" value= "reset"/>
<button type="reset" class="btn btn-outline-primary btn-lg">RESET</button>
 <p style = "font-size:30px ; color: red; font-family:Monospace" >
${feedbackMessage}
</p>


</form>

</div>
</div>
</div>
<style>
footer {
  text-align: center;
  color: black;
  font-family:Monospace;
  font-size:20px
}
img{
opacity:0.3;
background-color:#c8dfea;
}
form{
height:1070px ;
 width: 875px;}
 
</style>
<hr>
<footer>
  <p >Copyright @ 2024-ABC Lab</p>
</footer>
</body>
</html>