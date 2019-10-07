// conform password


function validate(){
   let employeedata =  document.forms['employeeform'];
   let emppassword = employeedata.pass.value;
   let empcpassword = employeedata.cpass.value;

if(emppassword =="" && empcpassword ==""){
alert("enter password");
return false;

}
   else if(emppassword === empcpassword){
       alert("success");
       return true;

   }
   else{
       alert("password not matching");
       return false;
   }
}