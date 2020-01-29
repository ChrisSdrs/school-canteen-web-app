<#import "/spring.ftl" as spring />

<form action="/admin/orders/create" id="orderVal" name="orderForm" method="POST">

    <div class="mb-3">
        <label for="regn">Student's Registration Number</label>
        <input type="text" class="form-control" name="regn" id="regn" placeholder="Registration Number" value="<#if user?has_content> ${user.regn} </#if>">
    </div>

    <div class="mb-3">
        <label for="date">Date</label>
        <input type="date" class="form-control" name="date" id="date" placeholder="Purchase Date">
    </div>

    <div class="mb-3">
        <label for="description">Description</label>
        <textarea class="form-control" name="description" id="description" placeholder="Description" rows="4" cols="50"></textarea>
    </div>

    <div class="mb-3">
        <label for="cost">Cost</label>
        <input type="text" class="form-control" name="cost" id="cost" placeholder="Purchase Cost">
    </div>

    <button class="btn btn-primary btn-lg mt-4" type="submit">Authorize</button>
</form>
