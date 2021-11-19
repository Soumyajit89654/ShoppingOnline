<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="mySidebar" class="sidebar">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
 
 <c:forEach items="${categories}" var="category">
    <a href="${contextRoot}/product/show/category/${category.id}">${category.categoryName}</a>
  </c:forEach>
</div>

<div id="main">
  <button class="openbtn" onclick="openNav()">&#9776; </button>
  
</div>
<script type="text/javascript">
  /* Set the width of the sidebar to 250px and the left margin of the page content to 250px */
function openNav() {
  document.getElementById("mySidebar").style.width = "250px";
  document.getElementById("main").style.marginLeft = "250px";
}

/* Set the width of the sidebar to 0 and the left margin of the page content to 0 */
function closeNav() {
  document.getElementById("mySidebar").style.width = "0";
  document.getElementById("main").style.marginLeft = "0";
}
</script>
