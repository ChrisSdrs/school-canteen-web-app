<table class="table table-bordered table-sm">

    <thead class="thead-dark">
    <tr>
        <th>#</th>
        <th>Serial Number</th>
        <th>Product</th>
        <th>Price</th>
        <th>Edit Product</th>
        <th>Delete</th>
    </tr>
    </thead><tbody>
    <#if products?has_content>
        <#list products as product>
            <tr data-id="${product.id}">
                <td> ${product.id}</td>
                <td> ${product.productSerialNumber}</td>
                <td> ${product.productName}</td>
                <td> ${product.price}</td>
                <td class="Edit-Delete">
                    <form action="/admin/products/${product.id}/edit" method="POST" style="display: inline;">
                        <button type="submit" class="btn btn-link"><span data-feather="x"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-tool"><path d="M14.7 6.3a1 1 0 0 0 0 1.4l1.6 1.6a1 1 0 0 0 1.4 0l3.77-3.77a6 6 0 0 1-7.94 7.94l-6.91 6.91a2.12 2.12 0 0 1-3-3l6.91-6.91a6 6 0 0 1 7.94-7.94l-3.76 3.76z"></path></svg></span></button>
                    </form>
                </td>
                <td class="Edit-Delete">
                    <button type="button" class="btn btn-link" data-toggle="modal" data-target="#deleteConfirmationModal" data-id="${product.id}" data-link="/admin/products/${product.id}/delete" >
                        <span><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-x-circle"><circle cx="12" cy="12" r="10"></circle><line x1="15" y1="9" x2="9" y2="15"></line><line x1="9" y1="9" x2="15" y2="15"></line></svg></span>
                    </button>
                </td>
            </tr>
        </#list>
    </#if>
    </tbody>
</table>