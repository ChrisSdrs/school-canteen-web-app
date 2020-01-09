<form action="/admin/properties/edit" id="propertyVal" name="propertyForm" method="POST">


    <input type="hidden" name="id" value="${property.id}">

    <div class="mb-3">
        <label for="pin">Property Identification Number</label>
        <@spring.bind "propertyForm.pin"/>
        <input type="text" class="form-control" name="pin" id="pin" placeholder="Pin" value="${property.pin}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="address">Address</label>
        <@spring.bind "propertyForm.address"/>
        <input type="text" class="form-control" name="address" id="address" placeholder="Address" value="${property.address}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="year">Year of Construction</label>
        <@spring.bind "propertyForm.year"/>
        <input type="text" class="form-control" name="year" id="year" placeholder="Year of Construction" value="${property.year}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="type">Property Type</label>
        <@spring.bind "propertyForm.type"/>
        <select class="custom-select d-block w-100" name="type" id="type" required="">
            <option value="" class="first-select-label" selected>Choose Property Type</option>
            <option value="Detached house"   <#if property.type == "Detached house"> selected </#if>>
                Detached house
            </option>
            <option value="Maisonette"   <#if property.type == "Maisonette"> selected </#if>>
                Maisonette
            </option>
            <option value="Apartment building"   <#if property.type == "Apartment building"> selected </#if>>
                Apartment building
            </option>
        </select>
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="owner">Owner</label>
        <@spring.bind "propertyForm.owner"/>
        <input type="text" class="form-control" name="owner" id="owner" placeholder="Owner's Social Security Number" value="${property.owner}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>


    <button class="btn btn-primary btn-lg mt-4" type="submit">Update</button>
</form>
