<#import "/spring.ftl" as spring />

<form action="/admin/products/create" id="productVal" name="productForm" method="POST">

    <div class="mb-3">
        <label for="productSerialNumber">Product's Serial Number</label>
        <@spring.bind "productForm.productSerialNumber"/>
        <input type="text" class="form-control" name="productSerialNumber" id="productSerialNumber" placeholder="Serial Number">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="productName">Product</label>
        <@spring.bind "productForm.productName"/>
        <input type="text" class="form-control" name="productName" id="productName" placeholder="Product's Name">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="price">Price</label>
        <@spring.bind "productForm.price"/>
        <input type="text" class="form-control" name="price" id="price" placeholder="Price">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>



    <#if productCreateError?has_content>
        <div><p class="error">
                ${productCreateError}
            </p>
        </div>
    </#if>
    <button class="btn btn-primary btn-lg mt-4" type="submit">Create</button>
</form>
