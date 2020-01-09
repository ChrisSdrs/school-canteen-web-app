$(document).ready(function(){
    let alertMessage = $('#alertMessage').val();
    let alertType = $('#alertType').val();

    if (alertMessage != "" && alertType != "") {
        let alertContainer = $('#notify-alert');

        let alertDiv = $('#notify-div');

        alertDiv.addClass(" alert-" + alertType);

        alertContainer.addClass(" display");

        let alertContent = $('#alertContent');
        alertContent.html(alertMessage);

        let alertTimer = $('#alert-timer');
        alertTimer.addClass(" alert-time-run");

        setTimeout(function () {
            alertContainer.removeClass("display");
        }, 4500);

        alertMessage.val("");
        alertType.val("");
    }
});
