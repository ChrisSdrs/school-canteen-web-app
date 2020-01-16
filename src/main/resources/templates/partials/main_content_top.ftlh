<div class="container-fluid">
    <div class="row">
        <#if userRole?has_content>
                            <#if
                        userRole == "Admin">
        <#include "../partials/sidebar.ftlh">
        <main role="main" class="col-md-9 ml-sm-auto col-lg-9 pt-3 px-4">

        </#if>
            <#if
            userRole == "Student">
            <main role="main" class="container-fluid">
        </#if>
        </#if>

