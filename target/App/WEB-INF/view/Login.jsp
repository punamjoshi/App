<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
 <link rel="stylesheet" href="<c:url value='/resources/css/style.css'/>">
<title>Insert title here</title>
</head>
<body style="background: #e9e7e8;">
<div class="login-page">
  <div class="form">
  

     <c:out value="${message}"/>
    <form class="login-form" action="<c:url value='j_spring_security_check'/>" method="POST">
      <input type="text" placeholder="username" name="j_username"/>
      <input type="password" placeholder="password" name="j_password"/>
      <input type="submit" value="login">
     <input type="hidden" 
                     name="${_csrf.parameterName}" value="${_csrf.token}" />
    </form>
  </div>
</div>

</body>
</html>


