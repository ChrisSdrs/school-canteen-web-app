<table class="table table-striped table-sm">

    <thead>
    <tr>
        <th>Registration Number</th>
        <th>Description</th>
        <th>Cost</th>
    </tr>
    </thead><tbody>
    <#if userOrders?has_content>
        <#list userOrders as order>
            <tr>
                <td> ${order.regn}</td>
                <td> ${order.description}</td>
                <td> ${order.cost}</td>
            </tr>
        </#list>
    </#if>
    </tbody>
</table>