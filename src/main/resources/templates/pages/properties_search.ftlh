<#import "/spring.ftl" as spring />


<html>
<head>
    <title>Property Search</title>
    <#include "../partials/head.ftlh">
</head>
<body>

<#include "../partials/navbar.ftlh">

<#assign page = "Properties-Search">
<#include "../partials/main_content_top.ftlh">

        <h3 class="mb-3">Search Property</h3>
        <div class="table-responsive">

            <#include "../forms/propertySearchForm.ftlh" />
        </div>

<!-- Modal -->
<#include "../partials/delete_confirm_modal.ftlh" />

<#include "../partials/main_content_bottom.ftlh">

<#include "../partials/scripts.ftlh">
</body>
</html>

