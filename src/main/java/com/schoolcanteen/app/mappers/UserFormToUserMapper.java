package com.schoolcanteen.app.mappers;

import com.schoolcanteen.app.domain.User;
import com.schoolcanteen.app.forms.UserCreateForm;
import org.springframework.stereotype.Component;


@Component
public class UserFormToUserMapper {

    public User toUser(UserCreateForm userCreateForm) {
        User user = new User();
        user.setRegn(userCreateForm.getRegn());
        user.setGrade(userCreateForm.getGrade());
        user.setFirstName(userCreateForm.getFirstName());
        user.setLastName(userCreateForm.getLastName());
        user.setAddress(userCreateForm.getAddress());
        user.setPhone(userCreateForm.getPhone());
        user.setEmail(userCreateForm.getEmail());
        user.setUsername(userCreateForm.getUsername());
        user.setPassword(userCreateForm.getPassword());
        user.setRole(userCreateForm.getRole());

        return user;
    }

}
