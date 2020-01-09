<#import "/spring.ftl" as spring />


<html>
<head>
    <title>Users</title>
    <#include "../partials/head.ftlh">
</head>
<body>

<#include "../partials/navbar.ftlh">

<#assign page = "Users-Search">
<#include "../partials/main_content_top.ftlh">

<div class="table-responsive">
    <h3 class="">Search Owners</h3>
    <#include "../forms/userSearchForm.ftlh" />
    <#include "../partials/users_table.ftlh" />
</div>

<#include "../partials/main_content_bottom.ftlh">
<#include "../partials/delete_confirm_modal.ftlh" />
<script src="/scripts/main.js"></script>
<#include "../partials/scripts.ftlh">
</body>
</html>

