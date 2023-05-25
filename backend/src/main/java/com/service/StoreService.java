package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.StoreTransaction;
import com.repository.StoreOrderRepository;
import com.repository.StoreTransactionRepository;

@Service
public class StoreService {

	@Autowired
	StoreTransactionRepository storeTransactionRepository;
	
	@Autowired
	StoreOrderRepository storeOrderRepository;
	
	public List<StoreTransaction> getAllStoreTransaction() {
		return storeTransactionRepository.findAll();
	}
	
}
