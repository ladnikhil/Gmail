

let resultData = new Promise(function(resolve,reject){
    if(10>10){
        reject('failed');
    }else{
        resolve("success");
    }
});
resultData.then((data)=>{
    console.log('then block: = '+data);
}).catch((error)=>{
    console.log("catch block: = ",+error);
});

console.log("===========================")


let employeeData = new Promise(function(resolve,reject){
    const employee = [
        {
            name:'nikhil',
            age: 21
        },
        {
            name: 'akshay',
            age:23
        },
       {     name: 'akshay',
             age:23

        }
    ];
     if(10>10){
        reject('failed');
    }else{
        resolve(employee);
    }
});
employeeData.then((data)=>{
    //console.log('employee data: = ',data);
    return data;
}).catch((error)=>{
    console.log("catch block: = ",error);
}).then(function(data1){
    console.log("this is then block 2",data1);
});



console.log("==========factorial of a functon=================")

function fact(n){
    if (n===0||n===1){
        return 1;
    }
    else {
        
            return fact(n-1)*n;
        }
    }
let factorialvalue = fact(5);
console.log(factorialvalue);