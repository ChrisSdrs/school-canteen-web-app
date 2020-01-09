<div class="alertContainer" id="notify-alert">
    <div class="alert notify-alert alert-success" role="alert" id="notify-div">
        <div id="alertContent">User Updated successfuly!</div>

    </div><div class="alert-timer" id="alert-timer"></div></div>
<div class="Ghost">
    <input type="hidden" id="alertType"
        <#if alertType?has_content>
            value="${alertType}"
        </#if>
    >
    <input type="hidden" id="alertMessage"
        <#if alertMessage?has_content>
            value="${alertMessage}"
        </#if>
    >
</div>