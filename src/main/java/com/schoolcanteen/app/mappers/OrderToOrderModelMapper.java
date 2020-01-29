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
        orderModel.setProductName(order.getProductName());
        orderModel.setRegn(order.getRegn());

        return orderModel;
    }
}