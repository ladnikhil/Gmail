// namespace is used for logical grouping of functionalities
var MathOperations;
(function (MathOperations) {
    var PI = 3.14;
    function circumferenceofcircle(radius) {
        console.log("circumference of circle is:" + 2 * PI * radius);
    }
    MathOperations.circumferenceofcircle = circumferenceofcircle;
    function area(radius) {
        console.log("circumference of circle is:" + PI * radius * radius);
    }
    MathOperations.area = area;
    // circumferenceofcircle(5);
    // area(5);
})(MathOperations || (MathOperations = {}));
// MathOperations.circumferenceofcircle(5);
// MathOperations.area(2);
