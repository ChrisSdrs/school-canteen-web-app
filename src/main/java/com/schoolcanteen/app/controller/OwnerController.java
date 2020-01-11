package com.schoolcanteen.app.controller;


import com.schoolcanteen.app.model.PropertyModel;
import com.schoolcanteen.app.model.UserModel;
import com.schoolcanteen.app.service.PropertyService;
import com.schoolcanteen.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class OwnerController {

    private static final String USER_DETAILS = "userDetails";
    private static final String USER_PROPERTIES = "userProperties";

    @Autowired
    private UserService userService;

    @Autowired
    private PropertyService propertyService;


    @GetMapping(value = "/user")
    public String repairsToday(Model model) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();

        UserModel userDetails = userService.findByUsername(username).get();
        String regn = userDetails.getRegn();
        List<PropertyModel> userProperties = propertyService.findByOwner(regn);



        model.addAttribute(USER_DETAILS, userDetails);
        model.addAttribute(USER_PROPERTIES, userProperties);

        return "pages/owner";
    }


}
