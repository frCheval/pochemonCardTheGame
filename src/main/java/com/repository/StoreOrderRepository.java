package com.repository;

import com.entity.StoreOrder;
import com.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StoreOrderRepository extends CrudRepository<StoreOrder, Integer> {
    List<StoreOrder> findAll();
}
