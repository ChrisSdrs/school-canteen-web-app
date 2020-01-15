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
                    <div class="sidebar-title">Students</div>
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

                        <div class="sidebar-link-text">All Students</div>
                    </a>
                </li>


                <#if page?has_content>
                    <#if
                page == "User-Edit"><li class="nav-item nav-users active">
                        <div class="nav-link" >
                            <img src="https://img.icons8.com/ios-filled/50/000000/pencil-tip.png" class="nav-link-icon">
                            <div class="sidebar-link-text">Edit Student</div>
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
                        <div class="sidebar-link-text">Search for Students</div>
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
                        <div class="sidebar-link-text">Create Student</div>
                    </a>
                </li>

                <li class="">
                    <div class="sidebar-title">Orders</div>
                </li>

                <li class="nav-item
                    <#if page?has_content>
                        <#if
                    page == "Orders">active
                        </#if>
                    </#if>
                ">
                    <a class="nav-link" href="/admin/orders">
                        <img src="https://img.icons8.com/ios-filled/50/000000/real-estate.png" class="nav-link-icon">
                        <div class="sidebar-link-text">All Orders</div>
                    </a>
                </li>

                <#if page?has_content>
                    <#if
                    page == "Order-Edit"><li class="nav-item nav-users active">
                        <div class="nav-link" >
                            <img src="https://img.icons8.com/ios-filled/50/000000/pencil-tip.png" class="nav-link-icon">
                            <div class="sidebar-link-text">Edit Order</div>
                        </div>
                    </li>
                    </#if>
                </#if>



                <li class="nav-item
                    <#if page?has_content>
                        <#if
                    page == "Orders-Create">active
                        </#if>
                    </#if>
                ">
                    <a class="nav-link" href="/admin/orders/create">
                        <img src="https://img.icons8.com/ios-filled/50/000000/add-to-inbox.png" class="nav-link-icon">
                        <div class="sidebar-link-text">Create Order</div>
                    </a>
                </li>
            </#if>
        </#if>
        <#if userRole?has_content>
                    <#if
                userRole == "Student">

                 <li class="" style="margin-top: 60px;">
                    <div class="coming-soon-holder">
                        <img class="coming-soon" src="https://freepngimg.com/download/coming_soon/7-2-coming-soon-png-picture.png">
                    </div>
                 </li>

<#--                <li class="">-->
<#--                    <img src="https://img.icons8.com/ios/50/000000/calendar-plus.png" class="nav-link-icon">-->
<#--                    <div class="sidebar-link-text">Arrange Repair</div>-->
<#--                </li>-->

<#--                <li class="">-->
<#--                    <img src="https://img.icons8.com/ios-filled/50/000000/add-to-inbox.png" class="nav-link-icon">-->
<#--                    <div class="sidebar-link-text">Add Purchases</div>-->
<#--                </li>-->


            </#if>
        </#if>
        </ul>


    </div>
</nav>