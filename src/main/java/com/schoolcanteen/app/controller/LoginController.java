package com.schoolcanteen.app.controller;


import com.schoolcanteen.app.forms.LoginForm;
import com.schoolcanteen.app.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;


import static com.schoolcanteen.app.utils.GlobalAttributes.LOGIN_AUTHENTICATION;
import static javax.servlet.RequestDispatcher.ERROR_MESSAGE;

@Controller
public class LoginController {

    private static final String LOGIN_FORM = "loginForm";
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;


    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }

    @GetMapping(value = "/login-error")
    public String loginPost(Model model, HttpSession session,
                            @Valid @ModelAttribute(LOGIN_FORM)
                                    LoginForm loginForm,
                            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "login";
        }
        String username = loginForm.getUsername();
        String password = loginForm.getPassword();
        if (tryLoginAuthentication(username,password)){
            return "redirect:/home";
        }
        else {
            model.addAttribute(LOGIN_AUTHENTICATION, "fail");
            return "login";
        }
    }

    private boolean tryLoginAuthentication(String username, String password){
        return userService.findByUsernameAndPassword(username,password).isPresent();

    }


}
