<table class="table table-striped table-sm">

    <thead>
    <tr>
        <th>Registration Number</th>
        <th>Grade</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Address</th>
        <th>E-mail</th>
        <th>Phone</th>
        <th>Sum due</th>
    </tr>
    </thead><tbody>
    <#if userDetails?has_content>
        <tr>
            <td> ${userDetails.regn}</td>
            <td> ${userDetails.grade}</td>
            <td> ${userDetails.firstName}</td>
            <td> ${userDetails.lastName}</td>
            <td> ${userDetails.address}</td>
            <td> ${userDetails.email}</td>
            <td> ${userDetails.phone}</td>
            <td> ${userDetails.debt} €</td>
        </tr>
    </#if>
    </tbody>
</table>