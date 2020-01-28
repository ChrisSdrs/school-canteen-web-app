<#import "/spring.ftl" as spring />

<form action="/admin/users/edit" id="userVal" name="userEditForm" method="POST">


    <input type="hidden" name="id" value="${user.id}">


    <div class="mb-3">
        <label for="regn">Registration Number</label>
            <input type="text" class="form-control" id="regn" name="regn" value="${user.regn}" readonly>
    </div>

    <div class="mb-3">
        <label for="grade">Grade</label>
        <select class="custom-select d-block w-100" name="grade" id="grade" required>

            <option value="" selected class="first-select-label">Choose Class</option>
            <option value="1" disabled class="class-header">Elementary School</option>
            <option value="Elementary 1st Grade" <#if user.grade == "Elementary 1st Grade"> selected </#if>>1st Grade</option>
            <option value="Elementary 2nd Grade" <#if user.grade == "Elementary 2nd Grade"> selected </#if>>2nd Grade</option>
            <option value="Elementary 3rd Grade" <#if user.grade == "Elementary 3rd Grade"> selected </#if>>3rd Grade</option>
            <option value="Elementary 4th Grade" <#if user.grade == "Elementary 4th Grade"> selected </#if>>4th Grade</option>
            <option value="Elementary 5th Grade" <#if user.grade == "Elementary 5th Grade"> selected </#if>>5th Grade</option>
            <option value="Elementary 6th Grade" <#if user.grade == "Elementary 6th Grade"> selected </#if>>6th Grade</option>
            <option value="8" disabled class="class-header">Middle School</option>
            <option value="Middle School 1st Grade" <#if user.grade == "Middle School 1st Grade"> selected </#if>>1st Grade</option>
            <option value="Middle School 2nd Grade" <#if user.grade == "Middle School 2nd Grade"> selected </#if>>2nd Grade</option>
            <option value="Middle School 3rd Grade" <#if user.grade == "Middle School 3rd Grade"> selected </#if>>3rd Grade</option>
            <option value="12" disabled class="class-header">High School</option>
            <option value="High School 1st Grade" <#if user.grade == "High School 1st Grade"> selected </#if>>1st Grade</option>
            <option value="High School 2nd Grade" <#if user.grade == "High School 2nd Grade"> selected </#if>>2nd Grade</option>
            <option value="High School 3rd Grade" <#if user.grade == "High School 3rd Grade"> selected </#if>>3rd Grade</option>
            <option value="High School IB Year 1" <#if user.grade == "High School IB Year 1"> selected </#if>>IB Year 1</option>
            <option value="High School IB Year 2" <#if user.grade == "High School IB Year 2"> selected </#if>>IB Year 2</option>
        </select>
    </div>

    <div class="mb-3">
        <label for="firstName">First Name</label>
            <input type="text" class="form-control" id="firstName" name="firstName"  value="${user.firstName}">
    </div>

    <div class="mb-3">
        <label for="lastName">Last Name</label>
            <input type="text" class="form-control" id="lastName" name="lastName" value="${user.lastName}">
        </div>

    <div class="mb-3">
        <label for="address">Address</label>
            <input type="text" class="form-control" id="address" name="address"  value="${user.address}">
    </div>

    <div class="mb-3">
        <label for="email">E-mail</label>
            <input type="email" class="form-control" id="email" name="email"  value="${user.email}">
    </div>

    <div class="mb-3">
        <label for="phone">Phone</label>
            <input type="text" class="form-control" id="phone" name="phone"  value="${user.phone}">
    </div>

    <div class="mb-3">
        <label for="debt">Sum Due</label>
        <input type="text" class="form-control" id="debt" name="debt"  value="${user.debt}">
    </div>

    <div class="mb-3">
        <label for="username">Username</label>
            <input type="text" class="form-control" id="username" name="username"  value="${user.username}" readonly>
    </div>

    <div class="mb-3 Ghost">
        <label for="role">Role</label>
            <input type="hidden" class="form-control" id="role" name="role" value="${user.role}">
    </div>


    <button class="btn btn-primary btn-lg mt-4" type="submit">Update</button>
</form>