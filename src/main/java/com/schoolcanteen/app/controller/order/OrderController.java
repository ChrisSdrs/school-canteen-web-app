package com.schoolcanteen.app.controller.order;

import com.schoolcanteen.app.domain.Order;
import com.schoolcanteen.app.domain.User;
import com.schoolcanteen.app.forms.OrderForm;
import com.schoolcanteen.app.mappers.OrderFormToOrderMapper;
import com.schoolcanteen.app.model.OrderModel;
import com.schoolcanteen.app.model.UserModel;
import com.schoolcanteen.app.service.OrderService;
import com.schoolcanteen.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Iterator;
import java.util.List;

@Controller
public class OrderController {

    private static final String ORDER_FORM = "orderForm";
    private static final String ORDERS = "orders";


    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @Autowired
    private OrderFormToOrderMapper mapper;


    @GetMapping(value = "/admin/properties")
    public String properties(Model model) {

        List<OrderModel> orders = orderService.findAll();
        model.addAttribute(ORDERS, orders);
        return "pages/properties_show";
    }


    @GetMapping(value = "/admin/properties/create")
    public String createProperty(Model model) {

        model.addAttribute(ORDER_FORM, new OrderForm());
        return "pages/order_create";
    }

    @PostMapping(value = "/admin/properties/create")
    public String createProperty(Model model, @Valid @ModelAttribute(ORDER_FORM) OrderForm orderForm) {

        Order order = mapper.mapToOrderModel(orderForm);
        orderService.createOrder(order);

        String regn = order.getRegn();
        Double purchaseCost = order.getCost();
        List<UserModel> studentList = userService.findByRegn(regn);

        Iterator iter = studentList.iterator();
        UserModel student = (UserModel) iter.next();
        Double sumDue = student.getDebt();
        sumDue += purchaseCost;
        student.setDebt(sumDue);

        userService.updateUser(student);
        return "redirect:/admin/properties";



    }
}
