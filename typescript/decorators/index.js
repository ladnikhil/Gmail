// decorator is made by using @
function printconstructor(cons) {
    console.log(cons);
}
var sample = /** @class */ (function () {
    function sample() {
        console.log('hi hello i am sample calss constructor');
    }
    return sample;
}());
