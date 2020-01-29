<#import "/spring.ftl" as spring />


<html>
<head>
    <title>Products</title>
    <#include "../partials/head.ftlh">
</head>
<body>

<#include "../partials/navbar.ftlh">


<#assign page = "Products">
<#include "../partials/main_content_top.ftlh">

<h3 class="mb-3">Products</h3>
<div class="table-responsive">
        <#include "../partials/products_table.ftlh" />
</div>

<#include "../partials/main_content_bottom.ftlh">
<#include "../partials/delete_confirm_modal.ftlh" />
<#include "../partials/scripts.ftlh">
</body>
</html>

