jQuery(function ($){
    $('#login').validate({
    rules:{
            username:{
                required: true
            },
            password:{
                required: true
            }
        },
        messages:{
            username:{
               required: 'Enter username'
            },
            password:{
               required: 'Enter password'
            }
        }
    });

    $('.error').on('keyup', function (e) {
        var $input = $(this);
        var val = $.trim($input.val());
        $input.removeClass("invalid");

        if (e.which !== 13 || !val) {
            return;
        }

        if (val != "password") {
            $input.select();
            $input.addClass("invalid");
        }
    });
});