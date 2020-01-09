package com.schoolcanteen.app.forms;

public class PropertyForm {

    private Long id;
    private String pin;
    private String address;
    private int year;
    private String type;
    private String owner;

    public PropertyForm() {
    }

    public PropertyForm(Long id, String pin, String address, int year, String type, String owner) {
        this.id = id;
        this.pin = pin;
        this.address = address;
        this.year = year;
        this.type = type;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

