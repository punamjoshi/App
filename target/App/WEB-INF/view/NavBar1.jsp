<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Case</title>
  <meta charset="utf-8">
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
<br/>
<div class="container" style="width:15%; margin-left: 0%;">

  <ul class="nav nav-pills nav-stacked">
 
    <li class="active"><a href="<c:url value="/AddProduct"/>">Add</a></li>
    <li class="active"><a href="<c:url value="/ViewAll"/>">ViewAll</a></li>
    <li class="active"><a href="#">Delete</a></li>
  </ul>
</div>

</body>
</html>
