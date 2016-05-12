    <%@ page language="java" contentType="text/html; charset=UTF-8"  
     pageEncoding="UTF-8"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
    <html>  
    <head>  
    <link rel="stylesheet" href="<c:url value="/resources/css/dataTables.bootstrap.min.css"/>">
    
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>">
    
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
    <title></title>  
    </head>  
    <body >  
    <br/></br>
     <center>  
      <div class="container">
      
      <c:if test="${!empty productList}">  
       <table id="example" class="table table-striped table-bordered"  width="100%">  
        <thead>
        <tr >  
           
         <td>Product Name</td>  
      <!--    <td>Product Price</td>  
         <td>Product Quantity</td>   -->
         <td> Category</td>  
         <td> SubCategory</td>  
         <td> Image</td>  
         <td>Edit</td>  
         <td>Delete</td>   
          <td>View Record</td> 
        </tr>  
        </thead>
        <c:forEach items="${productList}" var="prod">  
         <tr>  
            
          <td><c:out value="${prod.pname}" />  
          </td>  
        <%--   <td><c:out value="${prod.price}" />  
          </td>  
          <td><c:out value="${prod.pqty}" />  
          </td>   --%>
          <td><c:out value="${prod.ctg}" />
            
          </td>  
          
          <td><c:out value="${prod.subctg}" />
            
           </td> 
           <td>
           <!--   <c:out value="${prod.fpath}"/>-->
          <img src="${prod.fpath}" height="60" width="60">
          
          </td>  
          <td width="50"><a href="<c:url value="/Edit?id=${prod.prodid}"/>" >Edit </a></td>  
          <td width="50"><a href="<c:url value="/delete?id=${prod.prodid}"/>">Delete</a></td>
            <td width="50"><a href="<c:url value="/ViewRecord?id=${prod.prodid}"/>">View Record</a></td>  
         </tr>  
        </c:forEach>  
       </table>  
      </c:if>  
      
      
     </div>
     </center>  
    </body>  
    </html>  


