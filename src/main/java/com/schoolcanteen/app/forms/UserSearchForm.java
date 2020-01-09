package com.schoolcanteen.app.forms;

public class UserSearchForm {

    String regn;
    String email;

    public String getRegn() {
        return regn;
    }

    public void setSsn(String regn) {
        this.regn = regn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserSearchForm() {
    }

    public UserSearchForm(String regn, String email) {
        this.regn = regn;
        this.email = email;
    }
}
