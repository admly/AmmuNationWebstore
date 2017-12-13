angular.module('App').service('ProductsService', function($http) {
    
    var products = {};
    
    this.init = function(successCallback) {
        // implement rest here
        products = [
                    {'name':'ak-47', 'price':'436,55', 'photo':'images/products/ak47.jpg'},
                    {'name':'mp5', 'price':'126,53', 'photo':'images/products/mp5.jpg'}
                    ];
        successCallback();
    }
    
    this.getProducts = function() {
        return products;
    }
    
});