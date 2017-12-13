angular.module('App').controller('RootController', function($scope, $q, ProductsService, ContentService, endpoint) {
    // after successful login start loading page
    $scope.$on('Login', function(event) {
        $scope.notAuthorized = false;

        ContentService.init(function() {
            $scope.$emit('ContentLoaded');
        });

        ProductsService.init(function() {
            $scope.$emit('ProductsLoaded');
        });

        event.stopPropagation();

    });
    // wait for events
    var waitForContent = $q.defer();
    var waitForProducts = $q.defer();

    $q.all([waitForContent.promise, waitForProducts.promise]).then(function() {
        console.log('LOADING DONE');
        $scope.pageLoaded = true;
    });
    
    $scope.$on('ContentLoaded', waitForContent.resolve);
    $scope.$on('ProductsLoaded', waitForProducts.resolve);
    
    // swap this with AuthorizationService function -> this should emit
    $scope.$emit('Login');
});