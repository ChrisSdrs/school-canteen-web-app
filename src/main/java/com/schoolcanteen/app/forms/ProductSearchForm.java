package com.schoolcanteen.app.forms;

public class ProductSearchForm {

    String productName;
    String productSerialNumber;

    public ProductSearchForm() {
    }

    public ProductSearchForm(String productName, String productSerialNumber) {
        this.productName = productName;
        this.productSerialNumber = productSerialNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSerialNumber() {
        return productSerialNumber;
    }

    public void setProductSerialNumber(String productSerialNumber) {
        this.productSerialNumber = productSerialNumber;
    }
}
