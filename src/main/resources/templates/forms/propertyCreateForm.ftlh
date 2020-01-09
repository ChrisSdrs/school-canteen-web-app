<#import "/spring.ftl" as spring />

<form action="/admin/properties/create" id="propertyVal" name="propertyForm" method="POST">

    <div class="mb-3">
        <label for="pin">Property Identification Number</label>
        <@spring.bind "propertyForm.pin"/>
        <input type="text" class="form-control" name="pin" id="pin" placeholder="Pin">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="address">Address</label>
        <@spring.bind "propertyForm.address"/>
        <input type="text" class="form-control" name="address" id="address" placeholder="Address">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="year">Year of Construction</label>
        <@spring.bind "propertyForm.year"/>
        <input type="text" class="form-control" name="year" id="year" placeholder="Year of Construction">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="type">Property Type</label>
        <@spring.bind "propertyForm.type"/>
        <select class="custom-select d-block w-100" name="type" id="type" required="">
            <option value="" class="first-select-label" selected>Choose Property Type</option>
            <option>Detached house</option>
            <option>Maisonette</option>
            <option>Apartment building</option>
        </select>
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="owner">Owner's SSN</label>
        <@spring.bind "propertyForm.owner"/>
        <input type="text" class="form-control" name="owner" id="owner" placeholder="Owner's Social Security Number">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <#if propertyCreateError?has_content>
        <div><p class="error">
                ${propertyCreateError}
            </p>
        </div>
    </#if>
    <button class="btn btn-primary btn-lg mt-4" type="submit">Create</button>
</form>
