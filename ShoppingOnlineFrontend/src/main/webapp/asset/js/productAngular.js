
var app = angular.module('OnlineShopping', []);


app.controller('ProductController', function($http) {

	var me = this;
	
	me.mpProducts = [];
	me.mvProducts = [];
	me.fetchProducts = function() {
		
		$http.get('/ShoppingOnlineFrontend/json/data/product/ps/products')
		.then(function(response) {
			me.mpProducts = response.data;
	});
		
		$http.get('/ShoppingOnlineFrontend/json/data/product/vs/products')
		.then(function(response) {
			me.mvProducts = response.data;
	});
		
	}
});
