angular.module('App').controller('ContentController', function($scope, ContentService) {
    $scope.getMessage = function(messageId) {
        return ContentService.getContent(messageId);
    }
    console.log("Content Controller loaded");

});