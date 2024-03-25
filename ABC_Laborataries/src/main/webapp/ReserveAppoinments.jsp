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
<br><a class="nav-link" href="patientLoginsuccess.jsp"><button  class="btn btn-secondary" type="button" data-bs-toggle="popover">BACK</button></a>

</div>
<div = "container">

</br>
<nav class="navbar" style="background-color: #e3f2fd;">
<h1 class="font-monospace"> Reserve Your Appoinments </h1>
</nav>
<p style = "font-size:20px ; color: red; font-family:Monospace" >
${feedbackMessage}

<img src="reserveApp.jpg" width="800" height="1515" align="right"  >

<div class="box" >
<form  action="reserve" method = "post" align="left"  style ="background:#c8dfea"  >

	<br>
<hr><h5>Patient Details</h5><hr>
	<h5><label for "patientUHID"> Enter Patient UHID :  </label></h5>
	<input class = "form-control" type="number" id="patientUHID" name = "patientUHID" placeholder= "Type UHID "/>
	</br>
	<h5><label for = "patientName">Patient Name : </label></h5>
	<input class="form form-control" type = "text" name="patientName" id="patientName" />
	</br>
	<h5><label for = "patientNic">Patient NIC : </label></h5>
	<input class="form form-control" type = "text" name="patientNic" id="patientNic" />
	</br>
	<h5><label for = "patientAge">Patient Age : </label></h5>
	<input class="form form-control" type = "number" name="patientAge" id="patientAge" />
	</br>
	<h5><label for = "patientContactno">Patient Contact No : </label></h5>
	<input class="form form-control" type = "number" name="patientContactno" id="patientContactno" />
	</br>
	<h5><label for = "patientEmail">Patient E-mail : </label></h5>
	<input class="form form-control" type = "text" name="patientEmail" id="patientEmail" />
	</br>
<div class="box" >
 <hr><h5>Test Details</h5><hr>
 <br>
  <a class="nav-link" href="View-all.jsp"><button class="btn btn-danger" type="button" data-bs-toggle="popover">View Test Details</button></a>
</h5>
<br>
<p style="font-family:Monospace ;font-size:20px "> Please use the "View Test Details" to verify lab appointment details.
<br>Make sure to enter valid information ..
<br><hr>
	<h5><label for "testCode"> Enter Test Code :  </label></h5>
	<input class = "form-control" type="number" id="testCode" name = "testCode" placeholder= "Type the test code"/>
	</br>
	<h5><label for = "testName">Test Name : </label></h5>
	<input class="form form-control" type = "text" name="testname" id="testName" />
	</br>
	<h5><label for = "docName">Referred Doctor Name : </label></h5>
	<input class="form form-control" type = "text" name="docName" id="docName"/>
	</br>
	
<br>
	<h5><label for = "testTimeslot">Timeslot you need : </label></h5>
	<input  class="form form-control" type = "text" name="testTimeslot" id="testTimeslot"/>
	</br>
	 <p>
<input type = "hidden" name="actiontype" value= "add"/>
<button type="submit" class="btn btn-outline-primary btn-lg">SUBMIT</button>
<input type = "hidden" name="actiontype" value= "reset"/>
<button type="reset" class="btn btn-outline-primary btn-lg">RESET</button>
</p>
<h5><div class="d-grid gap-4 d-md-block">
      <a class="nav-link" href="payment.jsp"><button class="btn btn-success btn-lg" type="button" data-bs-toggle="popover">PAYMENTS -->  </button></a>
</div></h5>
</br>
</div>
</div>
</div>

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
height:1500px ;
 width: 876px;}
 
</style>
<hr>
<footer>
  <p >Copyright @ 2024-ABC Lab</p>
</footer>
</body>
</html>