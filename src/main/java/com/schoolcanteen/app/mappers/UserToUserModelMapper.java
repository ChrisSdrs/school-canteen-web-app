package com.schoolcanteen.app.mappers;

import com.schoolcanteen.app.domain.User;
import com.schoolcanteen.app.model.UserModel;
import org.springframework.stereotype.Component;


@Component
public class UserToUserModelMapper {

    public UserModel mapToUserModel(User users) {
        UserModel userModel = new UserModel();
        userModel.setId(users.getId());
        userModel.setRegn(users.getRegn());
        userModel.setFirstName(users.getFirstName());
        userModel.setLastName(users.getLastName());
        userModel.setGrade(users.getGrade());
        userModel.setPhone(users.getPhone());
        userModel.setEmail(users.getEmail());
        userModel.setAddress(users.getAddress());
        userModel.setRole(users.getRole());
        userModel.setUsername(users.getUsername());


        return userModel;
    }
}