<table class="table table-striped table-sm">
    <thead>
    <tr>
        <th>Date</th>
        <th>Status</th>
        <th>Category</th>
        <th>Type</th>
        <th>Cost</th>
        <th>Address</th>
        <th>Description</th>
    </tr>
    </thead>
    <tbody>
    <#if userRepairs?has_content>
        <#list userRepairs as repair>
            <tr>
                <td> ${repair.date}</td>
                <td> ${repair.status}</td>
                <td> ${repair.category}</td>
                <td> ${repair.type}</td>
                <td> ${repair.cost}</td>
                <td> ${repair.address}</td>
                <td> ${repair.description}</td>
            </tr>
        </#list>
    </#if>
    </tbody>
</table>