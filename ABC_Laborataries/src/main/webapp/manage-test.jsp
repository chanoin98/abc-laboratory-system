<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
	<link href="https://unpkg.com/bootstrap@4.5.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
	<meta charset="ISO-8859-1">
	<title>KFC onAir</title>
</head>
<body>
	<br/>
	<h2>ABC -Laboratory</h2>
	<div class= "container">
		<ul class="nav nav-tabs">
		  <li class="nav-item">
		    <a class="nav-link" aria-current="page" href="getAllTest?action=all">All Tests</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link" href="insert-test.jsp">Add Test</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link  active" href="#">Manage Tests</a>
		  </li>
		</ul>
		<br/>
		<h3>Search The Test:</h3>
		<p>${searchFeedBack}</p>
		<br>
		
		<form action="getTest">
			<label for="testCode">Enter Test Code:</label>
			<input id="testCode" type="number" name="testCode" class="form-control"/>
			<br/>
			<button type="submit" class="btn btn-info">Search</button>
		</form>
		<br/>
		<hr/>
		<p>${updateMessage}</p>
		<br/>
		<form action="updateTest?action=update" method="post">
			<label for="testCode">Test Code:</label>
			<input id="testCode" type="number" name="testCode" readonly="readonly" class="form-control" value ="${test.testCode}"/>
			<label for="productName">Test Name:</label>
			<input id="productName" type="text" name="testName" class="form-control" value ="${test.testName}"/>
			<label for="price">Price [LKR]:</label>
			<input id="price" type="number" name="price" class="form-control" value ="${test.testPrice}"/>
			<br/>
			<button type="submit" class="btn btn-warning">Update</button>
		</form>	
		<br/>

	</div>
</body>
</html>