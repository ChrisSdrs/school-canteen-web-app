<#import "/spring.ftl" as spring />




<html>
<head>
    <title>Users</title>
    <#include "../partials/head.ftlh">
</head>
<body>
<#include "../partials/navbar.ftlh">

<#assign page = "Users-Create">
<#include "../partials/main_content_top.ftlh">

            <h3 class="mb-3">Create User</h3>
            <div class="table-responsive">

                <#include "../forms/userCreateForm.ftlh" />
            </div>

<#include "../partials/main_content_bottom.ftlh">
<#include "../partials/scripts.ftlh">
<script src="/scripts/userValidation.js"></script>
</body>
</html>

