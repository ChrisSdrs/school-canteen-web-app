<html>
<head>
    <title>User Details</title>
    <link rel="stylesheet" href="/styles/owner.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/chart.js@2.9.3/dist/Chart.min.js">
    <link rel="stylesheet" href="https://www.jsdelivr.com/package/npm/chart.js">
    <#include "../partials/head.ftlh">
</head>
<body>

<#include "../partials/navbar.ftlh">

<#assign page = "Home">
<#include "../partials/main_content_top.ftlh">

<h3 class="mb-3">User Account</h3>
<div class="table-responsive">

    <h4>My Details</h4>
    <#include "../partials/owner_details_table.ftlh" />
    <h4>My Properties</h4>
    <#include "../partials/owner_properties_table.ftlh" />
    <h4>My Repairs</h4>
    <#include "../partials/owner_repairs_table.ftlh" />
    <#include "../partials/report_chart.ftlh" />

</div>


<#include "../partials/main_content_bottom.ftlh">
<#include "../partials/scripts.ftlh">
<script src="https://cdn.jsdelivr.net/npm/chart.js@2.8.0"></script>
<script src="/scripts/reportCharts.js"></script>
</body>
</html>