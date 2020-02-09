package com.schoolcanteen.app.controller.order;

import com.schoolcanteen.app.domain.Order;
import com.schoolcanteen.app.forms.OrderForm;
import com.schoolcanteen.app.forms.OrderSearchForm;
import com.schoolcanteen.app.mappers.OrderFormToOrderMapper;
import com.schoolcanteen.app.model.OrderModel;
import com.schoolcanteen.app.model.UserModel;
import com.schoolcanteen.app.service.OrderService;
import com.schoolcanteen.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import static javax.servlet.RequestDispatcher.ERROR_MESSAGE;

@Controller
public class OrderController {

    private static final String ORDER_FORM = "orderForm";
    private static final String ORDERS = "orders";
    private static final String ORDERS_SEARCH_FORM = "OrderSearchForm";
    private static final String ORDER_LIST = "orders";


    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @Autowired
    private OrderFormToOrderMapper mapper;


    @GetMapping(value = "/admin/orders")
    public String orders(Model model) {

        List<OrderModel> orders = orderService.findAll();
        model.addAttribute(ORDERS, orders);
        return "pages/orders_show";
    }


    @GetMapping(value = "/admin/orders/create")
    public String createOrder(Model model) {

        model.addAttribute(ORDER_FORM, new OrderForm());
        return "pages/orders_create";
    }

//search orders
    @GetMapping(value = "/admin/orders/search")
    public String searchOrders(Model model) {
        model.addAttribute(ORDERS_SEARCH_FORM, new OrderSearchForm());
        return "pages/orders_search";
    }

    @PostMapping(value = "/admin/orders/search")
    public String searchOrders(Model model,
                                @Valid @ModelAttribute(ORDERS_SEARCH_FORM)
                                        OrderSearchForm orderSearchForm,
                                BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "pages/orders_search";
        }
        String regn = orderSearchForm.getRegn();
        LocalDate dateFrom = orderSearchForm.getDateFrom();
        LocalDate dateTo = orderSearchForm.getDateTo();

        List<OrderModel> orders = getOrdersFromSearch(regn,dateFrom,dateTo);
        model.addAttribute(ORDER_LIST, orders);
        model.addAttribute(ORDERS_SEARCH_FORM, orderSearchForm);
        return "pages/orders_search_results";
    }

    private List<OrderModel> getOrdersFromSearch(String regn, LocalDate dateFrom, LocalDate dateTo){
        if (regn == ""){
            if (dateFrom == null){
                if (dateTo == null){
                    return orderService.findAll();
                }
                else{
                    return orderService.findByDateBefore(dateTo);
                }
            }
            else{
                if (dateTo == null){
                    return orderService.findByDateAfter(dateFrom);
                }
                else{
                    return orderService.findByDateBetween(dateFrom, dateTo);
                }
            }
        }
        else{
            if (dateFrom == null){
                if (dateTo == null){
                    return orderService.findByRegn(regn);
                }
                else{
                    return orderService.findByRegnAndDateBefore(regn, dateTo);
                }
            }
            else{
                if (dateTo == null){
                    return orderService.findByRegnAndDateAfter(regn, dateFrom);
                }
                else{
                    return orderService.findByRegnAndDateBetween(regn, dateFrom, dateTo);
                }
            }
        }

    }

    //create order
    @PostMapping(value = "/admin/orders/create")
    public String createOrder(Model model, @Valid @ModelAttribute(ORDER_FORM) OrderForm orderForm) {

        Order order = mapper.mapToOrderModel(orderForm);
        orderService.createOrder(order);

        String regn = order.getRegn();
        Double orderCost = order.getCost();
        if (!userService.findByRegn(regn).isEmpty()) {
            List<UserModel> studentList = userService.findByRegn(regn);

            Iterator iter = studentList.iterator();

            UserModel student = (UserModel) iter.next();
            Double sumDue = student.getDebt();
            sumDue += orderCost;
            student.setDebt(sumDue);

            userService.updateUser(student);
        }
        return "redirect:/admin/orders";



    }

    @PostMapping(value = "/admin/orders/{id}/delete")
    public String deleteUser(@PathVariable Long id) {
        orderService.deleteById(id);
        return "redirect:/admin/orders";
    }
}

