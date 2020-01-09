package com.schoolcanteen.app.service;

import com.schoolcanteen.app.domain.User;
import com.schoolcanteen.app.mappers.UserToUserModelMapper;
import com.schoolcanteen.app.model.UserModel;
import com.schoolcanteen.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserToUserModelMapper mapper;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(UserModel userModel) {
        User originalUser = userRepository.findById(userModel.getId()).get();
        originalUser.setUsername(userModel.getUsername());
        originalUser.setFirstName(userModel.getFirstName());
        originalUser.setAddress(userModel.getAddress());
        originalUser.setEmail(userModel.getEmail());
        originalUser.setLastName(userModel.getLastName());
        originalUser.setPhone(userModel.getPhone());
        originalUser.setGrade(userModel.getGrade());
        originalUser.setRegn(userModel.getRegn());
        originalUser.setRole(userModel.getRole());
        return userRepository.save(originalUser);
    }

    @Override
    public List<UserModel> findAll() {
        return userRepository
                .findAll()
                .stream()
                .map(user -> mapper.mapToUserModel(user))
                .collect(Collectors.toList());
    }

    @Override
    public List<UserModel> findByRole(String role) {
        return userRepository.findByRole(role)
                .stream()
                .map(user -> mapper.mapToUserModel(user))
                .collect(Collectors.toList());
    }

    @Override
    public List<UserModel> findByRegn(String regn) {
        return userRepository
                .findByRegn(regn)
                .stream()
                .map(user -> mapper.mapToUserModel(user))
                .collect(Collectors.toList());
    }

    @Override
    public List<UserModel> findByEmail(String email) {
        return userRepository
                .findByEmail(email)
                .stream()
                .map(user -> mapper.mapToUserModel(user))
                .collect(Collectors.toList());    }

    @Override
    public List<UserModel> findByRegnAndEmail(String regn, String email) {
        return userRepository
                .findByRegnAndEmail(regn, email)
                .stream()
                .map(user -> mapper.mapToUserModel(user))
                .collect(Collectors.toList());    }

    @Override
    public Optional<UserModel> findById(Long id) {
        return userRepository
                .findById(id)
                .map(user -> mapper.mapToUserModel(user));
    }

    @Override
    public Optional<UserModel> findByUsername(String username) {
        return userRepository
                .findByUsername(username)
                .map(user -> mapper.mapToUserModel(user));
    }

    @Override
    public Optional<UserModel> findByUsernameAndPassword(String username, String password) {
        return userRepository
                .findByUsernameAndPassword(username, password)
                .map(user -> mapper.mapToUserModel(user));
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Optional<UserModel> findByRegnOrEmailOrUsername(String regn, String email, String username) {
        return userRepository.findByRegnOrEmailOrUsername(regn, email, username)
                .map(user -> mapper.mapToUserModel(user));
    }
}
