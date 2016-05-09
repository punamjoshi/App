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
    <form:form class="login-form"  method="get" action="save"  commandName="product" enctype="multipart/form-data">
     <form:input path="prodid" placeholder="ProductID"/>
      <form:input path="ctg" placeholder="Category"/>
      <form:input path="subctg" placeholder="Sub Category"/>
       <form:input path="pqty" placeholder="Quantity"/>
        <form:input path="price" placeholder="Price"/>
         <form:input path="pname" placeholder="Name"/>
         
         Add Image: <form:input type="file" name="file" id="file" path="file"/>
     <%--  Name: <input type="text" name="name"><br /> <br /> 
        <a href="<c:url value="/upload"/>">Upload</a> --%>
        <br /> <br/>
      <input type="submit" value="Add">
     
    </form:form>
  </div>
</div>

</body>
</html>