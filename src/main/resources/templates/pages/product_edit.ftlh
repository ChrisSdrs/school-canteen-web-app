<#import "/spring.ftl" as spring />


<html>
<head>
    <title>Products</title>
    <#include "../partials/head.ftlh">
</head>
<body>

<#include "../partials/navbar.ftlh">

<#assign page = "User-Edit">
<#include "../partials/main_content_top.ftlh">

<h3 class="mb-3">Edit Product ${product.productName}</h3>
<div class="table-responsive">

    <#include "../forms/productEditForm.ftlh" />
</div>

<#include "../partials/main_content_bottom.ftlh">
<#include "../partials/scripts.ftlh">
<script src="/scripts/productValidation.js"></script>
</body>
</html>

