package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.StoreTransaction;
import com.service.StoreService;

@RestController
@RequestMapping("/store")
public class StoreController {
	
	@Autowired
	StoreService storeService;
	
	@PostMapping("/sell")
	public String sellCard(Model model) {
		return "auth";
	}
	
	@PostMapping("/buy")
	public String buyCard(Model model) {
		return "auth";
	}
	
	@GetMapping("/transaction/all")
	public List<StoreTransaction> getAllTransactions(Model model) {
		return storeService.getAllStoreTransaction();
	}

}
