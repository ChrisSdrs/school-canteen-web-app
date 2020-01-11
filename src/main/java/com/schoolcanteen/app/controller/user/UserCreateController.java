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

            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            String password = user.getPassword();
            String encodedPW = encoder.encode(password);
            user.setPassword(encodedPW);
            userService.createUser(user);
            redirectAttrs.addFlashAttribute(ALERT_TYPE, "success");
            redirectAttrs.addFlashAttribute(ALERT_MESSAGE, "User Created Successfully!");
            return "redirect:/admin/users";
        }


}
