package com.schoolcanteen.app.mappers;

import com.schoolcanteen.app.domain.Order;
import com.schoolcanteen.app.forms.OrderForm;
import org.springframework.stereotype.Component;

@Component
public class OrderFormToOrderMapper {

    public Order mapToOrderModel(OrderForm orderForm) {
        Order order = new Order();
        order.setId(orderForm.getId());
        order.setRegn(orderForm.getRegn());
        order.setDescription(orderForm.getDescription());
        order.setCost(orderForm.getCost());
        return order;

    }
}

