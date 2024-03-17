<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix = "tag" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>ABC-Laboratary- Test Details</title>
	<link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;600&display=swap" rel="stylesheet">
    <link href = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"> </script>
</head>

<span class="navbar-caption-wrap" style ="background:#FFFFFF" ><a class="navbar-caption text-primary display-2">ABC LABORATORY</a>
</span>
<div class="d-grid gap-4 d-md-block">

<a class="nav-link" href="Home.jsp"><button  class="btn btn-secondary" type="button" data-bs-toggle="popover">HOME</button></a>
</div>
</br>
<a class="nav-link" href="ReserveAppoinments.jsp"><button  class="btn btn-secondary" type="button" data-bs-toggle="popover">BACK</button></a>

</div>

<div = "container">


</br>
<nav class="navbar" style="background-color: #e3f2fd;">
<h1 class="font-monospace"> Test Details </h1>
</nav>
<form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>

<div = "container">
</br>

<p style="color:red"> ${feedbackMessage}</p>

</br>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "abc";
String userid = "root";
String password = "12345";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>

<body style ="background:#c8dfea">
<table border="1">
<table class="table table-striped">
<thead class="table-dark">
<tr>
<th>Test Code </th>
			<th>Test Name</th>
			<th>Test Prize [LKR]</th>
			<th>Time Slot </th>

</tr>
 
</thead>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from test";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("testCode") %></td>
<td><%=resultSet.getString("testName") %></td>
<td><%=resultSet.getString("testPrize") %></td>
<td><%=resultSet.getString("testTimeslot") %></td>

</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table> 
<p style="  padding :120px";>
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
</style>
</body>
</html>
