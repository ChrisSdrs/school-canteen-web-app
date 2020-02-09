package com.schoolcanteen.app.service;

import com.schoolcanteen.app.domain.Order;
import com.schoolcanteen.app.model.OrderModel;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public interface OrderService {

    Order createOrder(Order order);

    Order updateOrder(OrderModel orderModel);

    void deleteById(Long id);

    Optional<OrderModel> findById(Long id);

    List<OrderModel> findAll();

    List<OrderModel> findByRegn(String regn);

    List<OrderModel> findByDateAfter(LocalDate date);

    List<OrderModel> findByDateBefore(LocalDate date);

    List<OrderModel> findByRegnAndDateAfter(String regn, LocalDate dateAfter);

    List<OrderModel> findByRegnAndDateBefore(String regn, LocalDate dateBefore);

    List<OrderModel> findByDateBetween(LocalDate dateBefore, LocalDate dateAfter);

    List<OrderModel> findByRegnAndDateBetween(String regn, LocalDate dateBefore, LocalDate dateAfter);

}
