
<form action="/admin/users/search" name="userSearchForm" method="POST">

    <div class="mb-3">
        <@spring.bind "userSearchForm.regn"/>
        <input type="text" class="form-control" name="regn" id="regn" placeholder="Registration Number" value="<#if userSearchForm.regn?has_content>${userSearchForm.regn}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>

    </div>
    <div class="mb-3">
        <@spring.bind "userSearchForm.email"/>
        <input type="text" class="form-control" name="email" id="email" placeholder="e-mail"  value="<#if userSearchForm.email?has_content>${userSearchForm.email}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>

    </div>

    <button class="btn btn-primary btn-lg mt-4" type="submit" onclick="Alert("User Search")">Search</button>
</form>
