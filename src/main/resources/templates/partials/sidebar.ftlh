<nav class="d-none d-md-block bg-light sidebar">
    <div class="sidebar-sticky">
        <ul class="nav flex-column">

            <li class="nav-item
                <#if page?has_content>
                    <#if
                page == "Home">active
                    </#if>
                </#if>

            ">
                <a class="nav-link" href="/home">
                    <img src="https://img.icons8.com/wired/64/000000/speed.png" class="nav-link-icon">

                    <div class="sidebar-link-text">Home</div>
                </a>
            </li>
        <#if userRole?has_content>
            <#if
        userRole == "Admin">

                <li class="">
                    <div class="sidebar-title">Users</div>
                </li>

                <li class="nav-item nav-users
                    <#if page?has_content>
                        <#if
                    page == "Users">active
                        </#if>
                    </#if>
                ">
                    <a class="nav-link" href="/admin/users">
                        <img src="https://img.icons8.com/ios-filled/50/000000/user-group-man-man.png" class="nav-link-icon">

                        <div class="sidebar-link-text">All Owners</div>
                    </a>
                </li>


                <#if page?has_content>
                    <#if
                page == "User-Edit"><li class="nav-item nav-users active">
                        <div class="nav-link" >
                            <img src="https://img.icons8.com/ios-filled/50/000000/pencil-tip.png" class="nav-link-icon">
                            <div class="sidebar-link-text">Edit Owner</div>
                        </div>
                    </li>
                    </#if>
                </#if>



                <li class="nav-item
                    <#if page?has_content>
                        <#if
                    page == "Users-Search">active
                        </#if>
                    </#if>
                ">
                    <a class="nav-link" href="/admin/users/search">
                        <img src="https://img.icons8.com/ios-glyphs/30/000000/find-user-male.png" class="nav-link-icon">
                        <div class="sidebar-link-text">Search for Owners</div>
                    </a>
                </li>

                <li class="nav-item
                    <#if page?has_content>
                        <#if
                    page == "Users-Create">active
                        </#if>
                    </#if>
                ">
                    <a class="nav-link" href="/admin/users/create">
                        <img src="https://img.icons8.com/ios-filled/50/000000/add-user-male.png" class="nav-link-icon">
                        <div class="sidebar-link-text">Create User</div>
                    </a>
                </li>

                <li class="">
                    <div class="sidebar-title">Repairs</div>
                </li>

                <li class="nav-item
                    <#if page?has_content>
                        <#if
                            page == "Repairs">active
                        </#if>
                    </#if>
                ">
                    <a class="nav-link " href="/admin/repairs">
                        <img src="https://img.icons8.com/ios-filled/50/000000/gears.png" class="nav-link-icon">
                        <div class="sidebar-link-text">All Repairs</div>
                    </a>
                </li>

                <#if page?has_content>
                    <#if
                    page == "Repair-Edit"><li class="nav-item nav-users active">
                        <div class="nav-link" >
                            <img src="https://img.icons8.com/ios-filled/50/000000/pencil-tip.png" class="nav-link-icon">
                            <div class="sidebar-link-text">Edit Repair</div>
                        </div>
                    </li>
                    </#if>
                </#if>

                <li class="nav-item
                    <#if page?has_content>
                        <#if
                    page == "Repairs-Search">active
                        </#if>
                    </#if>
                ">
                    <a class="nav-link" href="/admin/repairs/search">
                        <img src="https://img.icons8.com/ios-filled/50/000000/advanced-search.png" class="nav-link-icon">
                        <div class="sidebar-link-text">Search for repairs</div>
                    </a>
                </li>

                <li class="nav-item
                    <#if page?has_content>
                        <#if
                    page == "Repairs-Create">active
                        </#if>
                    </#if>
                ">
                    <a class="nav-link" href="/admin/repairs/create">
                        <img src="https://img.icons8.com/ios/50/000000/calendar-plus.png" class="nav-link-icon">
                        <div class="sidebar-link-text">Create Repair</div>
                    </a>
                </li>

                <li class="">
                    <div class="sidebar-title">Properties</div>
                </li>

                <li class="nav-item
                    <#if page?has_content>
                        <#if
                    page == "Properties">active
                        </#if>
                    </#if>
                ">
                    <a class="nav-link" href="/admin/properties">
                        <img src="https://img.icons8.com/ios-filled/50/000000/real-estate.png" class="nav-link-icon">
                        <div class="sidebar-link-text">All Properties</div>
                    </a>
                </li>

                <#if page?has_content>
                    <#if
                    page == "Property-Edit"><li class="nav-item nav-users active">
                        <div class="nav-link" >
                            <img src="https://img.icons8.com/ios-filled/50/000000/pencil-tip.png" class="nav-link-icon">
                            <div class="sidebar-link-text">Edit Property</div>
                        </div>
                    </li>
                    </#if>
                </#if>

                <li class="nav-item
                    <#if page?has_content>
                        <#if
                    page == "Properties-Search">active
                        </#if>
                    </#if>
                ">
                    <a class="nav-link" href="/admin/properties/search">
                        <img src="https://img.icons8.com/ios-filled/50/000000/search-property.png" class="nav-link-icon">
                        <div class="sidebar-link-text">Search Property</div>
                    </a>
                </li>

                <li class="nav-item
                    <#if page?has_content>
                        <#if
                    page == "Properties-Create">active
                        </#if>
                    </#if>
                ">
                    <a class="nav-link" href="/admin/properties/create">
                        <img src="https://img.icons8.com/ios-filled/50/000000/add-to-inbox.png" class="nav-link-icon">
                        <div class="sidebar-link-text">Create Property</div>
                    </a>
                </li>
            </#if>
        </#if>
        <#if userRole?has_content>
                    <#if
                userRole == "Owner">

                 <li class="" style="margin-top: 60px;">
                    <div class="coming-soon-holder">
                        <img class="coming-soon" src="https://freepngimg.com/download/coming_soon/7-2-coming-soon-png-picture.png">
                    </div>
                 </li>

                <li class="">
                    <img src="https://img.icons8.com/ios/50/000000/calendar-plus.png" class="nav-link-icon">
                    <div class="sidebar-link-text">Arrange Repair</div>
                </li>

                <li class="">
                    <img src="https://img.icons8.com/ios-filled/50/000000/add-to-inbox.png" class="nav-link-icon">
                    <div class="sidebar-link-text">Add Property</div>
                </li>

            </#if>
        </#if>
        </ul>


    </div>
</nav>