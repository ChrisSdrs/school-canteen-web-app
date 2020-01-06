package com.schoolcanteen.app.repository;

import com.schoolcanteen.app.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAll();

    Product save(Product product);

    Optional<Product> findById(Long id);

    List<Product> findByProductName(String productName);


}
