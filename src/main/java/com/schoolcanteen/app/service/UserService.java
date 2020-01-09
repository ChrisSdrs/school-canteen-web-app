package com.schoolcanteen.app.service;


import com.schoolcanteen.app.domain.User;
import com.schoolcanteen.app.model.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User createUser(User user);

    User updateUser(UserModel userModel);

    List<UserModel> findAll();

    List<UserModel> findByRole(String role);

    List<UserModel> findByRegn(String regn);

   List<UserModel> findByGrade(String grade);

    List<UserModel> findByEmail(String email);

    List<UserModel> findByRegnAndEmail(String regn, String email);

    Optional<UserModel> findById(Long id);

    Optional<UserModel> findByUsername(String username);

    Optional<UserModel> findByUsernameAndPassword(String username, String password);

    void deleteById(Long id);

    Optional<UserModel> findByRegnOrEmailOrUsername(String regn, String email, String username);


    List<UserModel> findByGradeAndEmail(String grade, String email);
}
