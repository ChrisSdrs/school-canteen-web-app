<html>
<head>
    <title>Home</title>
    <#include "../partials/head.ftlh">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" />
    <style>
        th:last-child, tr td:last-child {
            display: none !important;
        }
    </style>
</head>
<body>

<#include "../partials/navbar.ftlh">

<#assign page = "Home">
<#include "../partials/main_content_top.ftlh">


<div class="table-responsive">
    <div class="container py-5">
        <div class="row">
            <div class="col-md-2 text-center">
                <p><i class="fa fa-exclamation-triangle fa-5x"></i><br/>Status Code: 403</p>
            </div>
            <div class="col-md-10">
                <h3>OOOPPSSS!!!! Sorry...</h3>
                <p>Sorry, access to this page is only allowed to admins!<br/>Please go back to the previous page to continue browsing.</p>
                <a class="btn btn-danger" href="javascript:history.back()">Go Back</a>
            </div>
        </div>
    </div>
</div>


<#include "../partials/main_content_bottom.ftlh">

<!-- Modal -->
<#include "../partials/delete_confirm_modal.ftlh" />
<!-- Alerts -->
<#include "../partials/alerts.ftlh" />


<#include "../partials/scripts.ftlh">
</body>
</html>