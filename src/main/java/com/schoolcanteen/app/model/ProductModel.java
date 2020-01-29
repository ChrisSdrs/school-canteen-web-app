package com.schoolcanteen.app.model;


public class ProductModel {

    private Long id;
    private String productSerialNumber;
    private String productName;
    private double price;



    public ProductModel() {
    }

    public ProductModel(Long id, String productSerialNumber, String productName, double price) {
        this.id = id;
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

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("id=").append(id);
        sb.append(", productSerialNumber='").append(productSerialNumber);
        sb.append(", productNameame='").append(productName);
        sb.append(", price=").append(price);
        sb.append('}');

        return sb.toString();
    }
}
