
<form action="/admin/users/search" name="userSearchForm" method="POST">

    <div class="mb-3">
        <@spring.bind "userSearchForm.ssn"/>
        <input type="text" class="form-control" name="ssn" id="ssn" placeholder="Social Security Number" value="<#if userSearchForm.ssn?has_content>${userSearchForm.ssn}</#if>">
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
