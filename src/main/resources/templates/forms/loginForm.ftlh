<form action="/login" id="login" class="form-signin" name="loginForm" method="POST">
    <div class="LoginLogoDiv">
    <#if loginAuthentication?has_content>
        <img class="login-logo animate-logo" id="login-logo" src="https://scontent.fath4-2.fna.fbcdn.net/v/t1.15752-9/78728043_575638229919166_1445498838633676800_n.png?_nc_cat=101&_nc_ohc=xTCMwCSDKEcAQmYV0spxNg2bFIM-jf8iEvXl1ZncDIiX9yhU-Newi4ikA&_nc_ht=scontent.fath4-2.fna&oh=cf38ecb577d38884bef70986311d7665&oe=5E710346" alt="" width="72" height="72">

    <#else>
        <img class="login-logo" id="login-logo" src="https://scontent.fath4-2.fna.fbcdn.net/v/t1.15752-9/78728043_575638229919166_1445498838633676800_n.png?_nc_cat=101&_nc_ohc=xTCMwCSDKEcAQmYV0spxNg2bFIM-jf8iEvXl1ZncDIiX9yhU-Newi4ikA&_nc_ht=scontent.fath4-2.fna&oh=cf38ecb577d38884bef70986311d7665&oe=5E710346" alt="" width="72" height="72">
    </#if>

    </div>
    <#if loginAuthentication?has_content>
       <div class="animate-details" id="LoginFormDetails">
    <#else>
        <div class="" id="LoginFormDetails">
    </#if>
        <h1 class="h3 mb-3 font-weight-normal">Control Panel</h1>


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
            <div class="checkbox mb-3">
                <a href="/website"><button class="btn btn-lg btn-info btn-block" type="button">Back to Home</button></a>
            </div>
        </div>
        <p class="mt-5 mb-3">© 2019-2020</p>
    </div>
</form>


