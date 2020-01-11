<form action="/admin/orders/search" name="orderSearchForm" method="POST">

    <div class="mb-3">
        <input type="text" class="form-control" name="pin" id="pin" placeholder="Property Identification Number" value="<#if propertySearchForm.pin?has_content>${propertySearchForm.pin}</#if>">


    </div>
    <div class="mb-3">
        <input type="text" class="form-control" name="owner" id="owner" placeholder="Owner's Social Security Number" value="<#if propertySearchForm.owner?has_content>${propertySearchForm.owner}</#if>">


    </div>

    <button class="btn btn-primary btn-lg mt-4" type="submit">Search</button>
</form>
