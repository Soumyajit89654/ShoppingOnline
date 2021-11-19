
   	<c:if test="${userclickallproducts ==true}">
		<script>
	      window.categoryId='';
	  </script>
		<ul class="breadcrumb">
			<li><a href="${contextRoot}/">Home</a></li>
			<li>All Products</li>
		</ul>
	</c:if>
	
	<c:if test="${userclickcategoryproducts ==true}">
	  <script>
	      window.categoryId='${category.id}';
	  </script>
		<ul class="breadcrumb">
			<li><a href="${contextRoot}/">Home</a></li>
			<li>Category</li>
			<li>${category.categoryName}</li>
		</ul>
	</c:if>
	
	<div class="container">
	   <div class="row">
           <div class="col-sm-12">

				<table id="productTable" class="table table-striped table-hover">

					<thead>
						<tr>
							   <th></th>
							  <th>NAME</th>
							 <th>BRAND</th>
							<th>UNIT PRICE</th>
							<th>AVAILABLE QUANTITY</th>
							 <th></th>
						</tr>
					</thead>
					  
					   <tfoot>
						<tr>
						    <th></th>
							<th>NAME</th>
							<th>BRAND</th>
							<th>UNIT PRICE</th>
							<th>AVAILABLE QUANTITY</th>
						    <th></th>
						</tr>
					</tfoot>

				</table>
			</div>
		</div>  
	</div> 
	 
