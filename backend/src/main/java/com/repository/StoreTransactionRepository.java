package com.repository;

import com.entity.StoreOrder;
import com.entity.StoreTransaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StoreTransactionRepository extends CrudRepository<StoreTransaction, Integer> {
    List<StoreTransaction> findAll();
}
