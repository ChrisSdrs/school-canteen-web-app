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

    @Column(name = "products_name")
    private String productName;

    @Column(name = "order_cost")
    private Double cost;

    public Order() {
    }

    public Order(String regn, LocalDate date, String productName, Double cost) {
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

