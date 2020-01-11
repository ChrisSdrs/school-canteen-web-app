package com.schoolcanteen.app.model;


public class PurchaseModel {

    private Long id;

    private String regn;

    private String description;

    private Double cost;

    public PurchaseModel() {
    }

    public PurchaseModel(String regn, String description, Double cost) {
        this.regn = regn;
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

    public void setRegn(String owner) {
        this.regn = regn;
    }

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
