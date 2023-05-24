package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.entity.StoreTransaction;

public interface StoreTransactionRepository extends CrudRepository<StoreTransaction, Integer> {
    List<StoreTransaction> findAll();
}
