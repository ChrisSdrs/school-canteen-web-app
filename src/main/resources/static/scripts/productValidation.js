jQuery(function ($){
    $('#productVal').validate({
        rules:{
            productSerialNumber:{
                required: true,
                digits: true
            },
            productName:{
                required: true
            },
            price:{
                required: true
            }
        },
        messages:{
            productSerialNumber:{
                required: "Enter Product's Serial Number",
                digits: "Product's Serial Number must be number, please enter only digits"
            },
            productName:{
                required: "Enter product name"
            },
            price:{
                required: "Enter price"
            }
        }
    });
});