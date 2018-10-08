const angular = require("angular");
const myApp = angular.module("myApp",[]);

class MyController{
    constructor($scope, MyService){
        $scope.a = 1;
        $scope.b = 9;
        this._vm = $scope;
        this.service = MyService; 
    }
}

export default class MyService{
    static factory(){ return new MyService(); }
}

myApp.factory();
MyController.$inject = ["$scope", "MyService"];

myApp.controller("MyController",MyController);



