package com.schoolcanteen.app.mappers;

import com.schoolcanteen.app.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductToProductModelMapper {

    public ProductModel mapToProductModel(Product product) {
        ProductModel productModel = new ProductModel();
        productModel.setId(product.getId());
        productModel.setPrice(product.getPrice());
        productModel.setProductName(product.getProductName());
        productModel.setProductSerialNumber(product.getProductSerialNumber());


        return productModel;
    }
}
