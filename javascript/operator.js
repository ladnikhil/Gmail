console.log("============conditional operator============");

var num1 = 10;
var name = "sid";
var num2 = '10';

if(num1==num2){
    console.log("equal");
}
else{
    console.log(" not equal");
}

console.log("============ checks both type and value are equal or not====");

var num1 = 10;
var name = "sid";
var num2 = '10';

if(num1===num2){
    console.log("equal");
}
else{
    console.log("not equal");
}

console.log("========ternary operator========");

var num1 = 10;
var num2 = 20;

var equals = (num1===num2)?'True':'False';
console.log(equals);

console.log("====if elseif else=====");

var equals1 = (num1>10)?'greater':(num1===10)?'equals':'lesser';
console.log(equals1);

console.log("=====type of operator=====");

var myage= 21;
console.log("type of myage:"+typeof(myage));

var myname= 'nikhil';
console.log("type of myname:"+typeof(myname));

var hobbies = ['cricket','singing','trekking'];
console.log("type of hobbies:"+typeof(hobbies));

console.log("=====check it is array or not====");

var isarray = Array.isArray(hobbies);
console.log(isarray);

console.log("====complex array======");

var library = [     
    {author:'bill gates',title:'the road ahead',bookid:1254},
    {author:'steve jobs',title:'walter isaacson',bookid:4264},
    {author:'suzanne collins',title:'mockingjay:the final book of the hunger games',bookid:3254}

];

console.log("============to get all loop==========")

for(var i=0;i<library.length;i++){
    console.log(library[i]);
}

console.log("============to get only author==========")

 
for(var i=0;i<library.length;i++){
    console.log("authors are:"+library[i].author);
}

console.log("=========for in loop ----- returrns key and used in objects");

for(var index in hobbies){
    console.log("hobbies = "+hobbies[index]);
}

var person = {
    name:'onkar',
    age:22
};

for(var i in person){
    console.log(person[i]);
}

console.log("=================for of loop returns value and is used in arrays");

for(var value of hobbies){
    console.log(value);
}

//console.log("-----------break statement only used in loops---------");

// var val=2;
// if(val===2){
//     break;
//     console.log(val);
// }


var hobbies = ['cricket','singing','trekking'];
hobbies[3] = 'skipping';
hobbies['name']='jumping';

for(var value in hobbies){
    console.log(value);
}

for(var index in hobbies){
    console.log("hobbies = "+hobbies[index]);
}

console.log(hobbies);

