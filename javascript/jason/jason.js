let employeejason = {                             /// javascript object
    name:'nikhil',
    age:'21',
    hobbies:['cricket','singing']
}

console.log("my name is:",employeejason.name);

console.log(`my name is ${employeejason.name}`);// string interpolation

console.log(employeejason);

console.log("===============================JSON.stringify()======")

let jasnobject = JSON.stringify(employeejason);//////// JSON.stringify object is used to convert javascript object into jason object
console.log(jasnobject);

console.log("===============================parse()======");//// parse is used to convert jason object to javascript object

let jsobject = JSON.parse(jasnobject);
console.log(jsobject);