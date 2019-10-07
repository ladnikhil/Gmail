function sayhello(){
    alert('hello');
}
console.log("=============to write function in js (onclick()) ==========");

let buttonelement = document.getElementById('clickbutton');
buttonelement.onclick = function(){
    alert('hello world');
}

console.log("==================onclick()=========================")


function createele(){
    let pelement = document.createElement('p');
    pelement.textContent = 'this is p element';
    document.body.appendChild(pelement);

}

console.log("==================addeventlistener and click=========================")

    let alertelement = document.getElementById('alert');
    alertelement.addEventListener('click',function(){
        alert('good evening');
    })

console.log("==================onkeyup=========================")

let h1element = document.createElement('h1');
function showtext(){
let inputelement = document.getElementById('showdata');
console.log(inputelement.value);


h1element.textContent = inputelement.value;
document.body.appendChild(h1element);
}