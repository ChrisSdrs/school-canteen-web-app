<form action="/admin/properties/edit" id="propertyVal" name="purchaseForm" method="POST">


    <input type="hidden" name="id" value="${purchases.id}">

    <div class="mb-3">
        <label for="pin">Property Identification Number</label>
        <@spring.bind "purchaseForm.pin"/>
        <input type="text" class="form-control" name="pin" id="pin" placeholder="Pin" value="${purchases.pin}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="address">Address</label>
        <@spring.bind "purchaseForm.address"/>
        <input type="text" class="form-control" name="address" id="address" placeholder="Address" value="${purchases.address}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="year">Year of Construction</label>
        <@spring.bind "purchaseForm.year"/>
        <input type="text" class="form-control" name="year" id="year" placeholder="Year of Construction" value="${purchases.year}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="type">Property Type</label>
        <@spring.bind "purchaseForm.type"/>
        <select class="custom-select d-block w-100" name="type" id="type" required="">
            <option value="" class="first-select-label" selected>Choose Property Type</option>
            <option value="Detached house"   <#if purchases.type == "Detached house"> selected </#if>>
                Detached house
            </option>
            <option value="Maisonette"   <#if purchases.type == "Maisonette"> selected </#if>>
                Maisonette
            </option>
            <option value="Apartment building"   <#if purchases.type == "Apartment building"> selected </#if>>
                Apartment building
            </option>
        </select>
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="owner">Owner</label>
        <@spring.bind "purchaseForm.owner"/>
        <input type="text" class="form-control" name="owner" id="owner" placeholder="Owner's Social Security Number" value="${purchases.owner}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>


    <button class="btn btn-primary btn-lg mt-4" type="submit">Update</button>
</form>
