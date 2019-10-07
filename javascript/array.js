console.log('=======for each loop=========')

var hobbies = ['singing','dancing','coding','skipping','jumping'];
hobbies.forEach(function(value,index){
    console.log('hobbies:'+value);
});

console.log('================')

hobbies.forEach((value,index)=>
{
    console.log('hobbies:'+value);
});

console.log('=========various methods======')//push adds alements in array from last

hobbies.push('bike riding','travelling');
console.log("hobbies after push:"+hobbies);

console.log('=======pop()=========')/// delete an element from array from last

hobbies.pop();
console.log("hobbies after pop:"+hobbies);

console.log('=========unshift()=======')//unshift adds alements in array from first

hobbies.unshift('cooking','walking');
console.log("hobbies after unshift:"+hobbies);

console.log('=========shift()=======')//delete an element from array from first

hobbies.shift();
console.log("hobbies after shift:"+hobbies);

console.log('=========includes()=======')//checks alements in array or not

var hashobbies = hobbies.includes('cooking');
console.log("hobbies after include:"+hashobbies);

console.log('=========splice()=======')//adds and deletes an alememnt from array 1st index is add 2nd is remove

hobbies.splice(2,0,'reading','writing');
console.log(hobbies);

console.log('=========slice()=======')//stores given indexes of array in other array(here it returns 2-1)

var slicehobbies = hobbies.slice(0,2);
console.log(slicehobbies);
console.log(hobbies);

console.log('=========join()=======')//used to give any symbol between elments

var joinhobbies = hobbies.join('---');
console.log(joinhobbies);

console.log('=========indexof()=======')//gives index of particular element nothing then returns -1

var indexhobbies = hobbies.indexOf('singing');
console.log(indexhobbies);

console.log('=========map()=======')//used to perform iteration on every element in an array

var numbers = [10,20,30,40];
var newnumbers = numbers.map((val,index)=>{
    val=val+10;
    return val;
});
console.log("old array is:"+numbers);
console.log("=======================");
console.log("new array is:"+newnumbers);


console.log('=========filter()=======')//used to filter an element in an array

var numbers = [10,20,30,40];
var newnumbers1 = numbers.filter((val,index)=>{
    val=val>30;
    return val;
});
console.log("old array is:"+numbers);
console.log("=======================");
console.log("filtered array is:"+newnumbers1);

console.log("==========================");

var items = [
    { item:'pen',price:50},
{ item:'bag',price:500},
{item:'laptop',price:50000},
{item:'mouse',price:100}
]

var newprice1 = items.map((value)=>{
     value.price = value.price + 50;
    return value;
});
console.log(newprice1);

var filteritems = items.filter((value,index)=>{
    
    return value.price>100 && value.item.length>3;
});
console.log(filteritems);




