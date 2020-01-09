jQuery(function ($){
    $('#propertyVal').validate({
        rules:{
            pin:{
                required: true,
                digits: true
            },
            year:{
                required: true,
                digits: true
            },
            address:{
                required: true
            },
            owner:{
                required: true
            }
        },
        messages:{
            pin:{
                required: "Enter pin"
            },
            year:{
                required: "Enter year of construction"
            },
            address:{
                required: "Enter address"
            },
            owner:{
                required: "Enter owner's Social Security Number"
            }
        }
    });
    $( document ).ready(function() {
            RemoveCommaFromCost();
        });

        $('#year').change(function(){
            RemoveCommaFromCost();
        });

        function RemoveCommaFromCost(){
            var costValue = $('#year').val();
            costValue = costValue.replace(",","");
            $('#year').val(costValue);
        };
});