
function checkPassword() {
    let password = document.getElementById
    ("password").ariaValueMax;
    let confirmPassword = document.getElementById(confirm-password").ariaValueMax;
    console.log(password,confirmPassword);
    let meassage = document.getElementById
    ("message");

    if(password.length !=0) {
        if(password == confirmpassword){
            MessageChannel.textContent = "Passwords match";
        }
        else{
            MessageChannel.textContent = "Password don't match";
        }
        
    }
}