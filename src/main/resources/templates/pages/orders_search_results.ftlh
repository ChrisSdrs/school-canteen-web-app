<#import "/spring.ftl" as spring />


<html>
<head>
    <title>Order Search</title>
    <#include "../partials/head.ftlh">
</head>
<body>

<#include "../partials/navbar.ftlh">

<#assign page = "Orders-Search">
<#include "../partials/main_content_top.ftlh">

<div class="table-responsive">
    <h3 class="">Search orders</h3>
    <#include "../forms/orderSearchForm.ftlh" />
    <#include "../partials/orders_table.ftlh" />
</div>

<#include "../partials/main_content_bottom.ftlh">
<#include "../partials/delete_confirm_modal.ftlh" />
<script src="/scripts/main.js"></script>
<#include "../partials/scripts.ftlh">
</body>
</html>

