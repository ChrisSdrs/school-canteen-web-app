package com.schoolcanteen.app.repository;

import com.schoolcanteen.app.domain.Property;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PropertyRepository extends JpaRepository<Property, Long> {

    List<Property> findAll();

    Property save(Property user);

    Optional<Property> findById(Long id);

    List<Property> findByPin(String pin);

    List<Property> findByOwner(String owner);

    List<Property> findByPinAndOwner(String pin, String owner);
}

