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

<h3 class="">Search Orders</h3>
<div class="table-responsive">
    <#include "../forms/orderSearchForm.ftlh" />
</div>

<#include "../partials/main_content_bottom.ftlh">

<#include "../partials/scripts.ftlh">
</body>
</html>

