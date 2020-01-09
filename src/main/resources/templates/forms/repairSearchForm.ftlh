<form action="/admin/repairs/search" name="searchRepairForm" method="POST">
    <div class="mb-3">
        <label for="dateFrom">From</label>
        <@spring.bind "searchRepairForm.dateFrom"/>
        <input type="date" class="form-control mr-sm-2" name="dateFrom" id="dateFrom" value="<#if searchRepairForm.dateFrom?has_content>${searchRepairForm.dateFrom}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="dateTo">To</label>
        <@spring.bind "searchRepairForm.dateTo"/>
        <input type="date" class="form-control mr-sm-2" name="dateTo" id="dateTo" value="<#if searchRepairForm.dateTo?has_content>${searchRepairForm.dateTo}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <@spring.bind "searchRepairForm.ssn"/>
        <input type="text" class="form-control mr-sm-2" name="ssn" id="ssn" placeholder="Social Security Number" value="<#if searchRepairForm.ssn?has_content>${searchRepairForm.ssn}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>


    <button class="btn btn-primary btn-lg mt-4" type="submit">Search</button>
</form>
