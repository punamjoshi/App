<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <link rel="stylesheet" href="<c:url value='/resources/css/style.css'/>">
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<title>Insert title here</title>
</head>
<body style="background: #e9e7e8;">
<div class="register-form " >

  <div class="form">
   <h3>Register Here</h3>
    <form:form class="login-form" method="POST" action="saveUser"   commandName="userData" >
      <form:input path="userId" placeholder="userId"/>
       <form:input path="username" placeholder="username"/>
      <form:input path="password" placeholder="password"/>
       <form:input path="mobno" placeholder="mob"/>
        <form:input path="email" placeholder="email"/>
         <form:input path="address" placeholder="address"/>
          <form:input path="country" placeholder="country"/>
           <form:input path="city" placeholder="city"/>
      <button>Register</button>
     
    </form:form>
  </div>
</div>

</body>
</html>