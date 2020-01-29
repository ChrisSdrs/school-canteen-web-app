package com.schoolcanteen.app.mappers;


import com.schoolcanteen.app.domain.Order;
import com.schoolcanteen.app.model.OrderModel;
import org.springframework.stereotype.Component;

@Component
public class OrderToOrderModelMapper {

    public OrderModel mapToOrderModel(Order order) {
        OrderModel orderModel = new OrderModel();
        orderModel.setId(order.getId());
        orderModel.setDate(order.getDate());
        orderModel.setCost(order.getCost());
        orderModel.setDescription(order.getDescription());
        orderModel.setRegn(order.getRegn());

        return orderModel;
    }
}