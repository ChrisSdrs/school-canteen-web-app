<form action="/login" id="login" class="form-signin" name="loginForm" method="POST">
    <div class="LoginLogoDiv">

         <h1 id="login-page-title" class="h3 mb-3 font-weight-normal" style="color: black">School Canteen</h1>


        <input type="text" class="form-control" name="username" id="username" placeholder="Username" autofocus>

        <input type="password" class="form-control" name="password" id="password" placeholder="Password">



        <div class="checkbox mb-3">
            <#if loginAuthentication?has_content>
            <#if
            loginAuthentication == "fail">
            </#if>
                <div><p class="error"> No user found with the given credentials. <br>Please try again!</p></div>
            </#if>
        </div>
        <div style="margin-top: 30px;">
            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
        </div>
    </div>

<#--        <h3 class="text-center text-info">Login</h3>-->
<#--        <div class="form-group">-->
<#--            <label for="username" class="text-info">Username:</label><br>-->
<#--            <input type="text" name="username" id="username" class="form-control">-->
<#--        </div>-->
<#--        <div class="form-group">-->
<#--            <label for="password" class="text-info">Password:</label><br>-->
<#--            <input type="text" name="password" id="password" class="form-control">-->
<#--        </div>-->
<#--        <div class="form-group">-->
<#--            <input type="submit" name="submit" class="btn btn-info btn-md" value="Submit">-->
<#--        </div>-->

</form>


