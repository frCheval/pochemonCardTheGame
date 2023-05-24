package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/card")
public class CardController {
	
	@GetMapping
	public String getCard(Model model) {
		return "card";
	}
	
	@PutMapping
	public String editCard(Model model) {
		return "card";
	}
	
	@DeleteMapping
	public String removeCard(Model model) {
		return "card";
	}
	
	@PostMapping
	public String addCard(Model model) {
		return "card";
	}
	
	@PostMapping("/to_sell")
	public String getAllCardsToSell(Model model) {
		return "to_sell";
	}
	
	@GetMapping("/all")
	public String getAllCards(Model model) {
		return "all";
	}

}
