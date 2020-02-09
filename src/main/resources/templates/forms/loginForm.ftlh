<form action="/login" id="login" class="form-signin" name="loginForm" method="POST">
    <div class="LoginLogoDiv">

        <img src="https://img.icons8.com/officel/100/000000/shop.png" alt="" id="canteen-logo">
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
</form>


