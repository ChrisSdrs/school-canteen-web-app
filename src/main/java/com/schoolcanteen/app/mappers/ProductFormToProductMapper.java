package com.schoolcanteen.app.mappers;

import com.schoolcanteen.app.domain.Product;
import com.schoolcanteen.app.forms.ProductForm;
import org.springframework.stereotype.Component;


@Component
public class ProductFormToProductMapper {

    public Product toProduct(ProductForm productForm){
        Product product = new Product();
        product.setProductSerialNumber(productForm.getProductSerialNumber());
        product.setPrice(productForm.getPrice());
        product.setProductName(productForm.getProductName());


        return product;
    }

}
