<#if username?has_content>
     <ul class="navbar-nav px-3">
        <li>
            <div class="navbar-username-holder">
                <div>
                    Logged in as:
                    <span class="username-text">
                        ${username}
                    </span>
                </div>
            </div>
           <a class="navbar-logout-link" href="/logout">
            <span>Logout</span>
               <img src="https://img.icons8.com/ios-filled/50/000000/exit-sign.png" class="logout-icon">
           </a>
        </li>
    </ul>
</#if>