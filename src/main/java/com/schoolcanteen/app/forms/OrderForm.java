package com.schoolcanteen.app.forms;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class OrderForm {

    private Long id;

    private String regn;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    private String description;

    private Double cost;

    public OrderForm() {
    }

    public OrderForm(String regn, LocalDate date, String description, Double cost) {
        this.regn = regn;
        this.date = date;
        this.description = description;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegn() {
        return regn;
    }

    public void setRegn(String regn) {
        this.regn = regn;
    }

    public LocalDate getDate() { return date; }

    public void setDate(LocalDate date) { this.date = date; }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
