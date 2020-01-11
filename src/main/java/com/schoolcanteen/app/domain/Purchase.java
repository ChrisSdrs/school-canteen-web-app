package com.schoolcanteen.app.domain;


import javax.persistence.*;

@Entity
@Table(name = "Purchase")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "purchase_regn")
    private String regn;

    @Column(name = "purchase_description")
    private String description;

    @Column(name = "purchase_cost")
    private Double cost;

    public Purchase() {
    }

    public Purchase(String regn, String description, Double cost) {
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
