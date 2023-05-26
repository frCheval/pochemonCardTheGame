package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.StoreOrderDTO;
import com.dto.StoreTransactionDTO;
import com.mapper.StoreOrderMapper;
import com.mapper.StoreTransactionMapper;
import com.service.StoreService;

@RestController
@RequestMapping("/store")
public class StoreController {
	
	@Autowired
	StoreService storeService;
	
	@Autowired
	StoreOrderMapper storeOrderMapper;
	
	@Autowired
	StoreTransactionMapper storeTransactionMapper;
	
	@PostMapping("/sell")
	public Boolean sellCard(@RequestBody StoreOrderDTO storeOrderDTO) {
		return storeService.sellCard(storeOrderMapper.toStoreOrder(storeOrderDTO));
	}
	
	@PostMapping("/buy")
	public boolean buyCard(@RequestBody StoreOrderDTO storeOrderDTO) {
		return storeService.buyCard(storeOrderMapper.toStoreOrder(storeOrderDTO));
	}
	
	@GetMapping("/transaction/all")
	public List<StoreTransactionDTO> getAllTransactions() {
		return storeTransactionMapper.toListStoreTransactionDTO(storeService.getAllStoreTransaction());
	}

}
