<#import "/spring.ftl" as spring />

<form action="/admin/repairs/create" id="repairVal" name="repairForm" method="POST">
    <div class="mb-3">
        <label for="date">Date</label>
        <@spring.bind "repairForm.date"/>
        <input type="date" class="form-control" name="date" id="date" required value="<#if repairForm.date?has_content>${repairForm.date}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="status">Status</label>
        <@spring.bind "repairForm.status"/>
        <select class="custom-select d-block w-100" name="status" id="status" required >
            <option value="" selected class="first-select-label">Choose Status</option>
            <option value="Pending"   <#if repairForm.status?has_content && repairForm.status == "Pending"> selected </#if>>
                Pending
            </option>
            <option value="In Progress"   <#if repairForm.status?has_content && repairForm.status == "In Progress"> selected </#if>>
                In Progress
            </option>
            <option value="Completed"   <#if repairForm.status?has_content && repairForm.status == "Completed"> selected </#if>>
                Completed
            </option>
        </select>
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>

    </div>

    <div class="mb-3">
        <label for="category">Category</label>
        <@spring.bind "repairForm.category"/>
        <select class="custom-select d-block w-100" name="category" id="category" required=>
           <option value="" selected class="first-select-label">Choose Category</option>
            <option value="Interior"   <#if repairForm.category?has_content && repairForm.category == "Interior"> selected </#if>>
                Interior
            </option>
            <option value="Exterior"   <#if repairForm.category?has_content && repairForm.category == "Exterior"> selected </#if>>
                Exterior
            </option>
        </select>
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="type">Type</label>
        <@spring.bind "repairForm.type"/>
        <select class="custom-select d-block w-100" name="type" id="type" required >
           <option value="" selected class="first-select-label">Choose Category First</option>
            <#if repairForm.category?has_content && repairForm.category == "Interior">
                <option value="Painting"   <#if repairForm.type?has_content && repairForm.type == "Painting"> selected </#if>>
                    Painting
                </option>
                <option value="Electrical"   <#if repairForm.type?has_content && repairForm.type == "Electrical"> selected </#if>>
                    Electrical
                </option>
                <option value="Plumbing"   <#if repairForm.type?has_content && repairForm.type == "Plumbing"> selected </#if>>
                    Plumbing
                </option>
                <option value="Insulation"   <#if repairForm.type?has_content && repairForm.type == "Insulation"> selected </#if>>
                    Insulation
                </option>
                <option value="Fireplace"   <#if repairForm.type?has_content && repairForm.type == "Fireplace"> selected </#if>>
                    Fireplace
                </option>
                <option value="Frames"   <#if repairForm.type?has_content && repairForm.type == "Frames"> selected </#if>>
                    Frames
                </option>
                <option value="Ceramic Flooring"   <#if repairForm.type?has_content && repairForm.type == "Ceramic Flooring"> selected </#if>>
                    Ceramic Flooring
                </option>
                <option value="Ceiling"   <#if repairForm.type?has_content && repairForm.type == "Ceiling"> selected </#if>>
                    Ceiling
                </option>

            <#elseif repairForm.category?has_content && repairForm.category == "Exterior">
                <option value="Solar Panels"   <#if repairForm.type?has_content && repairForm.type == "Solar Panels"> selected </#if>>
                    Solar Panels
                </option>
                <option value="Painting"   <#if repairForm.type?has_content && repair.type == "Painting"> selected </#if>>
                    Painting
                </option>
                <option value="Swimming Pool"   <#if repairForm.type?has_content && repair.type == "CSwimming Pool"> selected </#if>>
                    Swimming Pool
                </option>
                <option value="Fences"   <#if repairForm.type?has_content && repair.type == "Fences"> selected </#if>>
                    Fences
                </option>
            </#if>
        </select>
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="cost">Cost</label>
        <@spring.bind "repairForm.cost"/>
        <input type="text" class="form-control" name="cost" id="cost" placeholder="Cost" value="<#if repairForm.cost?has_content>${repairForm.cost}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="owner">Owner</label>
        <@spring.bind "repairForm.owner"/>
        <input type="text" class="form-control" name="owner" id="owner" placeholder="Owner's SSN" value="<#if repairForm.owner?has_content>${repairForm.owner}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
           <label for="address">Address</label>
           <@spring.bind "repairForm.address"/>
           <input type="text" class="form-control" name="address" id="address" placeholder="Property Address" value="<#if repairForm.address?has_content>${repairForm.address}</#if>">
           <#list spring.status.errorMessages as error>
               <span>${error}</span>
           </#list>
    </div>
    <div class="mb-3">
        <label for="description">Description</label>
        <@spring.bind "repairForm.description"/>
        <textarea class="form-control" name="description" id="description" placeholder="Description" rows="4" cols="50"><#if repairForm.description?has_content>${repairForm.description}</#if></textarea>
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <#if repairCreateError?has_content>
        <div><p class="error">
                ${repairCreateError}
            </p>
        </div>
    </#if>

    <button class="btn btn-primary btn-lg mt-4" type="submit">Create</button>
</form>
