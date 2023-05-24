package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.entity.StoreOrder;

public interface StoreOrderRepository extends CrudRepository<StoreOrder, Integer> {
    List<StoreOrder> findAll();
    StoreOrder findByCardId(Integer id);
}
