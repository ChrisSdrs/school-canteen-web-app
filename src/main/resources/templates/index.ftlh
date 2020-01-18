<#import "/spring.ftl" as spring />

<html lang="en"><head>
    <#include "partials/head.ftlh">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel="stylesheet" href="/styles/login.css">

    <title>School Canteen Login Page</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.0/examples/sign-in/">

    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">
    <style data-styled-components=""></style></head>


<#include "forms/loginForm.ftlh" />


<#include "partials/scripts.ftlh">
<script src="/scripts/loginValidation.js"></script>
<script>
$( document ).ready(function() {
    var logo = document.getElementById("login-logo");
    logo.className += " animate-logo";

    var delayInMilliseconds = 1000; //1 second

    setTimeout(function() {
      var loginDetails = document.getElementById("LoginFormDetails");
          loginDetails.className += " animate-details";
    }, delayInMilliseconds);

});
</script>
</body>
</html>