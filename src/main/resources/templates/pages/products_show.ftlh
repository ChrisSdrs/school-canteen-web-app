<#import "/spring.ftl" as spring />


<html>
<head>
    <title>Products</title>
    <#include "../partials/head.ftlh">
</head>
<body>


<#assign page = "Products-Search">
<#include "../partials/main_content_top.ftlh">

<h3 class="mb-3">Search Product</h3>
<div class="table-responsive">
    <#include "../forms/productSearchForm.ftlh" />
    <div class="Dynamic-Load">
        <#include "../partials/products_table.ftlh" />
    </div>
</div>

<#include "../partials/main_content_bottom.ftlh">
<#include "../partials/delete_confirm_modal.ftlh" />
<#include "../partials/scripts.ftlh">
</body>
</html>

