package com.schoolcanteen.app.service;

import com.schoolcanteen.app.domain.Order;
import com.schoolcanteen.app.model.OrderModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {

    List<OrderModel> findAll();

    List<OrderModel> findByRegn(String regn);

    Order createOrder(Order order);

    void deleteById(Long id);
}
