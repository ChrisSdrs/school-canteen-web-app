<#import "/spring.ftl" as spring />

<form action="/admin/properties/create" id="propertyVal" name="propertyForm" method="POST">


    <div class="mb-3">
        <label for="owner">Student's Registration Number</label>
        <input type="text" class="form-control" name="regn" id="regn" placeholder="Registration Number">
    </div>

    <div class="mb-3">
        <label for="description">Description</label>
        <@spring.bind "repairForm.description"/>
        <textarea class="form-control" name="description" id="description" placeholder="Description" rows="4" cols="50"><#if repairForm.description?has_content>${repairForm.description}</#if></textarea>
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




    <#if propertyCreateError?has_content>
        <div><p class="error">
                ${propertyCreateError}
            </p>
        </div>
    </#if>
    <button class="btn btn-primary btn-lg mt-4" type="submit">Create</button>
</form>
