<form action="/admin/orders/search" name="orderSearchForm" method="POST">
    <div class="mb-3">
        <label for="dateBefore">From date:</label>
        <@spring.bind "orderSearchForm.dateBefore"/>
        <input type="date" class="form-control mr-sm-2" name="dateBefore" id="dateBefore" value="<#if orderSearchForm.dateBefore?has_content>${orderSearchForm.dateBefore}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="dateAfter">Until date:</label>
        <@spring.bind "orderSearchForm.dateAfter"/>
        <input type="date" class="form-control mr-sm-2" name="dateAfter" id="dateAfter" value="<#if orderSearchForm.dateAfter?has_content>${orderSearchForm.dateAfter}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <@spring.bind "orderSearchForm.regn"/>
        <input type="text" class="form-control mr-sm-2" name="regn" id="regn" placeholder="Registration Number"
               value="<#if orderSearchForm.regn?has_content>${orderSearchForm.regn}</#if>" style="
        margin-top: 55px;">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <button class="btn btn-primary btn-lg mt-4" type="submit">Search</button>
</form>
