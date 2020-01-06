package com.schoolcanteen.app.mappers;


import com.schoolcanteen.app.domain.Product;
import com.schoolcanteen.app.model.ProductModel;
import org.springframework.stereotype.Component;

@Component
public class ProductToProductModelMapper {

    public ProductModel mapToProductModel(Product products) {
        ProductModel productModel = new ProductModel();
        productModel.setProductName(products.getProductName());
        productModel.setProductPrice(products.getProductPrice());


        return productModel;
    }
}