//  ajaxReuest Variable
let ajaxRequest;
function ajaxConfigure(){
    "use strict";
    try{
        ajaxRequest = new XMLHttpRequest();
    }catch(error){
        try{
            ajaxRequest = new ActiveXObject("Msxml2.XMLHTTP");
        }catch(error){
            try{
                ajaxRequest = new ActiveXObject("Microsoft.XMLHTTP");
            }catch(error){
                alert("Ajax variable creation error!");
                return false;
            }
        }
    }
}
/****************************/

function matchConfirmPassword() {
                let password = document.getElementById("form-password").value;
                let confirmPassword = document.getElementById("form-confirm-password").value;
                let textMatch = document.getElementById("text-password-match");
                            
                if(password == "" || confirmPassword=="")
                    return;
                 if(password != confirmPassword){
                    restrictSignUp(textMatch, "Password don't match!");
                }
                else{
                    textMatch.innerHTML = "";
                    allowSignUp();
                }
            }

function validateEmail(){
    let email = document.getElementById("form-email").value;
    let regex_email = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
  
    let validEmail = document.getElementById("valid-email");
    if(regex_email.test(email) ){
        reUseEmail([email]);
        validEmail.innerHTML = "";
        allowSignUp();
    }
    else{
            restrictSignUp(validEmail,"Please enter valid Email Address...")
        }
}

function processRequest(){
    "use strict";
    if (this.readyState == 4){
        if(this.status == 200){
            if(this.responseText == "true")
               restrictSignUp(document.getElementById("valid-email"), "User already exist... Please Login!");
        }
    }
}

function reUseEmail(email){
    "use strict";
    ajaxConfigure();

    ajaxRequest.onreadystatechange = processRequest;

    let url ="validateEmailReUse?email="+email;
    ajaxRequest.open("GET",url,true);
    ajaxRequest.send(JSON.stringify({email:email}));
}

function allowSignUp(){
    "use strict";

    let email = document.getElementById("form-email").value;
    let password = document.getElementById("form-password").value;

    let validEmail = document.getElementById("valid-email");
    let textMatch = document.getElementById("text-password-match");
    let registerButton = document.getElementById("button-register");
    console.log("allowSignUp");
    console.log(validEmail.innerHTML)
    console.log(textMatch.innerHTML)
    if(email && password)
    if(validEmail.innerHTML == "" && textMatch.innerHTML == "") {
        registerButton.removeAttribute("disabled");
    }
    else{
        registerButton.setAttribute("disabled", "");
    }
}

function restrictSignUp(tag,error){
    "use strict";
    console.log("restrictSignUp-" + error);
    tag.innerHTML = error;
    document.getElementById("button-register").setAttribute("disabled","");
}