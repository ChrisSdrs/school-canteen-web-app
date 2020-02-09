package com.schoolcanteen.app.forms;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class OrderSearchForm {


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate dateFrom;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate dateTo;
    String regn;

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public String getRegn() {
        return regn;
    }

    public void setRegn(String regn) {
        this.regn = regn;
    }

    public OrderSearchForm() {
    }

    public OrderSearchForm(LocalDate dateFrom, LocalDate dateTo, String regn) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.regn = regn;
    }
}
