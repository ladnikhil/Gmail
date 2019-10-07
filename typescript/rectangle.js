var rectangleoperations;
(function (rectangleoperations) {
    function area(length, breadth) {
        console.log("circumference of circle is:", length * breadth);
    }
    rectangleoperations.area = area;
})(rectangleoperations || (rectangleoperations = {}));
MathOperations.area(6, 4);
