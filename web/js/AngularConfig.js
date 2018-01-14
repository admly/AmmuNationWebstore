angular.module('App')
    .config(['$locationProvider', '$routeProvider',
        function config($locationProvider, $routeProvider) {
            $locationProvider.hashPrefix('!');

            $routeProvider.
            when('/', {
                templateUrl: "../home.html"
            }).
            when('/contact', {
                templateUrl: 'contact-us.html'
            }).
            when('/products', {
                templateUrl: 'products.html'
            })
            .when('/products/:id', {
                templateUrl: 'product-details.html'
            })
            .when('/cart', {
                templateUrl: 'cart.html'
            })
            .when('/login', {
                templateUrl: 'login.html'
            })
            .otherwise({
                templateUrl: '404.html'
            });
        }
]);