angular.module('App').controller('RootController', function($scope, $q, ProductsService, ContentService) {

    $scope.pageLoaded = false;

    $scope.failed = function (response) {
        console.log("Failed to load!");
    }

    // after successful login start loading page
    $scope.$on('Login', function(event) {
        $scope.notAuthorized = false;

        ContentService.init(
            function() {
                $scope.$emit('ContentLoaded');
            }, $scope.failed);

        ProductsService.init(function() {
            $scope.$emit('ProductsLoaded');
        }, $scope.failed);

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