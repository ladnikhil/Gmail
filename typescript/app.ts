let myname: string = 'NIKHIL';
// alert(myname);
let company:any;
company = 'ustglobal';
company = 23;
console.log(company);
console.log(myname);


let sample: number | boolean; ////// union datatype
sample = 10;
sample = true;
console.log(sample);


let myarray :string[] = ['safaa','dsvsdv'] /// for string
console.log(myarray);

console.log("======================tuple==============");

let mytuple: [string,number,boolean] = ['saffa',50,true];/// use same order here
console.log(mytuple);

console.log("======================enum==============");

enum colors{                                   // it will initialize every element with numbers and gives incremented values if not initialized
    green = 'danger'
    ,yellow = 'success'
    ,blue = 'primary'
}
console.log(colors.green)

console.log("======================classes==============");


class  Person {                                  //always first letter capital
    // name: string = 'nikhil';
    // age:number = 21;
    constructor(public personname:string,public personage:number){     //constructor is called when we define obects
        // this.name = personname;
        // this.age = personage;
    }
}

let person = new Person('nikhil',21);        // object creation  use lowercase
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

class Car{
    constructor(public brand: string,public model:string){

    }
}


let bmwCar = new Car('BMW','x5');
console.log(bmwCar.brand);


console.log(bmwCar.model);


console.log("=======================inheritance===========")


class Person1 {
    constructor(public name: string,public age: number){

    }
}

class Student extends Person1{
    constructor(public myname: string,public myage: number,public USN:number){
        super(myname,myage);                             // to extract properties of parent class
    }
}

let person1 = new Person1('dinga',21);        // we should have same number of parameters as declared in constructor         
console.log(person1.name);
let Student1 = new Student('nikhil',21,465433216);
console.log(Student1.myname);


console.log("===================interface======================")

// WE have members without initialization in interface

interface Students{
	name:string ;
	age:number;
	printDetails(): void;               //we can have only abstract classes in interfaces
}

class Person implements Students{
    name = 'nikhil';
    age =  21;
    printDetails(){
        console.log("name is "+ this.name + "age is " + this.age);
    }

}

let p1 = new Person();
p1.printDetails();

let student1:Students = {
    name : 'nik',
    age: 21,
    printDetails:()=>{
        console.log("name is"+ student1.name + "age is" + student1.age);
    }

}

student1.printDetails();

console.log("===================GENERICS======================");

function getArray<p>(items:p[]):p[]{
    return new Array<p>().concat(items);
}

let strarray = (getArray<string>(['ADFADF','adfadfa','cCxCf']));
let numarray = getArray<number>([2332,541132]);
numarray.push(50);
console.log(numarray);


