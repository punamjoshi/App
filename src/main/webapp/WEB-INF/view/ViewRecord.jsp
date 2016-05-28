<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="<c:url value='/resources/css/style.css'/>">
<title>Insert title here</title>
</head>
<body style="background: #e9e7e8;">
<div class="register-form " >
   
  <div class="form">
   <h3>View Details </h3>
    <c:if test="${!empty productObject}"> 
    <form:form class="login-form"  method="POST" action="update"  modelAttribute="product" enctype="multipart/form-data">
       <table style="margin-left: 15%;">
         <tr>  
             <td>
           <!--   <c:out value="${prod.fpath}"/>-->
          <img src="${productObject.fpath}" >
          </td>
          </tr>
         
          <tr>
            <td><c:out value="Movie Name :${productObject.pname}" />
   
          </tr>
         <tr><td>   <c:out value="Price:${productObject.price}" /> </td></tr>
        
        
        <%--   <td><c:out value="${prod.price}" />  
          </td>  
          <td><c:out value="${prod.pqty}" />  
          </td>   --%>
          <tr>
          <td><c:out value="Quantity Avalable:${productObject.pqty}" />
             </td> 
            </tr>
          
          
            <tr>
            <td><c:out value="Category :${productObject.ctg}" />
            
          </td>
          </tr>
          <tr>
          <td>
          <input type="submit" value="Book Now"/>
 </td>
          </tr>
          
          </table>
      
    </form:form>
    </c:if>
  </div>
</div>
</body>
</html>