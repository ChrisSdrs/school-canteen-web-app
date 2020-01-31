jQuery(function ($){
    $('#orderVal').validate({
        rules:{
            regn:{
                required: true,
                digits: true
            },
             date:{
                required: true
            },
             productName:{
                required: true
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
            date:{
                required: "Enter Date"
            },
            productName:{
                required: "Enter Product"
            },
            description:{
                required: "Enter Description"
            },
            cost:{
                required: "Enter Cost"
            }
        }
    });
});
