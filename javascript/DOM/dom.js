console.log("===============getElementId()=========");

 let pelement = document.getElementById("demo");
console.log(pelement);
// //  pelement.textContent = 'this is new p tag';

console.log("===============getElementByClassName()=========");

let divelements = document.getElementsByClassName('.blue');
console.log(divelements);

let pelements = document.getElementsByTagName('p');
console.log(pelements);

let nameelements = document.getElementsByName('helement');////returns nodelist
console.log(nameelements);

let demoelements = document.querySelector('#demo');
console.log(demoelements);


let blueclasselements = document.querySelectorAll('blue');////returns nodelist
console.log(blueclasselements);

 let buttonelement = document.createElement('button');
 buttonelement.textContent = 'Click Me';
//console.log(buttonelement);
document.body.appendChild(buttonelement);

  let spanele = document.getElementById('spanid');
 spanele.style.color = 'red';

let buttonelement1 = document.getElementById('buttonele');
 buttonelement1.className = 'add';

buttonelement1.classlist = 'add add1'

console.log("===============table=========");


document.getElementById('tableid').innerHTML = 
`<table border="1px">
    <tr>
        <td>Name</td>
        <td>Age</td>
        </tr>
        <tr>
        <td>Vignesh</td>
        <td>22</td>
        </tr>
        <tr>
        <td>Bruce</td>
        <td>39</td>
        </tr>
        <tr>
        <td>Clark</td>
        <td>34</td>
        </tr>
        </table>` ;


 

let tablElement =document.createElement('table');
let tr1 =document.createElement('tr');
let trd1 =document.createElement('td');
trd1.textContent='Name';
let trd2 =document.createElement('td');
trd2.textContent='Age';

let tr2 =document.createElement('tr');
let tr2d1 =document.createElement('td');
tr2d1.textContent='nikhil';
let tr2d2 = document.createElement('td');
tr2d2.textContent ='21';

let tr3 =document.createElement('tr');
let tr3d1 =document.createElement('td');
tr3d1.textContent='sid';
let tr3d2 = document.createElement('td');
tr3d2.textContent ='24';


let tr4 =document.createElement('tr');
let tr4d1 =document.createElement('td');
tr4d1.textContent='omkar';
let tr4d2 = document.createElement('td');
tr4d2.textContent ='20';

tr1.appendChild(trd1);
tr1.appendChild(trd2);
tr2.appendChild(tr2d1);
tr2.appendChild(tr2d2);
tr3.appendChild(tr3d1);
tr3.appendChild(tr3d2);
tr4.appendChild(tr4d1);
tr4.appendChild(tr4d2);

tablElement.appendChild(tr1);
tablElement.appendChild(tr2);
tablElement.appendChild(tr3);
tablElement.appendChild(tr4);

console.log(tablElement);
document.body.appendChild(tablElement);


console.log("=====================================================");

let pelementdata = document.getElementById('.demo1')
//pelementdata.style.color = 'red';

//pelementdata.className = 'blue';

pelement.className = 'fonts'; 