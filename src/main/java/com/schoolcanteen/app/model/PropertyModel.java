package com.schoolcanteen.app.model;


public class PropertyModel {

    private Long id;
    private String pin;
    private String address;
    private int year;
    private String type;
    private String owner;

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

    public PropertyModel() {
    }

    public PropertyModel(Long id, String pin, String address, int year, String type, String owner) {
        this.id = id;
        this.pin = pin;
        this.address = address;
        this.year = year;
        this.type = type;
        this.owner = owner;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Repair{");
        sb.append("id=").append(id);
        sb.append(", pin='").append(pin);
        sb.append(", address='").append(address);
        sb.append(", type=").append(type);
        sb.append(", year=").append(year);
        sb.append(", type=").append(type);
        sb.append(", owner=").append(owner);
        sb.append('}');

        return sb.toString();
    }
}
