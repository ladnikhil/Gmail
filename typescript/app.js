var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var myname = 'NIKHIL';
// alert(myname);
var company;
company = 'ustglobal';
company = 23;
console.log(company);
console.log(myname);
var sample; ////// union datatype
sample = 10;
sample = true;
console.log(sample);
var myarray = ['safaa', 'dsvsdv']; /// for string
console.log(myarray);
console.log("======================tuple==============");
var mytuple = ['saffa', 50, true]; /// use same order here
console.log(mytuple);
console.log("======================enum==============");
var colors;
(function (colors) {
    colors["green"] = "danger";
    colors["yellow"] = "success";
    colors["blue"] = "primary";
})(colors || (colors = {}));
console.log(colors.green);
console.log("======================classes==============");
var Person = /** @class */ (function () {
    // name: string = 'nikhil';
    // age:number = 21;
    function Person(personname, personage) {
        this.personname = personname;
        this.personage = personage;
        // this.name = personname;
        // this.age = personage;
    }
    return Person;
}());
var person = new Person('nikhil', 21); // object creation  use lowercase
console.log(person.personage);
// class Car{
//     brand: string = 'BMW';   // non static
//     static model: string ='x5';
// }
// // for non static we have to create a bobjects
// let bmwCar = new Car();
// console.log(bmwCar.brand);
// // for static we can directly access class.object
// console.log(Car.model);
console.log("=======================class with constructor=========================");
var Car = /** @class */ (function () {
    function Car(brand, model) {
        this.brand = brand;
        this.model = model;
    }
    return Car;
}());
var bmwCar = new Car('BMW', 'x5');
console.log(bmwCar.brand);
console.log(bmwCar.model);
console.log("=======================inheritance===========");
var Person1 = /** @class */ (function () {
    function Person1(name, age) {
        this.name = name;
        this.age = age;
    }
    return Person1;
}());
var Student = /** @class */ (function (_super) {
    __extends(Student, _super);
    function Student(myname, myage, USN) {
        var _this = _super.call(this, myname, myage) || this;
        _this.myname = myname;
        _this.myage = myage;
        _this.USN = USN;
        return _this;
    }
    return Student;
}(Person1));
var person1 = new Person1('dinga', 21); // we should have same number of parameters as declared in constructor         
console.log(person1.name);
var Student1 = new Student('nikhil', 21, 465433216);
console.log(Student1.myname);
console.log("===================interface======================");
var Person = /** @class */ (function () {
    function Person() {
        this.name = 'nikhil';
        this.age = 21;
    }
    Person.prototype.printDetails = function () {
        console.log("name is " + this.name + "age is " + this.age);
    };
    return Person;
}());
var p1 = new Person();
p1.printDetails();
var student1 = {
    name: 'nik',
    age: 21,
    printDetails: function () {
        console.log("name is" + student1.name + "age is" + student1.age);
    }
};
student1.printDetails();
console.log("===================GENERICS======================");
function getArray(items) {
    return new Array().concat(items);
}
var strarray = (getArray(['ADFADF', 'adfadfa', 'cCxCf']));
var numarray = getArray([2332, 541132]);
numarray.push(50);
console.log(numarray);
