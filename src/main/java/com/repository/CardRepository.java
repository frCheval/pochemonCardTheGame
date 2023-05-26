package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Card;

public interface CardRepository extends JpaRepository<Card, Integer> {
    List<Card> findAll();

    List<Card> findAllByUserId(Integer id);
}
