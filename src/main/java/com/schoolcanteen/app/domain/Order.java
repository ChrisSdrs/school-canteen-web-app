package com.schoolcanteen.app.domain;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "order_regn")
    private String regn;

    @Column(name = "order_date")
    private LocalDate date;

    @Column(name = "order_description")
    private String description;

    @Column(name = "order_cost")
    private Double cost;

    public Order() {
    }

    public Order(String regn, LocalDate date, String description, Double cost) {
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

