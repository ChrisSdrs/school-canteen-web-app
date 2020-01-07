function validateForm() {
    var x = document.forms["loginForm"]["username"].value;
    if (x == "") {
        alert("Name must be filled out");
        return false;
    }
    var y = document.forms["loginForm"]["password"].value;
    if (y == ""){
        alert("need password");
        return false;
    }
}