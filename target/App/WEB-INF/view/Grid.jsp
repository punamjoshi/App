<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
<div class="container" style="margin-left: 25%">
     <ul class="row">
          <li class="col-lg-2 col-md-2 col-sm-3 col-xs-4">    
          <img src="<c:url value="resources/images/m4.jpg"/>"  width="100%" ></li>
            <li class="col-lg-2 col-md-2 col-sm-3 col-xs-4">    
         <%--  <img src="<c:url value="resources/images/m6.jpg"/>"  width="100%" ></li>
            <li class="col-lg-2 col-md-2 col-sm-3 col-xs-4"> --%>    
          <img src="<c:url value="resources/images/m2.jpg"/>"  width="100%" ></li>
           <li class="col-lg-2 col-md-2 col-sm-3 col-xs-4">    
          <img src="<c:url value="resources/images/m5.jpg"/>"  width="100%" ></li>
     </ul>
</div>
</body>
</html>