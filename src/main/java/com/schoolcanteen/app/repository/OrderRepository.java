package com.schoolcanteen.app.repository;

import com.schoolcanteen.app.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findAll();

    List<Order> findByRegn(String regn);

    List<Order> findByDateAfter(LocalDate dateAfter);

    List<Order> findByDateBefore(LocalDate dateBefore);

    List<Order> findByDateBetween(LocalDate dateAfter, LocalDate dateBefore);

    List<Order> findByRegnAndDateBefore(String regn, LocalDate dateBefore);

    List<Order> findByRegnAndDateAfter(String regn, LocalDate dateAfter);

    List<Order> findByRegnAndDateBetween(String regn, LocalDate dateAfter, LocalDate dateBefore);


    Order save(Order order);
}
