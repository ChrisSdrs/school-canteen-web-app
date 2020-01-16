package com.schoolcanteen.app.service;

import com.schoolcanteen.app.domain.Order;
import com.schoolcanteen.app.mappers.OrderToOrderModelMapper;
import com.schoolcanteen.app.model.OrderModel;
import com.schoolcanteen.app.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderToOrderModelMapper mapper;

    @Override
    public List<OrderModel> findAll() {
        return orderRepository.findAll()
                .stream()
                .map(order -> mapper.mapToOrderModel(order))
                .collect(Collectors.toList());
    }

    @Override
    public List<OrderModel> findByRegn(String regn) {
        return orderRepository.findByRegn(regn)
                .stream()
                .map(order -> mapper.mapToOrderModel(order))
                .collect(Collectors.toList());
    }

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void deleteById(Long id) {
        orderRepository.deleteById(id);
    }

}
