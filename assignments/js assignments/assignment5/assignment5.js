// email validation

function validateform(){
    let formdata = document.forms[0];
    //console.log(formdata.unname.value);
    let username = formdata.unname.value;
    let name_error = document.getElementById("name_error");
    
    if(username.length>7){
        console.log("success");
        formdata.unname.style.border = '2px solid green';
        formdata.loginsubmit.disabled = false;
        name_error.style.visibility = "hidden";
    }
    else{
        formdata.unname.style.border = '2px solid red';
        name_error.textContent = "invalid username";
        name_error.style.color = 'red';
        name_error.style.visibility = "visible";
        formdata.loginsubmit.disabled = true;
        
    }
    
}

// password validation 

function validateform1(){
    let formdata = document.forms[0];
    //console.log(formdata.passwrd.value);
    let password = formdata.passwrd.value;
    let pass_error = document.getElementById("pass_error");
    

    if(password.length>7){
        console.log("success");
        formdata.passwrd.style.border = '2px solid green';
        formdata.loginsubmit.disabled = false;
        pass_error.style.visibility = "hidden";
    }
    else{
        formdata.passwrd.textContent= '2px solid red';
        pass_error.textContent = "invalid password";
        pass_error.style.color = 'red';
        pass_error.style.visibility = "visible";
        formdata.loginsubmit.disabled = true;
    }
}