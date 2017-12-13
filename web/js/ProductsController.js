angular.module('App').controller('ProductsController', function($scope, ProductsService) {
    $scope.products = ProductsService.getProducts();
});