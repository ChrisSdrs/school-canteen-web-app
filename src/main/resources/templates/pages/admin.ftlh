<html>
<head>
    <title>Home</title>
    <#include "../partials/head.ftlh">
    <style>
        th:last-child, tr td:last-child {
            display: none !important;
        }
    </style>
</head>
<body>

<#include "../partials/navbar.ftlh">

<#assign page = "Home">
<#include "../partials/main_content_top.ftlh">


    <h3 class="mb-3">Repairs<small class="text-muted">(today)</small></h3>
    <div class="table-responsive">

        <#include "../partials/repairs_table.ftlh" />
    </div>


<#include "../partials/main_content_bottom.ftlh">

<!-- Modal -->
<#include "../partials/delete_confirm_modal.ftlh" />


<#include "../partials/scripts.ftlh">
</body>
</html>