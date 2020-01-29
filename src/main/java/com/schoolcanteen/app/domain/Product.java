package com.schoolcanteen.app.domain;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "product_serial_number")
    private String productSerialNumber;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_price")
    private String price;



    public Product() {
    }

    public Product(String productSerialNumber, String productName, String price) {
        this.productSerialNumber = productSerialNumber;
        this.productName = productName;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductSerialNumber() {
        return productSerialNumber;
    }

    public void setProductSerialNumber(String productSerialNumber) {
        this.productSerialNumber = productSerialNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) { this.productName = productName; }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
