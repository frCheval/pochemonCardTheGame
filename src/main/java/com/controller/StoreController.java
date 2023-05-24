package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/store")
public class StoreController {
	
	@PostMapping("/sell")
	public String sellCard(Model model) {
		return "auth";
	}
	
	@PostMapping("/buy")
	public String buyCard(Model model) {
		return "auth";
	}
	
	@GetMapping("/transaction/all")
	public String getAllTransactions(Model model) {
		return "transaction";
	}

}