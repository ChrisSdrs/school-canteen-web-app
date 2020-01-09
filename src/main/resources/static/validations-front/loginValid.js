jQuery(function ($){
    $('#create-user').validate({
        rules: {
            username: {
                required: true
            },
            password: {
                required: true
            }
        },
        messages: {
            username: {
                required: 'Please enter your username'
            }
        }
    });
});