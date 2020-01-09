<#import "/spring.ftl" as spring />


<html>
<head>
    <title>Repair Search</title>
    <#include "../partials/head.ftlh">
</head>
<body>

<#include "../partials/navbar.ftlh">

<#assign page = "Repairs-Search">
<#include "../partials/main_content_top.ftlh">

            <h3 class="mb-3">Search Repairs</h3>
            <div class="table-responsive">

                <#include "../forms/repairSearchForm.ftlh" />
            </div>

<#include "../partials/main_content_bottom.ftlh">

<#include "../partials/scripts.ftlh">
</body>
</html>

