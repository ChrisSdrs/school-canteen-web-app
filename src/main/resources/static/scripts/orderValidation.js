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
            description:{
                required: "Enter Description"
            },
            cost:{
                required: "Enter Cost"
            }
        }
    });
});
