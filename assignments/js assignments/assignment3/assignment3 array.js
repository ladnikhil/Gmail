

var fruits  = ['mango','banana','apple','orange','guava'];

console.log('=========various methods======')

fruits.push('pineapple','watermelon');
console.log("fruits after push:"+fruits);

console.log('=======pop()=========')

fruits.pop();
console.log("fruits after pop:"+fruits);

console.log('=========unshift()=======')

fruits.unshift('coconut','custard');
console.log("fruits after unshift:"+fruits);

console.log('=========shift()=======')

fruits.shift();
console.log("fruits after shift:"+fruits);

console.log('=========includes()=======')

var hasfruits = fruits.includes('guava');
console.log("fruits after include:"+hasfruits);

console.log('=========splice()=======')

fruits.splice(0,1,'lemon','guava');
console.log(fruits);

console.log('=========slice()=======')
var slicefruits = fruits.slice(0,2);
console.log(slicefruits);
console.log(fruits);

console.log('=========join()=======')
var joinfruits = fruits.join('---');
console.log(joinfruits);

console.log('=========indexof()=======')
var indexfruits = fruits.indexOf('mango');
console.log(indexfruits);

console.log('=========map()=======')

var numbers = [20,40,60,80];
var newnumbers = numbers.map((val,index)=>{
    val=val+10;
    return val;
});
console.log("old array is:"+numbers);
console.log("=======================");
console.log("new array is:"+newnumbers);


console.log('=========filter()=======')

var numbers = [10,20,30,40];
var newnumbers1 = numbers.filter((val,index)=>{
    val=val>30;
    return val;
});
console.log("old array is:"+numbers);
console.log("=======================");
console.log("filtered array is:"+newnumbers1);


console.log("==========================================")

var sports  = ['cricket','football','badminton','tennis','volleyball'];

console.log('=========various methods======')

sports.push('hockey','basketball');
console.log("sports after push:"+sports);

console.log('=======pop()=========')

sports.pop();
console.log("sports after pop:"+sports);

console.log('=========unshift()=======')

sports.unshift('chess','shooting');
console.log("sports after unshift:"+sports);

console.log('=========shift()=======')

sports.shift();
console.log("sports after shift:"+sports);

console.log('=========includes()=======')

var hassports = sports.includes('cricket');
console.log("sports after include:"+hassports);

console.log('=========splice()=======')

sports.splice(0,1,'rugby','swimmimg');
console.log(sports);

console.log('=========slice()=======')

var slicesports = sports.slice(0,4);
console.log(slicesports);
console.log(sports);

console.log('=========join()=======')

var joinsports = sports.join('---');
console.log(joinsports);

console.log('=========indexof()=======')

var indexsports = sports.indexOf('cricket');
console.log(indexsports);

console.log('=========map()=======')

var numbers = [50,40,30,20];
var newnumbers = numbers.map((val,index)=>{
    val=val+20;
    return val;
});
console.log("old array is:"+numbers);
console.log("=======================");
console.log("new array is:"+newnumbers);


console.log('=========filter()=======')

var numbers = [100,200,300,400];
var newnumbers1 = numbers.filter((val,index)=>{
    val=val>300;
    return val;
});
console.log("old array is:"+numbers);
console.log("=======================");
console.log("filtered array is:"+newnumbers1);