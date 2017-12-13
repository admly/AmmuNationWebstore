angular.module('App').service('ContentService', function($http) {
    
    var content = {};
    
    this.init = function(successCallback) {
        // implement rest here
        content = 
                {
                    'welcome-message':'Witamy w sklepie Ammunation'
                };
        successCallback();
    }
    
    this.getContent = function(messageId) {
        return content[messageId];
    };
    
});