<#import "/spring.ftl" as spring />


<html>
<head>
    <title>Properties</title>
    <#include "../partials/head.ftlh">
</head>
<body>

<#include "../partials/navbar.ftlh">

<#assign page = "Property-Edit">
<#include "../partials/main_content_top.ftlh">

<h3 class="mb-3">Edit Property</h3>
<div class="table-responsive">

    <#include "../forms/propertyEditForm.ftlh" />
</div>

<#include "../partials/main_content_bottom.ftlh">
<#include "../partials/scripts.ftlh">
<script src="/scripts/main.js"></script>
<script src="/scripts/propertyValidation.js"></script>
</body>
</html>

