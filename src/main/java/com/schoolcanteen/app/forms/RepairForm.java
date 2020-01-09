package com.schoolcanteen.app.forms;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class RepairForm {

    Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate date;
    String status;
    String category;
    String type;
    double cost;
    String address;
    String owner;
    String description;


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

    public RepairForm() {

    }

    public RepairForm(Long id, LocalDate date, String status, String category, String type, double cost, String address, String owner, String description) {
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
}
