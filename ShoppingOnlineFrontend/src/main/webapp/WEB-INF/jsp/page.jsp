<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/rs/css" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
<title>${title}</title>

<script >
	window.contextRoot='${contextRoot}';
</script>

    
  <link rel="stylesheet" href="${css}/dropdown.css">

 
  <link rel="stylesheet" href="${css}/page.css">
  
  
  
  <!-- navbar -->

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="   https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  
  <!-- caorozol -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  
  <!-- slickslider -->
  <script
  src="https://code.jquery.com/jquery-3.6.0.js"></script>
<link rel="stylesheet" href="https://unpkg.com/flickity@2/dist/flickity.min.css">
<script src="https://unpkg.com/flickity@2/dist/flickity.pkgd.min.js"></script>

<!-- footer -->

<link rel="stylesheet"type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css"
 integrity="sha512-YWzhKL2whUzgiheMoBFwW8CKV4qpHQAEuvilg9FAn5VJUDwKZZxkJNuGM4XkWuk94WCrrwslk8yWNGmY1EduTA==" crossorigin="anonymous" 
 referrerpolicy="no-referrer" />
</head>
<body>


   <!-- Navigation -->
    <%@include file="./shared/navbar.jsp" %>
   <!-- sidebar -->
    <%@include file="./shared/sidebar.jsp" %>  
     <!-- carozol -->
    <%@include file="./shared/carozol.jsp" %>
    
    
    
    
     <!-- slickslider -->
    <%@include file="./shared/slickslider.jsp" %>
    
    <!-- footer -->
    <%@include file="./shared/footer.jsp" %>
</body>
</html>