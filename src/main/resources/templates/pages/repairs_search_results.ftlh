<#import "/spring.ftl" as spring />


<html>
<head>
    <title>Repairs</title>
    <#include "../partials/head.ftlh">
</head>
<body>

<#include "../partials/navbar.ftlh">

<#assign page = "Repairs-Search">
<#include "../partials/main_content_top.ftlh">

            <h3 class="mb-3">Search Repairs</h3>
            <div class="table-responsive">
                <#include "../forms/repairSearchForm.ftlh" />
                <#include "../partials/repairs_table.ftlh" />
            </div>

<#include "../partials/main_content_bottom.ftlh">
<#include "../partials/delete_confirm_modal.ftlh" />
<#include "../partials/scripts.ftlh">
</body>
</html>

