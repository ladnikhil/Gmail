// namespace is used for logical grouping of functionalities

namespace MathOperations{
    const PI = 3.14;
   export function circumferenceofcircle(radius:number){             //export is used to print value in name space
        console.log("circumference of circle is:"+2*PI*radius);
    }
    export function area(radius:number){
        console.log("circumference of circle is:"+PI*radius*radius);
    }
    
// circumferenceofcircle(5);
// area(5);
}

// MathOperations.circumferenceofcircle(5);
// MathOperations.area(2);

