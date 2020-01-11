package com.schoolcanteen.app.repository;

import com.schoolcanteen.app.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findAll();

    Order save(Order order);
}
