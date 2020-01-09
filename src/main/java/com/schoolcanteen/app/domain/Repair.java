package com.schoolcanteen.app.domain;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "Repair")
public class Repair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "repair_date")
    private LocalDate date;

    @Column(name = "repair_status")
    private String status;

    @Column(name = "repair_category")
    private String category;

    @Column(name = "repair_type")
    private String type;

    @Column(name = "repair_cost")
    private double cost;

    @Column(name = "repair_address")
    private String address;

    @Column(name = "repair_owner")
    private String owner;

    @Column(name = "repair_description")
    private String description;

    public Repair(){

    }

    public Repair(LocalDate date, String status, String category, String type, double cost, String address, String owner, String description) {
        this.date = date;
        this.status = status;
        this.category = category;
        this.type = type;
        this.cost = cost;
        this.address = address;
        this.owner = owner;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        final StringBuilder sb = new StringBuilder("Repair{");
        sb.append("id=").append(id);
        sb.append(", repairDate='").append(date);
        sb.append(", status='").append(status);
        sb.append(", category=").append(category);
        sb.append(", type=").append(type);
        sb.append(", cost=").append(cost);
        sb.append(", address=").append(address);
        sb.append(", owner=").append(owner);
        sb.append(", description=").append(description);
        sb.append('}');
        return sb.toString();
    }

}