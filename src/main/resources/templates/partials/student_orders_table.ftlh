<table class="table table-bordered table-sm">

    <thead class="thead-dark">
    <tr>
        <th>Order Date</th>
        <th>Product</th>
        <th>Cost</th>
    </tr>
    </thead><tbody>
    <#if userOrders?has_content>
        <#list userOrders as order>
            <tr>
                <td> ${order.date}</td>
                <td> ${order.productName}</td>
                <td> ${order.cost} €</td>
            </tr>
        </#list>
    </#if>
    </tbody>
</table>