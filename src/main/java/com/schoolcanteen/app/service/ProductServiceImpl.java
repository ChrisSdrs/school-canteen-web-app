package com.schoolcanteen.app.service;


import com.schoolcanteen.app.domain.Product;
import com.schoolcanteen.app.mappers.ProductToProductModelMapper;
import com.schoolcanteen.app.model.ProductModel;
import com.schoolcanteen.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductToProductModelMapper mapper;


    @Override
    public List<ProductModel> findAll() {
        return productRepository.findAll()
                .stream()
                .map(product -> mapper.mapToProductModel(product))
                .collect(Collectors.toList());
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<ProductModel> findById(Long id) {
        return productRepository.findById(id)
                .map(product -> mapper.mapToProductModel(product));
    }

    @Override
    public Product updateProduct(ProductModel productModel){
        Product originalProduct = productRepository.findById(productModel.getId()).get();
        originalProduct.setProductName(productModel.getProductName());
        originalProduct.setPrice(productModel.getPrice());
        originalProduct.setProductSerialNumber(productModel.getProductSerialNumber());
        return productRepository.save(originalProduct);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<ProductModel> findByProductSerialNumber(String productSerialNumber) {
        return productRepository.findByProductSerialNumber(productSerialNumber)
                .stream()
                .map(product -> mapper.mapToProductModel(product))
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductModel> findByProductName(String productName) {
        return productRepository.findByProductName(productName)
                .stream()
                .map(product -> mapper.mapToProductModel(product))
                .collect(Collectors.toList());
    }


    @Override
    public List<ProductModel> findByProductSerialNumberAndProductName(String productSerialNumber, String product) {
        return productRepository.findByProductSerialNumberAndProductName(productSerialNumber, product)
                .stream()
                .map(product -> mapper.mapToProductModel(product))
                .collect(Collectors.toList());
    }


}
