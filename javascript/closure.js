console.log("========closure==============")

function sum(a,b){
    function addfunc(){
        return a+b;
    }
    return addfunc;
}
var addfunc = sum(20,30);
var total = addfunc();
console.log('total is',total);

console.log("========================this,window can access any js objects");

console.log(window);
console.log(this);
console.log(this===window);
var name='Rakshith'
console.log(window.name);
console.log(this.name);

var person = {
    name:'Nikhil Lad',
    age: 21,
    getname: function(){
        console.log(this);
        console.log(window);
        getData();
        function getData(){
            console.log("get data method"+this.name);
        }

        return this.name;
    }
}
var heroname = person.getname();
console.log("heroname  is ",heroname);

console.log("============================let and const keyword==========================");

for(var i=0;i<5;i++){
    console.log(i);
}
console.log("value is :",i);

for(let j=0;j<5;j++){
    console.log(j);
}
// console.log("value is :",j);

var hobbies = ['dancing','singing','cricket'];
console.log("hobbies are ",hobbies);
var hobbies = ['numismatics'];
console.log("hobbies are ",hobbies);
hobbies = ['singing'];

console.log("===================let===================")

let fruits = ['orange','banana'];
console.log("fruits are ",fruits);
// let fruits = ['jackfruit'];   // let keyword cant be redeclared
// console.log("fruits are ",fruits);

console.log("================const======================")

const items = ['deo','wallet'];
console.log("items are",items);
// const items = ['bags','books'];
// console.log("items are",items);    const keyword cant be redeclared and cant be reinitailaised

let arr = [10,[10,20],[30,40]];
for(let i=0;i<arr[1].length;i++){
    console.log(arr[i]);
}