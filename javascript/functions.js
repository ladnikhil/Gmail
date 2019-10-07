console.log("========named function====");

function getSum(a,b){
    var c = a+b;
    return c;
}
var sumvalue = getSum(20,30);
console.log(sumvalue);


console.log("========one more method to define function(function expression)anonymous function====");

var sumdata = function(n1,n2){
    var sum = n1 + n2;
    return sum;
}
var sumvalue1 = sumdata(5,30);
console.log(sumvalue1);

console.log("========(immediately ivoked function expression)====");

(function(a,b){
    var s = a+b;
    console.log("sum = "+s);

}(10,12));

console.log("========fat arrow function====");

var div = (a,b)=>{
    var d = a/b;
    return d;
}
var division = div(8,4);
console.log("division is "+division);

console.log("========hoisting====");

console.log(name2);
var name2 = 'nikhil';
console.log(name2);

function add(){
    console.log(name3);
    name3 = 'sunil';
}
add();

function add(){
    var name4;
    console.log(name4);
    name4 = 'omkar';
}

console.log("====== call back function ======");


function first(callback){
    setTimeout(function(){
        console.log("first");
        callback();
    } );
    
}


function second(){
    console.log("second");
}
first(second);
// second();






