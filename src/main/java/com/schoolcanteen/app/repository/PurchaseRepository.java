package com.schoolcanteen.app.repository;

import com.schoolcanteen.app.domain.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

    List<Purchase> findAll();

    Purchase save(Purchase user);

    Optional<Purchase> findById(Long id);

    List<Purchase> findByRegn(String regn);

}

