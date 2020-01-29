package com.schoolcanteen.app.model;

import java.time.LocalDate;

public class OrderModel {

    private Long id;

    private String regn;

    private LocalDate date;

    private String productName;

    private Double cost;

    public OrderModel() {
    }

    public OrderModel(String regn, LocalDate date, String productName, Double cost) {
        this.regn = regn;
        this.date = date;
        this.productName = productName;
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

    public String getProductName() { return productName; }

    public void setProductName(String productName) { this.productName = productName; }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
