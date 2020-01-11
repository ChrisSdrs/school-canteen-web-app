package com.schoolcanteen.app.forms;

public class OrderForm {

    private Long id;

    private String regn;

    private String description;

    private Double cost;

    public OrderForm() {
    }

    public OrderForm(String regn, String description, Double cost) {
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

    public void setRegn(String regn) {
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
