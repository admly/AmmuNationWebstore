angular.module("App", []).
    value('endpoint', window.location.protocol + '//' + window.location.hostname + ':8989/api');
