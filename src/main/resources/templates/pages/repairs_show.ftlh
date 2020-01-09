<#import "/spring.ftl" as spring />


<html>
<head>
    <title>Repairs</title>
    <#include "../partials/head.ftlh">
</head>
<body>

<#include "../partials/navbar.ftlh">

<#assign page = "Repairs">
<#include "../partials/main_content_top.ftlh">

    <h3 class="mb-3">Search Repairs</h3>
    <div class="table-responsive">
        <#include "../partials/repairs_table.ftlh" />
    </div>


<!-- Modal -->
<#include "../partials/delete_confirm_modal.ftlh" />


<#include "../partials/main_content_bottom.ftlh">
<#include "../partials/scripts.ftlh">
<script src="/scripts/main.js"></script>
</body>
</html>

