<form action="/admin/properties/search" name="propertySearchForm" method="POST">

    <div class="mb-3">
        <@spring.bind "propertySearchForm.pin"/>
        <input type="text" class="form-control" name="pin" id="pin" placeholder="Property Identification Number" value="<#if propertySearchForm.pin?has_content>${propertySearchForm.pin}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>

    </div>
    <div class="mb-3">
        <@spring.bind "propertySearchForm.owner"/>
        <input type="text" class="form-control" name="owner" id="owner" placeholder="Owner's Social Security Number" value="<#if propertySearchForm.owner?has_content>${propertySearchForm.owner}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>

    </div>

    <button class="btn btn-primary btn-lg mt-4" type="submit">Search</button>
</form>
