package com.repository;

import com.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findAll();
    Boolean existsByLoginAndPwd(String login, String password);

    User findByLoginAndPwd(String username, String password);
}
