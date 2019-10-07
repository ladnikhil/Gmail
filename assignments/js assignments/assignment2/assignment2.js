
console.log("========circumference of circle======")

var factorial = function(n){
    
    if(n===0||n===1)
    {
    return 1; 
    } 
    else
    {
            return n * factorial(n-1);
    }
}
var factorial1 = factorial(4);
console.log("factorial of no is:"+factorial1);

console.log("========circumference of circle======")

function circum(r){
    var c = 2*3.14*r;
    return c;
}
var circumference = circum(5);
console.log("circumference is:"+circumference);

console.log("========prime no======")

var prime = (n)=>{
    if(n===0||n===1)
    {
        return false;
    }
    else if (n===2){
        return true;

    }
    else{
        for(i=2;i<n;i++)
        {
            while(n%i===0)
            {
                return false;
            }
        }
        return true;
    }
}

var primeno = prime(11);
 console.log(primeno);

 console.log("========fibonacci series======")

 function fibo(n){
     var first = 0;
     var second = 1;
     var next = 0;
     for(i=0;i<n;i++)
     {
         next = first + second;
         first=second;
         second = next;
         console.log(next);

     }
     
 }
 
 fibo(5);

 console.log("========addition of arrays======")

 function arrayaddition(){
     var a=[1,2,3,4,5];
     var j = 0;
     for(var i=0;i<a.length;i++)
     {
         j = j + a[i];
     }
     return j;
 }
 var array = arrayaddition();
 console.log("array adition is:"+array);

 