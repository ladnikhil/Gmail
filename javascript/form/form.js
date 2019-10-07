console.log("======================username validation=================");

function validateform(){
    let formdata = document.forms[0];
    //console.log(formdata.unname.value);
    let username = formdata.unname.value;
    let passwordvalue = formdata.passwrd.value;

    if(username.length>4 && passwordvalue.length>7){
        console.log("success");
        formdata.unname.style.border = '1px solid green';
        formdata.passwrd.style.border = '1px solid green';
        formdata.loginsubmit.disabled = false;
    }
    
    else{
        formdata.unname.style.border = '1px solid red';
        formdata.passwrd.style.border = '1px solid red';
        formdata.loginsubmit.disabled = true;
    }
}

console.log("======================password validation=================");

// function validateform1(){
//     let formdata = document.forms[0];
//     let passwordvalue = formdata.passwrd.value;
//     if(passwordvalue.length>7){

//         formdata.passwrd.style.border = 'none';
//     }
//     else{
//         formdata.passwrd.style.border = '2px solid red';   
//     }
// }

