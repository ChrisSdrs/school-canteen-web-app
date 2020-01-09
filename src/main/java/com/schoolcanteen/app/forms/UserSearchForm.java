package com.schoolcanteen.app.forms;

public class UserSearchForm {
    String grade;
    String email;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserSearchForm() {
    }

    public UserSearchForm(String grade, String email) {
        this.grade = grade;
        this.email = email;
    }
}
