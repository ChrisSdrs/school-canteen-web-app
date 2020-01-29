<form action="/admin/products/edit" id="productVal" name="productForm" method="POST">


    <input type="hidden" name="id" value="${product.id}">

    <div class="mb-3">
        <label for="productSerialNumber">Product's Serial Number</label>
        <@spring.bind "productForm.productSerialNumber"/>
        <input type="text" class="form-control" name="productSerialNumber" id="productSerialNumber" placeholder="Serial Number" value="${product.productSerialNumber}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="productName">Product</label>
        <@spring.bind "productForm.productName"/>
        <input type="text" class="form-control" name="productName" id="productName" placeholder="Product" value="${product.productName}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="price">Price</label>
        <@spring.bind "productForm.price"/>
        <input type="text" class="form-control" name="price" id="price" placeholder="Price" value="${product.price}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <button class="btn btn-primary btn-lg mt-4" type="submit">Update</button>
</form>
