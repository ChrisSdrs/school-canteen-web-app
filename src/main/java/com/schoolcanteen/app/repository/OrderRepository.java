package com.schoolcanteen.app.repository;

import com.schoolcanteen.app.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findAll();

    List<Order> findByRegn(String regn);

    List<Order> findByDateBefore(LocalDate dateBefore);

    List<Object> findByDateAfter(LocalDate dateAfter);

    List<Order> findByDateBetween(LocalDate dateUntil, LocalDate dateBefore);

    List<Order> findByRegnAndDateBefore(String regn, LocalDate dateBefore);

    List<Order> findByRegnAndDateAfter(String regn, LocalDate dateAfter);

    List<Order> findByRegnAndDateBetween(String regn, LocalDate dateUntil, LocalDate dateBefore);


    Order save(Order order);
}
