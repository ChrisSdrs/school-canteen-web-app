<#import "/spring.ftl" as spring />


<html>
<head>
    <title>Products</title>
    <#include "../partials/head.ftlh">
</head>
<body>

<#include "../partials/navbar.ftlh">

<#assign page = "Products-Create">
<#include "../partials/main_content_top.ftlh">

<h3 class="mb-3">Create Product</h3>
<div class="table-responsive">

    <#include "../forms/productCreateForm.ftlh" />
</div>

<#include "../partials/main_content_bottom.ftlh">
<#include "../partials/scripts.ftlh">
<script src="/scripts/productValidation.js"></script>
<script src="/scripts/main.js"></script>

</body>
</html>

