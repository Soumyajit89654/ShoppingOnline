<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/rs/css" />
<spring:url var="images" value="/rs/images" />
<spring:url var="js" value="/rs/js" />
   <c:set var="contextRoot" value="${pageContext.request.contextPath}" /> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <meta charset="utf-8">

<title>${title}</title>

<script >
	window.contextRoot='${contextRoot}';
</script>

<!-- navbar -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  
<!-- breadcrumb css -->
<link rel="stylesheet" href="${css}/breadcrumb.css">
<!-- sidebar css -->
<link rel="stylesheet" href="${css}/sidebar.css">
  <link rel="stylesheet" href="${css}/dropdown.css">


<!-- datable  bootstrap css -->
<link rel="stylesheet" href="${css}/dataTables.bootstrap.css">
<!-- datatable jquery css -->
<link rel="stylesheet" href="${css}/jquery.dataTables.css">

  </head>
  

<body>


   <!-- Navigation -->
    <%@include file="./shared/navbar.jsp" %>
    
    <!-- sidebar -->
    <%@include file="./shared/sidebar.jsp" %>  
    
   
   	<c:if test="${userclickcategoryproducts ==true || userclickallproducts==true}">
   	  <%@include file="refproduct.jsp" %> 
   	</c:if>
   
      <!-- datatable javascript links -->
     <!-- Datatable Core  -->
    <script src="${js}/dataTables.bootstrap.js"></script>
    
    <!-- Datatable jquery JavaScript -->
    <script src="${js}/jquery.dataTables.js"></script>
    
    <!-- custom JavaScript -->
    <script src="${js}/myscript.js"></script>
    
</body>
</html>