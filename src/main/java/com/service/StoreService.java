package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.StoreOrderRepository;
import com.repository.StoreTransactionRepository;

@Service
public class StoreService {

	@Autowired
	StoreTransactionRepository storeTransactionRepository;
	
	@Autowired
	StoreOrderRepository storeOrderRepository;
	
}
