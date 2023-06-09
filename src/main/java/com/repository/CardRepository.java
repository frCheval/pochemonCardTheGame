package com.repository;

import com.entity.Card;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CardRepository extends CrudRepository<Card, Integer> {
    List<Card> findAll();

    List<Card> findAllByUserId(Integer id);
}
