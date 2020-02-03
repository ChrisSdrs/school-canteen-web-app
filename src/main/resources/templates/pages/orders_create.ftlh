<#import "/spring.ftl" as spring />


<html>
<head>
    <title>Order Create</title>
    <#include "../partials/head.ftlh">
</head>
<body>

<#include "../partials/navbar.ftlh">

<#assign page = "Orders-Create">
<#include "../partials/main_content_top.ftlh">

<h3 class="mb-3">Create Order</h3>
<div class="table-responsive">

    <#include "../forms/orderCreateForm.ftlh" />
</div>

<#include "../partials/main_content_bottom.ftlh">
<#include "../partials/scripts.ftlh">
<script src="/scripts/orderValidation.js"></script>
<script src="/scripts/main.js"></script>

</body>
</html>

