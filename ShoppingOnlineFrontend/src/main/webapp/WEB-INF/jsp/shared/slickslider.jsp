<script src="${js}/angular.js"></script>

<script src="${js}/productAngular.js"></script>

<div class="container" ng-app="OnlineShopping"
	ng-controller="ProductController as pc">

	<div class="row" ng-init="pc.fetchProducts()">


			<div class="row">
				<div class="col-xs-12">
					<h3>Our Most Purchassed Products</h3>
					<hr />
				</div>
			</div>

			<div class="row is-table-row">

				<div class="col-sm-4" ng-repeat="product in pc.mpProducts">
					<div class="thumbnail">
						<img ng-src="${images}/{{product.code}}.jpg"
							alt="{{product.name}}" class="landingImg">
						<h5>{{product.name}}</h5>
						<hr />
						<div class="caption">
							<h4 class="pull-right">&#8377; {{product.unitPrice}}</h4>

							<a ng-href="${contextRoot}/product/show/{{product.id}}/product"
								class="btn btn-primary pull-right">View</a>
						</div>
					</div>
				</div>

				<div class="col-sm-4 col-lg-4 col-md-4">
					<h4>Checkout more products!</h4>
					<hr />
					<a class="btn btn-primary"
						href="${contextRoot}/product/show/all/products">More Products</a>
				</div>
			</div>


			<div class="row">
				<div class="col-xs-12">
					<h3>Our Most Viewed Products</h3>
					<hr />
				</div>
			</div>

			<div class="row is-table-row">

				<div class="col-sm-4" ng-repeat="product in pc.mvProducts">
					<div class="thumbnail">
						<img ng-src="${images}/{{product.code}}.jpg"
							alt="{{product.name}}" class="landingImg">
						<h5>{{product.name}}</h5>
						<hr />
						<div class="caption">
							<h4 class="pull-right">&#8377; {{product.unitPrice}}</h4>

							<a ng-href="${contextRoot}/product/show/{{product.id}}/product"
								class="btn btn-primary pull-right">View</a>
						</div>
					</div>
				</div>

			</div>
		</div>




	</div>
