<form action="/admin/products/search" name="productSearchForm" method="POST">

    <div class="mb-3">
        <@spring.bind "productSearchForm.productSerialNumber"/>
        <label for="productSerialNumber">Product's Serial Number:</label>
        <input type="text" class="form-control" name="productSerialNumber" id="productSerialNumber" placeholder="Serial Number" value="<#if productSearchForm.productSerialNumber?has_content>${productSearchForm.productSerialNumber}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>

    </div>
    <div class="mb-3">
        <@spring.bind "productSearchForm.productName"/>
        <label for="productName">Product:</label>
        <input type="text" class="form-control" name="productName" id="productName" placeholder="Product"  value="<#if productSearchForm.productName?has_content>${productSearchForm.productName}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>

    </div>

    <button class="btn btn-primary btn-lg mt-4" type="submit">Search</button>
</form>
