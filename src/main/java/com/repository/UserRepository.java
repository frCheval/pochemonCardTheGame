package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAll();
    Boolean existsByLoginAndPwd(String login, String password);
}
