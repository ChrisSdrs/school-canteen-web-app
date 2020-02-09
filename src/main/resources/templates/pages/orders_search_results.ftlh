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

<h3 class="mb-3">Search orders</h3>
<div class="table-responsive">
    <#include "../forms/orderSearchForm.ftlh" />
    <#include "../partials/orders_table.ftlh" />
</div>

<#include "../partials/main_content_bottom.ftlh">
<#include "../partials/delete_confirm_modal.ftlh" />
<#include "../partials/scripts.ftlh">
<script src="/scripts/main.js"></script>
</body>
</html>



