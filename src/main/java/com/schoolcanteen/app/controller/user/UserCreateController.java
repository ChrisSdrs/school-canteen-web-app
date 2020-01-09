package com.schoolcanteen.app.controller.user;

import com.schoolcanteen.app.domain.User;
import com.schoolcanteen.app.forms.UserCreateForm;
import com.schoolcanteen.app.mappers.UserFormToUserMapper;
import com.schoolcanteen.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

import static com.schoolcanteen.app.utils.GlobalAttributes.ALERT_MESSAGE;
import static com.schoolcanteen.app.utils.GlobalAttributes.ALERT_TYPE;
import static javax.servlet.RequestDispatcher.ERROR_MESSAGE;


@Controller
    public class UserCreateController {
        private static final String USERS_FORM = "userCreateForm";
        private static final String USER_CREATE_ERROR = "userCreateError";

        @Autowired
        private UserService userService;

        @Autowired
        private UserFormToUserMapper mapper;

        @GetMapping(value = "/admin/users/create")
        public String usersDynamic(Model model) {

            model.addAttribute(USERS_FORM, new UserCreateForm());
            return "pages/user_create";
        }

        @PostMapping(value = "/admin/users/create")
        public String createUser(Model model,
                                 @Valid @ModelAttribute(USERS_FORM)
                                          UserCreateForm userCreateForm,
                                 BindingResult bindingResult, RedirectAttributes redirectAttrs) {

            if (bindingResult.hasErrors()) {
                //have some error handling here, perhaps add extra error messages to the model
                model.addAttribute(ERROR_MESSAGE, "an error occurred");
                return "pages/user_create";
            }

            User user = mapper.toUser(userCreateForm);
            if (isValidUserEmptyFields(user)) {
                if (isValidUser(user) == "") {
                    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
                    String password = user.getPassword();
                    String encodedPW = encoder.encode(password);
                    user.setPassword(encodedPW);
                    userService.createUser(user);
                    redirectAttrs.addFlashAttribute(ALERT_TYPE, "success");
                    redirectAttrs.addFlashAttribute(ALERT_MESSAGE, "User Created Successfully!");
                    return "redirect:/admin/users";
                } else {
                    model.addAttribute(USERS_FORM, userCreateForm);
                    model.addAttribute(USER_CREATE_ERROR, isValidUser(user));

                    return "pages/user_create";
                }
            }else{
                model.addAttribute(USERS_FORM, userCreateForm);
                model.addAttribute(USER_CREATE_ERROR, "Please fill all fields!");
                return "pages/user_create";
            }
        }

        private String isValidUser(User user) {
            String result = "";
            String regn = user.getRegn();
            String email = user.getEmail();
            String username = user.getUsername();
            //User provided is not Valid if any of the ssn,email,username already exists
            if (!userService.findByRegn(regn).isEmpty()) {
                result += "Ssn Already Exists. ";
            }
            if (!userService.findByEmail(email).isEmpty()) {
                result += "Email Already Exists. ";
            }
            if (!userService.findByUsername(username).isEmpty()) {
                result += "Username Already Exists. ";
            }

            return result;


        }

        private boolean isValidUserEmptyFields(User user){
            boolean isValid   = true;
            String ssn = user.getRegn();

            String firstName = user.getFirstName();
            String lastName = user.getLastName();
            String address = user.getAddress();
            String phone = user.getPhone();
            String email = user.getEmail();
            String username = user.getUsername();
            String password = user.getPassword();
            String role = user.getRole();
            if (ssn.isEmpty() || email.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || address.isEmpty() || phone.isEmpty() || username.isEmpty() || password == null || role.isEmpty()){
                isValid = false;
            }

            return isValid;
        }

}
