<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ABC Laboratory - Lab Reports</title>
 <link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;600&display=swap" rel="stylesheet">
    <link href = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"> </script>
    <style media="screen">
      *,
*:before,
*:after{
    padding: 0;
    margin: 0;
    box-sizing: border-box;
}

form{
    height: 320px;
    width: 400px;
    background-color: rgba(255,255,255,0.13);
    position: absolute;
    transform: translate(-50%,-50%);
    top: 50%;
    left: 50%;
    border-radius: 10px;
    backdrop-filter: blur(10px);
    border: 2px solid rgba(255,255,255,0.1);
    box-shadow: 0 0 40px rgba(8,7,16,0.6);
    padding: 50px 35px;
}
label{
    display: block;
    margin-top: 30px;
    font-size: 20px;
    font-weight: 500;
    color:white;
}
input{
    display: block;
    height: 50px;
    width: 100%;
    background-color: rgba(255,255,255,0.07);
    border-radius: 3px;
    padding: 0 10px;
    margin-top: 8px;
    font-size: 14px;
    font-weight: 300;
}
::placeholder{
    color: #566D7E;
}

    </style>

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
<h1 class="font-monospace"> Get Your Lab Reports Here </h1>
</nav>
 <form method="get" action= "result">

        <h5><label for="refno">Reference No:</label></h5>
        <input type="text" placeholder="Reference No"  name="testRefno" >
        	<input type= "hidden" name="actiontype" value="single"/> 
        
<a class="nav-link" href="Labreport.jsp"><button style=" margin-top: 50px ; width: 100%;background-color: #000080;color: #FFFFFF;
        padding: 15px; font-size: 18px;border-radius: 5px;cursor: pointer;" 

        >View Report</button></a>
        <div class="social">
          
        </div>
    </form>
    <p style="  padding :250px";>
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
::placeholder {
  color: black;
  opacity: 1;
</style>
</body>
</html>