angular.module('App').controller('ProductsController', function($scope, ProductsService) {

    $scope.prods = ProductsService.getProducts();

});