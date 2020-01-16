package com.schoolcanteen.app.controller;

import com.schoolcanteen.app.model.UserModel;
import com.schoolcanteen.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

import static com.schoolcanteen.app.utils.GlobalAttributes.ALERT_MESSAGE;
import static com.schoolcanteen.app.utils.GlobalAttributes.ALERT_TYPE;

@Controller
public class HomeController {

    private static final String USER_LIST = "users";

    @Autowired
    private UserService userService;

    @GetMapping(value = "/home")
    public String login() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        UserModel userDetails = userService.findByUsername(username).get();
        String role = userDetails.getRole();
        if (role.matches("Admin")){
            return "redirect:/admin";
        }
        else if(role.matches("Student")){
            return "redirect:/user";
        }
        return "redirect:/login";
    }

    @GetMapping(value = "/admin")
    public String users(Model model, @ModelAttribute(ALERT_TYPE) String alertType, @ModelAttribute(ALERT_MESSAGE) String alertMessage) {
        List<UserModel> users = userService.findByRole("Student");
        model.addAttribute(USER_LIST, users);
        return "pages/users_show";
    }


}
