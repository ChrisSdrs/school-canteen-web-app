<#import "/spring.ftl" as spring />

<form action="/admin/properties/create" id="propertyVal" name="orderForm" method="POST">

    <div class="mb-3">
        <label for="regn">Registration Number</label>
        <input type="text" class="form-control" name="regn" id="regn" placeholder="Reg Number">
    </div>

    <div class="mb-3">
        <label for="description">Description</label>
        <textarea class="form-control" name="description" id="description" placeholder="Description" rows="4" cols="50"></textarea>
    </div>

    <div class="mb-3">
        <label for="cost">Cost</label>
        <input type="text" class="form-control" name="Cost" id="Cost" placeholder="Purchase's Cost">
    </div>

    <button class="btn btn-primary btn-lg mt-4" type="submit">Authorize</button>
</form>
