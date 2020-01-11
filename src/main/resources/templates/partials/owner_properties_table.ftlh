<table class="table table-striped table-sm">

    <thead>
    <tr>
        <th>Property Identification Number</th>
        <th>Address</th>
        <th>Year of Construction</th>
        <th>Property Type</th>
    </tr>
    </thead><tbody>
    <#if userProperties?has_content>
        <#list userProperties as purchases>
            <tr>
                <td> ${purchases.pin}</td>
                <td> ${purchases.address}</td>
                <td> ${purchases.year}</td>
                <td> ${purchases.type}</td>
            </tr>
        </#list>
    </#if>
    </tbody>
</table>