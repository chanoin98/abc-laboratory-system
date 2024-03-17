<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ABC Laboratary - Reserve Lab Appoinments</title>
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
<nav class="navbar" style="background-color: #e3f2fd;">
<h1 class="font-monospace"> Reserve Your Appoinments </h1>
</nav>
<img src="reserveApp.jpg" width="800" height="1050" align="right"  >

<div class="box" >

<form action="Reserve" method = "post" align="left" action="Reserva" method = "post" style ="background:#c8dfea" >

	
</br>
	<h5><label for = "patientName">Patient Name : </label></h5>
	<input class="form form-control" type = "text" name="patientname" id="patientName"/>
	</br>
	<h5><label for = "patientAge">Patient Age : </label></h5>
	<input class="form form-control" type = "number" name="patientage" id="patientAge"/>
	</br>
	<h5><label for = "patientContactnumber">Patient Contact Number : </label></h5>
	<input class="form form-control" type = "number" name="patientcontactnumber" id="patientContactnumber"/>
	</br>
	<h5><label for = "patientContactnumber">Patient Email : </label></h5>
	<input class="form form-control" type = "text" name="patientemail" id="patientEmail"/>
	</br>
	<h5><div class="d-grid gap-4 d-md-block">
      <a class="nav-link" href="View-all.jsp"><button class="btn btn-warning" type="button" data-bs-toggle="popover">View Test Details</button></a>
</div></h5>
<p style="font-family:Monospace ;font-size:20px "> Please use the "View Test Details" before reserving your appoinment.</br>Make sure to eneter valid information ..</p>
</br>
	<h5><label for = "testName">Test Name : </label></h5>
	<input class="form form-control" type = "text" name="testname" id="testName"/>
	</br>
	<h5><label for = "testcode">Test Code : </label></h5>
	<input class="form form-control" type = "number" name="testcode" id="testCode"/>
	</br>
	<h5><label for = "docName">Referred Doctor Name : </label></h5>
	<input class="form form-control" type = "text" name="docname" id="docName"/>
	</br>
	<h5><label for = "testTimeslot">Timeslot you need : </label></h5>
	<input  class="form form-control" type = "text" name="testtimeslot" id="testTimeslot"/>
	</br>
	 <p>
<input type = "hidden" name="actiontype" value= "add"/>
<button type="submit" class="btn btn-outline-primary btn-lg">SUBMIT</button>
<input type = "hidden" name="actiontype" value= "add"/>
<button type="reset" class="btn btn-outline-primary btn-lg">RESET</button>
</p>
<h5><div class="d-grid gap-4 d-md-block">
      <a class="nav-link" href="payment.jsp"><button class="btn btn-success btn-lg" type="button" data-bs-toggle="popover">PAYMENTS -->  </button></a>
</div></h5>
</br>
</div>
</div>
</div>
<p style = "font-size:30px ; color: red; font-family:Monospace" >
${feedbackMessage}
</p>

</form>
<style>
footer {
  text-align: center;
  color: black;
  font-family:Monospace;
  font-size:20px
}
img{
opacity:0.4;
background-color:#c8dfea;
}
form{
height:1050px ;
 width: 876px;}
 
</style>
<hr>
<footer>
  <p >Copyright @ 2024-ABC Lab</p>
</footer>
</body>
</html>