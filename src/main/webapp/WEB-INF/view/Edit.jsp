<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
 <link rel="stylesheet" href="<c:url value='/resources/css/style.css'/>">
<title>Insert title here</title>
</head>
<body>
<div class="register-form " >
   
  <div class="form">
   <h3>Add Product </h3>
    <c:if test="${!empty productObject}"> 
    <form:form class="login-form"  method="POST" action="update"  modelAttribute="product" enctype="multipart/form-data">
       <form:input path="prodid" value="${productObject.prodid}" />
     <form:input path="pname" value="${productObject.pname}" />
      <form:input path="ctg" value="${productObject.ctg}"/>
      <form:input path="subctg" value="${productObject.subctg}"/>
       <form:input path="pqty" value="${productObject.pqty}"/>
        <form:input path="price" value="${productObject.price}"/>
       
         
         Add Image: <input type="file"  path="file" name="file" id="file"/>
     <%--  Name: <input type="text" name="name"><br /> <br /> 
        <a href="<c:url value="/upload"/>">Upload</a> --%>
        <br /> <br/>
      <input type="submit" value="Update">
     
    </form:form>
    </c:if>
  </div>
</div>

</body>
</html>