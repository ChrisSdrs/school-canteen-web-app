jQuery(function ($){
    $('#repairVal').validate({
        rules:{
            cost:{
                required: true
            },
            owner:{
                required: true,
                digits: true
            },
            address:{
                required: true
            }
        },
        messages:{
            cost:{
                required: "Enter cost"
            },
            owner:{
                required: "Enter owner's Social Security Number"
            },
            address:{
                required: "Enter address"
            }
        }
    });
    $( document ).ready(function() {
        RemoveCommaFromCost();
    });

    $('#cost').change(function(){
        RemoveCommaFromCost();
    });

    function RemoveCommaFromCost(){
        var costValue = $('#cost').val();
        costValue = costValue.replace(",","");
        $('#cost').val(costValue);
    };
});