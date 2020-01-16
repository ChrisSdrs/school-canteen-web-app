jQuery(function ($){
    $('#orderVal').validate({
        rules:{
            regn:{
                required: true,
                digits: true
            },
            description:{
                required: true
            },
            cost:{
                required: true,
            }
        },
        messages:{
            regn:{
                required: "Enter Registration Number",
                digits: "Enter only digits"
            },
            description:{
                required: "Enter Description"
            },
            cost:{
                required: "Enter Cost",
            }
        }
    });
});
