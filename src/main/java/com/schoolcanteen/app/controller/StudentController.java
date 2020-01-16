package com.schoolcanteen.app.controller;


import com.schoolcanteen.app.model.OrderModel;
import com.schoolcanteen.app.model.UserModel;
import com.schoolcanteen.app.service.OrderService;
import com.schoolcanteen.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {

    private static final String USER_DETAILS = "userDetails";
    private static final String USER_ORDERS = "userOrders";

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;


    @GetMapping(value = "/user")
    public String getUserDetails(Model model) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();

        UserModel userDetails = userService.findByUsername(username).get();
        String regn = userDetails.getRegn();
        List<OrderModel> userOrders = orderService.findByRegn(regn);



        model.addAttribute(USER_DETAILS, userDetails);
        model.addAttribute(USER_ORDERS, userOrders);

        

        return "pages/student";
    }


}
