package com.repository;

import com.entity.Auth;
import com.entity.Card;
import org.springframework.data.repository.CrudRepository;

public interface AuthRepository extends CrudRepository<Auth, Integer> {
}
