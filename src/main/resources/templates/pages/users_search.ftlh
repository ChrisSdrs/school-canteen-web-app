<#import "/spring.ftl" as spring />


<html>
<head>
    <title>Search user</title>
    <#include "../partials/head.ftlh">
</head>
<body>

<#include "../partials/navbar.ftlh">

<#assign page = "Users-Search">
<#include "../partials/main_content_top.ftlh">

    <h3 class="">Search Owners</h3>
    <div class="table-responsive">
        <#include "../forms/userSearchForm.ftlh" />
    </div>

<#include "../partials/main_content_bottom.ftlh">

<#include "../partials/scripts.ftlh">

</body>
</html>

