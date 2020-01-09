jQuery(function ($){
    $('#userVal').validate({
        rules:{
            regn:{
                required: true,
                digits: true
            },
            grade:{
                required: true
            },
            firstName:{
                required: true
            },
            lastName:{
                required: true
            },
            address:{
                required: true
            },
            email:{
                required: true,
                email: true
            },
            phone:{
                required: true,
                digits: true
            },
            username:{
                required: true
            },
            password:{
                required: true
            },
            role:{
                required: true
            }
        },
        messages:{
            ssn:{
                required: "Enter Registration Number",
                digits: "Invalid Registration Number, R.N. type must be number"
            },
            grade:{
                required: "Enter grade"
            },
            firstName:{
                required: "Enter first name"
            },
            lastName:{
                required: "Enter last name"
            },
            address:{
                required: "Enter address"
            },
            email:{
                required: "Enter e-mail",
                email:"Invalid e-mail address"
            },
            phone:{
                required: "Enter phone",
                digits: "Invalid phone number, phone number type must be number"
            },
            username:{
                required: "Enter username"
            },
            password:{
                required: "Enter password"
            },
            role:{
                required: "Enter role"
            }
        }
    });
});