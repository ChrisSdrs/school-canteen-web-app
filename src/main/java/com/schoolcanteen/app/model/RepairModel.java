package com.schoolcanteen.app.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class RepairModel {
    long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate date;
    String status;
    String category;
    String type;
    Double cost;
    String address;
    String owner;
    String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
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

    public RepairModel() {
    }

    public RepairModel(long id, LocalDate date, String status, String category, String type, double cost, String address, String owner, String description) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.category = category;
        this.type = type;
        this.cost = cost;
        this.address = address;
        this.owner = owner;
        this.description = description;
    }

    public String toString(){
        final StringBuilder sb = new StringBuilder("Repair{");
        sb.append("id=").append(id);
        sb.append(", repairDate=").append(date);
        sb.append(", status=").append(status);
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
