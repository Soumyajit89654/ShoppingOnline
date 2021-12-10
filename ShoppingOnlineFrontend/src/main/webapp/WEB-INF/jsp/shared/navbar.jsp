<%@taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
	<script>
		window.userRole = '${userModel.role}';
	</script>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="sidebar.jsp"></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="${contextRoot}/">Online Shopping</a></li>
      <li><a href="${contextRoot}/aboutus">About</a></li>
      <li><a href="${contextRoot}/service">Services</a></li>
      <li><a href="${contextRoot}/contactus">Contact</a></li>
      <li><a href="${contextRoot}/product/show/all/products">All Product</a></li>
      
    <security:authorize access="hasAuthority('ADMIN')">
      <li><a href="${contextRoot}/manage/product">Manage Product</a></li>
      </security:authorize>
    </ul>
    <ul class="nav navbar-nav navbar-right">
    						<security:authorize access="isAnonymous()">
      <li><a href="${contextRoot}/register"><span class="glyphicon glyphicon-user"></span>Sign Up</a></li>
      <li><a href="${contextRoot}/login"><span class="glyphicon glyphicon-log-in"></span>Login</a></li>
                             </security:authorize>
                             
           <security:authorize access="isAuthenticated()">
					
					
            <div class="dropdown" style="float:right;">
             <button class="dropbtn">${userModel.fullName}</button>
              <div class="dropdown-content">
              <security:authorize access="hasAuthority('USER')">
								<li id="cart"><a href="${contextRoot}/cart/show"> <span
										class="glyphicon glyphicon-shopping-cart"></span>&#160;<span
										class="badge">${userModel.cart.cartLines}</span> -
										&#8377;${userModel.cart.grandTotal}

								</a></li>
				</security:authorize>
                <a href="${contextRoot}/custom-logout">Logout</a>
                </div>
              </div>
              
		  </security:authorize>
                             
             
    </ul>
  </div>
</nav>
 
</body>
</html>