package com.schoolcanteen.app.repository;

import com.schoolcanteen.app.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Override
    List<User> findAll();

    List<User> findByRole(String role);

    Optional<User> findById(Long id);

    List<User> findByRegn(String regn);

    List<User> findByEmail(String email);

    List<User> findByRegnAndEmail(String regn, String email);

    Optional<User> findByUsername(String username);

    Optional<User> findByUsernameAndPassword(String username, String password);

    User save(User user);

    Optional<User> findByRegnOrEmailOrUsername(String regn, String email, String username);


}
