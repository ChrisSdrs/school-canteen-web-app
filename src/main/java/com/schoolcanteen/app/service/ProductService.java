package com.schoolcanteen.app.service;


import com.schoolcanteen.app.domain.Product;
import com.schoolcanteen.app.model.ProductModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {

    List<ProductModel> findAll();

    Product createProduct(Product product);

    Optional<ProductModel> findById(Long id);

    Product updateProduct(ProductModel productModel);

    void deleteById(Long id);

    List<ProductModel> findByProductSerialNumber(String productSerialNumber);

    List<ProductModel> findByProductName(String productName);

    List<ProductModel> findByProductSerialNumberAndProductName(String productSerialNumber, String productName);
}
