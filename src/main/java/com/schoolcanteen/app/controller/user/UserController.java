package com.schoolcanteen.app.controller.user;

import com.schoolcanteen.app.model.UserModel;
import com.schoolcanteen.app.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class UserController {
    private static final String USER_LIST = "users";
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @GetMapping(value="/admin/users")
    public String users(Model model) {
        List<UserModel> users = userService.findByRole("Student");
        model.addAttribute(USER_LIST, users);
        return "pages/users_show";
    }

    public void FindAll(){
        userService.findAll().forEach(users -> logger.info(users.toString()));
    }

    public void FindByRegn(String regn){
        userService.findByRegn(regn).forEach(users -> logger.info(users.toString()));
    }

    public void FindByGrade(String grade){
        userService.findByGrade(grade).forEach(users -> logger.info(users.toString()));
    }

    public void FindByEmail(String email){
        userService.findByEmail(email).forEach(users -> logger.info(users.toString()));
    }

    public void FindByRegnAndEmail(String regn, String email){
        userService.findByRegnAndEmail(regn, email).forEach(users -> logger.info(users.toString()));
    }
}
