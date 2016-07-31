"use strict";

var app = angular.module("navigation",['ngRoute']);

//app.factory('ServiceVoyage', function ($http,$log) {
//	var service = {};
//	
//	service.request = function(page){
//		return $http.get(page);
//	};
//	
//	return service;
//});


app.controller("mainController",function($scope){
	

});

app.controller("loginController",function($scope){

});

app.controller("signupController",function($scope){

});

app.controller("contactController",function($scope){

});


app.config(function($routeProvider){
	$routeProvider
		.when('/accueil',{controller:'mainController',templateUrl:"index.html"})
		.when('/login',{controller:'loginController',templateUrl:"fragments/login.html"})
		.when('/signup',{controller:'signupController',templateUrl:"fragments/signup.html"})
		.when('/contact',{controller:'contactController',templateUrl:"fragments/contact.html"})
		.when('/voyages',{controller:'contactController',templateUrl:"fragments/voyages.html"})
		.otherwise({redirectTo: '/'});
});