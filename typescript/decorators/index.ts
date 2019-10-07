// decorator is made by using @

function printconstructor(cons: Function){
    console.log(cons);
}

@printconstructor

class sample{
    constructor(){
        console.log('hi hello i am sample calss constructor')
    }
}