<table class="table table-striped table-sm">

    <thead>
    <tr>
        <th>#</th>
        <th>Student's Registration Number</th>
        <th>Date</th>
        <th>Description</th>
        <th>Cost</th>
        <th>Remove</th>
    </tr>
    </thead><tbody>
    <#if orders?has_content>
        <#list orders as order>
            <tr data-id="${order.id}">
                <td> ${order.id}</td>
                <td> ${order.date}</td>
                <td> ${order.regn}</td>
                <td> ${order.description}</td>
                <td> ${order.cost} €</td>
                <td class="Edit-Delete">
                    <button type="button" class="btn btn-link" data-toggle="modal" data-target="#deleteConfirmationModal" data-id="${order.id}" data-link="/admin/orders/${order.id}/delete" >
                        <span><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-x-circle"><circle cx="12" cy="12" r="10"></circle><line x1="15" y1="9" x2="9" y2="15"></line><line x1="9" y1="9" x2="15" y2="15"></line></svg></span>
                    </button>
                </td>
            </tr>
        </#list>
    </#if>
    </tbody>
</table>