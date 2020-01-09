package com.schoolcanteen.app.controller.user;

import com.schoolcanteen.app.forms.UserSearchForm;
import com.schoolcanteen.app.mappers.UserFormToUserMapper;
import com.schoolcanteen.app.model.UserModel;
import com.schoolcanteen.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

import static javax.servlet.RequestDispatcher.ERROR_MESSAGE;


@Controller
public class UserSearchController {
    private static final String USER_SEARCH_FORM = "userSearchForm";
    private static final String USER_LIST = "users";

    @Autowired
    private UserService userService;

    @Autowired
    private UserFormToUserMapper mapper;

    @GetMapping(value = "/admin/users/search")
    public String searchUsers(Model model) {
        model.addAttribute(USER_SEARCH_FORM, new UserSearchForm());
        return "pages/users_search";
    }

    @PostMapping(value = "/admin/users/search")
    public String searchUsers(Model model,
                              @Valid @ModelAttribute(USER_SEARCH_FORM)
                                      UserSearchForm userSearchForm,
                              BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "pages/users_search";
        }
        String grade = userSearchForm.getGrade();
        String email = userSearchForm.getEmail();


        List<UserModel> users = getUsersFromSearch(grade, email);
        model.addAttribute(USER_LIST, users);
        model.addAttribute(USER_SEARCH_FORM, userSearchForm);
        return "pages/users_search_results";
    }

    private List<UserModel> getUsersFromSearch(String grade, String email){
        if (grade != "" && email != ""){

            return userService.findByGradeAndEmail(grade, email);

        }else if (grade != "" && email == ""){

            return userService.findByGrade(grade);

        }else if (grade == "" && email != ""){

            return userService.findByEmail(email);

        } else return userService.findByRole("Student");
    }

}

