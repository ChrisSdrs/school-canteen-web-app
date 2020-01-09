package com.schoolcanteen.app.domain;


import javax.persistence.*;

@Entity
@Table(name = "Property")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "property_pin")
    private String pin;

    @Column(name = "property_address")
    private String address;

    @Column(name = "property_year")
    private int year;

    @Column(name = "property_type")
    private String type;

    @Column(name = "property_owner")
    private String owner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Property() {
    }

    public Property(String pin, String address, int year, String type, String owner) {
        this.pin = pin;
        this.address = address;
        this.year = year;
        this.type = type;
        this.owner = owner;
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
