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
        <#list userProperties as property>
            <tr>
                <td> ${property.pin}</td>
                <td> ${property.address}</td>
                <td> ${property.year}</td>
                <td> ${property.type}</td>
            </tr>
        </#list>
    </#if>
    </tbody>
</table>