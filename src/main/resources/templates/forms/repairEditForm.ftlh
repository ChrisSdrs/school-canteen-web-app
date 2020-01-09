<form action="/admin/repairs/edit" id="repairVal" name="repairForm" method="POST">


    <input type="hidden" name="id" value="${repair.id}">

    <div class="mb-3">
        <label for="date">Date</label>
        <@spring.bind "repairForm.date"/>
        <input type="date" class="form-control" name="date" id="date" value="${repair.date}" required>
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="status">Status</label>
        <@spring.bind "repairForm.status"/>
        <select class="custom-select d-block w-100" name="status" id="status" value="${repair.status}" required>
            <option value="" class="first-select-label">Choose Status</option>
            <option value="Pending"   <#if repair.status == "Pending"> selected </#if>>
                Pending
            </option>
            <option value="In progress" <#if repair.status == "In Progress"> selected </#if>>
                In Progress
            </option>
            <option value="Completed" <#if repair.status == "Completed"> selected </#if>>
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
        <select class="custom-select d-block w-100" name="category" id="category" required="">
           <option value="" selected class="first-select-label">Choose Category</option>
           <option value="Interior"   <#if repair.category == "Interior"> selected </#if>>
               Interior
           </option>
           <option value="Exterior"   <#if repair.category == "Exterior"> selected </#if>>
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
        <select class="custom-select d-block w-100" name="type" id="type"  required="">
            <option value="" class="first-select-label">Choose Repair Type</option>
            <#if repair.category == "Interior">
                <option value="Painting"   <#if repair.type == "Painting"> selected </#if>>
                    Painting
                </option>
                <option value="Electrical"   <#if repair.type == "Electrical"> selected </#if>>
                    Electrical
                </option>
                <option value="Plumbing"   <#if repair.type == "Plumbing"> selected </#if>>
                    Plumbing
                </option>
                <option value="Insulation"   <#if repair.type == "Insulation"> selected </#if>>
                    Insulation
                </option>
                <option value="Fireplace"   <#if repair.type == "Fireplace"> selected </#if>>
                    Fireplace
                </option>
                <option value="Frames"   <#if repair.type == "Frames"> selected </#if>>
                    Frames
                </option>
                <option value="Ceramic Flooring"   <#if repair.type == "Ceramic Flooring"> selected </#if>>
                    Ceramic Flooring
                </option>
                <option value="Ceiling"   <#if repair.type == "Ceiling"> selected </#if>>
                    Ceiling
                </option>

            <#elseif repair.category == "Exterior">
                <option value="Solar Panels"   <#if repair.type == "Solar Panels"> selected </#if>>
                    Solar Panels
                </option>
                <option value="Painting"   <#if repair.type == "Painting"> selected </#if>>
                    Painting
                </option>
                <option value="Swimming Pool"   <#if repair.type == "Swimming Pool"> selected </#if>>
                    Swimming Pool
                </option>
                <option value="Fences"   <#if repair.type == "Fences"> selected </#if>>
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
        <input type="text" class="form-control" name="cost" id="cost" value="${repair.cost}" placeholder="Cost">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="owner">Owner</label>
        <@spring.bind "repairForm.owner"/>
        <input type="text" class="form-control" name="owner" id="owner" value="${repair.owner}" placeholder="Owner's SSN">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="address">Address</label>
        <@spring.bind "repairForm.address"/>
        <input type="text" class="form-control" name="address" id="address" value="${repair.address}" placeholder="Property Address">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="description">Description</label>
        <@spring.bind "repairForm.description"/>
        <textarea class="form-control" name="description" id="description" placeholder="Description" rows="4" cols="50">${repair.description}</textarea>
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <button class="btn btn-primary btn-lg mt-4" type="submit">Update</button>
</form>