package com.schoolcanteen.app.forms;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class OrderSearchForm {


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate dateAfter;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate dateBefore;
    String regn;

    public LocalDate getDateAfter() {
        return dateAfter;
    }

    public void setDateAfter(LocalDate dateAfter) {
        this.dateAfter = dateAfter;
    }

    public LocalDate getDateBefore() {
        return dateBefore;
    }

    public void setDateBefore(LocalDate dateBefore) {
        this.dateBefore = dateBefore;
    }

    public String getRegn() {
        return regn;
    }

    public void setRegn(String regn) {
        this.regn = regn;
    }

    public OrderSearchForm() {
    }

    public OrderSearchForm(LocalDate dateAfter, LocalDate dateBefore, String regn) {
        this.dateAfter = dateAfter;
        this.dateBefore = dateBefore;
        this.regn = regn;
    }
}
