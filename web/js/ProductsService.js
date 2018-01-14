angular.module('App').service( 'ProductsService', function($http) {
    
    var products = [];

    this.init = function(successCallback, failedCallback) {
        $http.get(window.endpoint + "/products").then(
            function(respnse) {
                console.log("Product Service: Got products");
                products = respnse.data;
                console.log(products);
                successCallback();
            }, failedCallback
        )
    };
    
    this.getProducts = function(update) {
        return products;
    };
    
});