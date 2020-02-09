package com.schoolcanteen.app.service;

import com.schoolcanteen.app.domain.Order;
import com.schoolcanteen.app.mappers.OrderToOrderModelMapper;
import com.schoolcanteen.app.model.OrderModel;
import com.schoolcanteen.app.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderToOrderModelMapper mapper;

    @Override
    public Optional<OrderModel> findById(Long id) {
        return orderRepository.findById(id)
                .map(order -> mapper.mapToOrderModel(order));
    }

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
    public List<OrderModel> findByDateAfter(LocalDate dateAfter) {
        return orderRepository.findByDateAfter(dateAfter)
                .stream()
                .map(order -> mapper.mapToOrderModel((Order) order))
                .collect(Collectors.toList());
    }

    @Override
    public List<OrderModel> findByDateBefore(LocalDate dateBefore) {
        return orderRepository.findByDateBefore(dateBefore)
                .stream()
                .map(order -> mapper.mapToOrderModel(order))
                .collect(Collectors.toList());
    }

    @Override
    public List<OrderModel> findByDateBetween(LocalDate dateUntil, LocalDate dateBefore) {
        return orderRepository.findByDateBetween(dateUntil, dateBefore)
                .stream()
                .map(order -> mapper.mapToOrderModel(order))
                .collect(Collectors.toList());
    }

    @Override
    public List<OrderModel> findByRegnAndDateAfter(String regn, LocalDate dateAfter) {
        return orderRepository.findByRegnAndDateAfter(regn, dateAfter)
                .stream()
                .map(order -> mapper.mapToOrderModel(order))
                .collect(Collectors.toList());
    }

    @Override
    public List<OrderModel> findByRegnAndDateBefore(String regn, LocalDate dateBefore) {
        return orderRepository.findByRegnAndDateBefore(regn, dateBefore)
                .stream()
                .map(order -> mapper.mapToOrderModel(order))
                .collect(Collectors.toList());
    }

    @Override
    public List<OrderModel> findByRegnAndDateBetween(String regn, LocalDate dateAfter, LocalDate dateBefore) {
        return orderRepository.findByRegnAndDateBetween(regn, dateAfter, dateBefore)
                .stream()
                .map(order -> mapper.mapToOrderModel(order))
                .collect(Collectors.toList());
    }

    @Override
    public Order updateOrder(OrderModel orderModel) {
        Order originalOrder = orderRepository.findById(orderModel.getId()).get();
        originalOrder.setDate(orderModel.getDate());
        originalOrder.setProductName(orderModel.getProductName());
        originalOrder.setCost(orderModel.getCost());
        originalOrder.setRegn(orderModel.getRegn());

        return orderRepository.save(originalOrder);
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
