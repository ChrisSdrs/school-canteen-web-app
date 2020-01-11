
<form action="/admin/users/create" id="userVal" name="userCreateForm" method="POST">


    <div class="mb-3">
        <label for="regn">Registration Number</label>
        <@spring.bind "userCreateForm.regn"/>
        <input type="text" class="form-control" name="regn" id="regn" placeholder="RN" value="<#if userCreateForm.regn?has_content>${userCreateForm.regn}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="grade">Grade</label>

        <select class="custom-select d-block w-100" name="grade" id="grade" required >
            <option value="" selected class="first-select-label">Choose Class</option>
            <option value="1" disabled class="class-header">Elementary School</option>
            <option value="Elementary 1st Grade">1st Grade</option>
            <option value="Elementary 2nd Grade">2st Grade</option>
            <option value="Elementary 3rd Grade">3st Grade</option>
            <option value="Elementary 4th Grade">4st Grade</option>
            <option value="Elementary 5th Grade">5st Grade</option>
            <option value="Elementary 6th Grade">6st Grade</option>
            <option value="7" disabled class="class-header">Middle School</option>
            <option value="Middle School 1st Grade">1st Grade</option>
            <option value="Middle School 2nd Grade">2st Grade</option>
            <option value="Middle School 3rd Grade">3st Grade</option>
            <option value="11" disabled class="class-header">High School</option>
            <option value="High School 1st Grade">1st Grade</option>
            <option value="High School 2nd Grade">2st Grade</option>
            <option value="High School 3rd Grade">3st Grade</option>
            <option value="High School IA">IA</option>
            <option value="High School IB">IB</option>
        </select>

    </div>

    <div class="mb-3">
        <label for="firstName">First Name</label>
        <@spring.bind "userCreateForm.firstName"/>
        <input type="text" class="form-control" name="firstName" id="firstName" placeholder="First Name" value="<#if userCreateForm.firstName?has_content>${userCreateForm.firstName}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>

    </div>

    <div class="mb-3">
        <label for="lastName">Last Name</label>
        <@spring.bind "userCreateForm.lastName"/>
        <input type="text" class="form-control" name="lastName" id="lastName" placeholder="Last Name" value="<#if userCreateForm.lastName?has_content>${userCreateForm.lastName}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>

    </div>
    <div class="mb-3">
        <label for="address">Address</label>
        <@spring.bind "userCreateForm.address"/>
        <input type="text" class="form-control" name="address" id="address" placeholder="Address" value="<#if userCreateForm.address?has_content>${userCreateForm.address}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="email">E-mail</label>
        <@spring.bind "userCreateForm.email"/>
        <input type="email" class="form-control" name="email" id="email" placeholder="E-mail" value="<#if userCreateForm.email?has_content>${userCreateForm.email}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="phone">Phone</label>
        <@spring.bind "userCreateForm.phone"/>
        <input type="text" class="form-control" name="phone" id="phone" placeholder="Phone" value="<#if userCreateForm.phone?has_content>${userCreateForm.phone}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="username">Username</label>
        <@spring.bind "userCreateForm.username"/>
        <input type="text" class="form-control" name="username" id="username" placeholder="Username" value="<#if userCreateForm.ssn?has_content>${userCreateForm.ssn}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="password">Password</label>
        <@spring.bind "userCreateForm.password"/>
        <input type="text" class="form-control" name="password" id="password" placeholder="Password" value="<#if userCreateForm.password?has_content>${userCreateForm.password}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3 ghost">
        <label for="role">Role</label>
        <input type="text" class="form-control" name="role" id="role" value="Student">
    </div>

    <div class="mb-3 ghost">
        <label for="role">Sum Due</label>
        <input type="text" class="form-control" name="debt" id="debt" value="0">
    </div>

    <#if userCreateError?has_content>
        <div><p class="error">
                ${userCreateError}
            </p>
        </div>
    </#if>

    <button class="btn btn-primary btn-lg mt-4" type="submit">Create</button>
</form>
