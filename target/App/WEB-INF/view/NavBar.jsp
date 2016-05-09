<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Case</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>">
  <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
  <script src="<c:url value="/resources/js/jquery.min.js"/>"></script>
  <script src=></script>
</head>
<body>

<nav class="navbar navbar-inverse" style="width:80%;margin-left: 10%;margin-right: 20%;">
  <div class="container-fluid" >
    <div class="navbar-header">
      <a class="navbar-brand" href="#">My Movie App</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
     <!--  <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Page 1-1</a></li>
          <li><a href="#">Page 1-2</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li> -->
       <li><a href="<c:url value="/AdminHome"/>">Admin</a></li>
      <li><a href="#">About Us</a></li>
     
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="<c:url value="/Register"/>"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="<c:url value="/Login"/>"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
  

</body>
</html>
