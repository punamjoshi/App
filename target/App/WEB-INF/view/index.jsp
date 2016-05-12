<html>
<head>
  <title>Bootstrap Case</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>">
  <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
  <script src="<c:url value="/resources/js/jquery.min.js"/>"></script>

</head>
<body  style="background: #e9e7e8;">
<br/>
<%@ include file="NavBar.jsp" %>
<%@include file="Slider.jsp" %>
<br/>
<%@include file="Grid.jsp" %>
</body>
</html>
