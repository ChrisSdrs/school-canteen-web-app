<table class="table table-striped table-sm">

    <thead>
    <tr>
        <th>#</th>
        <th>Property Identification Number</th>
        <th>Address</th>
        <th>Year of Construction</th>
        <th>Property Type</th>
        <th>Owner's Social Security Number</th>
        <th>Edit</th>
        <th>Remove</th>
    </tr>
    </thead><tbody>
    <#if properties?has_content>
        <#list properties as property>
            <tr data-id="${property.id}">
                <td> ${property.id}</td>
                <td> ${property.pin}</td>
                <td> ${property.address}</td>
                <td> ${property.year}</td>
                <td> ${property.type}</td>
                <td> ${property.owner}</td>
                <td class="Edit-Delete">
                    <form action="/admin/properties/${property.id}/edit" method="POST" style="display: inline;">
                        <button type="submit" class="btn btn-link"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-tool"><path d="M14.7 6.3a1 1 0 0 0 0 1.4l1.6 1.6a1 1 0 0 0 1.4 0l3.77-3.77a6 6 0 0 1-7.94 7.94l-6.91 6.91a2.12 2.12 0 0 1-3-3l6.91-6.91a6 6 0 0 1 7.94-7.94l-3.76 3.76z"></path></svg></span></button>
                    </form>
                </td>
                <td class="Edit-Delete">
                    <button type="button" class="btn btn-link" data-toggle="modal" data-target="#deleteConfirmationModal" data-id="${property.id}" data-link="/admin/properties/${property.id}/delete" >
                        <span><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-x-circle"><circle cx="12" cy="12" r="10"></circle><line x1="15" y1="9" x2="9" y2="15"></line><line x1="9" y1="9" x2="15" y2="15"></line></svg></span>
                    </button>
                </td>
            </tr>
        </#list>
    </#if>
    </tbody>
</table>