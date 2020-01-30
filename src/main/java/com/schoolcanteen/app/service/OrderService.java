package com.schoolcanteen.app.service;

import com.schoolcanteen.app.domain.Order;
import com.schoolcanteen.app.model.OrderModel;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public interface OrderService {

    Optional<OrderModel> findById(Long id);

    List<OrderModel> findAll();

    List<OrderModel> findByRegn(String regn);

    Order updateOrder(OrderModel orderModel);

    Order createOrder(Order order);

    void deleteById(Long id);


    List<OrderModel> findByDateAfter(LocalDate dateAfter);

    List<OrderModel> findByDateBefore(LocalDate dateBefore);

    List<OrderModel> findByDateBetween(LocalDate dateAfter, LocalDate dateBefore);

    List<OrderModel> findByRegnAndDateBefore(String regn, LocalDate dateBefore);

    List<OrderModel> findByRegnAndDateAfter(String regn, LocalDate dateAfter);

    List<OrderModel> findByRegnAndDateBetween(String regn, LocalDate dateAfter, LocalDate dateBefore);
}
