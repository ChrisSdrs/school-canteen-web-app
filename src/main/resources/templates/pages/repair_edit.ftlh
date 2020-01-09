<#import "/spring.ftl" as spring />


<html>
<head>
    <title>Repairs</title>
    <#include "../partials/head.ftlh">
</head>
<body>

<#include "../partials/navbar.ftlh">

<#assign page = "Repair-Edit">
<#include "../partials/main_content_top.ftlh">

<h3 class="mb-3">Edit Repair ${id}</h3>
<div class="table-responsive">

    <#include "../forms/repairEditForm.ftlh" />
</div>

<#include "../partials/main_content_bottom.ftlh">
<#include "../partials/scripts.ftlh">
<script src="/scripts/main.js"></script>
<script src="/scripts/repairValidation.js"></script>
</body>
</html>
