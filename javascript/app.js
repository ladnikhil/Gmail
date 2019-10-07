//arrays

var fruits = ['apple','orange','banana','mango'];
console.log(fruits);


//// other way to create objects

var fruits = new Object();
fruits



for(var i=0;i<fruits.length;i++){
    console.log(fruits[i]);
}

//dates
var todaydate = new Date();
console.log('todays date is = '+todaydate);

var todaydate1 = new Date(2018,11,24,10,33,30,0);
console.log('todays date is = '+todaydate1);

var todaydate2 = new Date(0);
console.log('todays date is = '+todaydate2);

var todaydate3 = new Date("october 12,2014 11:13:00");
console.log('todays date is = '+todaydate3);

var todaydate4 = new Date(2018,11,24);
console.log('todays date is = '+todaydate4);


var month = ['jan','feb','mar','april','may','june','july','august','september','oct','nov','dec']
console.log(month[todaydate.getMonth()]);

var days = ['sun','mon','tue','wed','thur','fri','sat','sun']
console.log(days[todaydate.getDay()]);


//math

console.log(Math.ceil(5.8));

console.log(Math.floor(5.8));

console.log(Math.round(5.8));

console.log(Math.random());

console.log(Math.pow(2,5));

console.log(Math.round(Math.random()*10));

//immMUTABLE(primitive)

var name = 'nikhil';
console.log(name);

var name1 = name;
console.log(name1);

name1 = 'gandhi';
console.log(name);
console.log(name1);

//mutable(reference)

var person = {
    name:'nikhil'
}

console.log(person.name);

var person1 = person;
console.log(person1.name);

person1.name = 'anu';
 
console.log(person.name);
console.log(person1.name);

//conditional operator

var num1 = 10;
var name = "sid";
var num2 = '10';

if(num1==num2){
    console.log("equal");
}
else{
    console.log(" not equal");
}