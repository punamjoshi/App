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
<body>
<div class="register-form " >

  <div class="form">
   <h3>Register Here</h3>
    <form class="login-form">
      <input type="text" placeholder="username"/>
      <input type="password" placeholder="password"/>
       <input type="text" placeholder="mob"/>
        <input type="text" placeholder="email"/>
         <input type="text" placeholder="address"/>
          <input type="text" placeholder="country"/>
           <input type="text" placeholder="city"/>
      <button>Register</button>
     
    </form>
  </div>
</div>

</body>
</html>