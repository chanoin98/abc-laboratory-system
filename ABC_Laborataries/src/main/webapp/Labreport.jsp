<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ABC-Laboratory- View Report</title>
<link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;600&display=swap" rel="stylesheet">
    <link href = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"> </script>
	<link rel="stylesheet" href="Lapreport.css">
	
</head>
<body>
<span class="navbar-caption-wrap" style ="background:#FFFFFF" ><a class="navbar-caption text-success display-2">ABC LABORATORY</a>
</span>
<div class="d-grid gap-4 d-md-block">

<a class="nav-link" href="Home.jsp"><button  class="btn btn-secondary" type="button" data-bs-toggle="popover">HOME</button></a>
</br>
</br>
<h1 class="font-monospace"> Lab Reports </h1>

</div>
<div = "container">

<p style="color:red"> ${feedbackMessage}
</p>
</br>
<form method="get" action= "result" >

<div class="report-content">
<h1 style = font-size:50px ; align:center>ABC-Laboratory</h1>
    <hr>
  
    <table class="table">
      <tr>
        <td>Patient Name:</td>
        <td class="align-left"> </td>
        <td><?php echo $result['patientName']; ?></td>
        
        <td>
      </tr>
      <tr>
        <td>Test Reference Number : </td> 
        <td class="align-left"></td>
        </tr>
       <td>Date:</td>
       <td class="align-left"></td>
       
      </tr>
      <tr>
      </table>
    <hr>
  <p>


	<h5><label for = "patientName">Patient Name</label></h5>
	<input class="form-control" type ="text" name="patientName" id="patientName" value="${result.patientName}"/>
	</br>
	<h5><label for = "testRefno">Test Reference Number</label></h5>
	<input class="form-control" type = "number" name="testRefno" id="testRefno" value="${result.testRefno}"/>
	</br>
    <h5><label for = "testCode">Test Code </label></h5>
	<input class="form-control" type = "number" name="testCode" id="testCode" value="${result.testCode}"/>
	</br>
	<h5><label for = "testName">Test Name</label></h5>
	<input class="form-control" type ="text" name="testName" id="testName" value="${result.testName}"/>
	</br>
	<h5><label for = "testResult">Test Result</label></h5>
	<input class="form-control" type ="text" name="testResult" id="testResult" value="${result.testResult}"/>
	</br>
	<h5><label for = "testComment">Test Comment</label></h5>
	<input class="form-control" type ="text" name="testComment" id="testComment" value="${result.testComment}"/>
	</br>
	</form>
	

  </div>
  
  <div class="report-sign">
    <div class="lab-incharge-sign">
     
      <img src="https://labsmart-healthcare-trial.s3.us-west-2.amazonaws.com/diagnostic_lab_524/sample_lab_incharge_sign.jpg"/>
        <figcaption>Mr. Sahan Perera</figcaption>
    </div>
    <div class="lab-doctor-sign">
      <img src="https://labsmart-healthcare-trial.s3.us-west-2.amazonaws.com/diagnostic_lab_524/sample_pathologist_sign.jpg"/>
      <figcaption>Dr. A.K. Karunarathne</figcaption>
    </div>
    
  </div>
  
  
 
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