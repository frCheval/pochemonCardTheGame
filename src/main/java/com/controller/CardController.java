package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Card;
import com.service.CardService;

@Controller
@RequestMapping("/card")
public class CardController {
	
	@Autowired
	CardService cardService;
	
	@GetMapping("/{id}")
	public String getCard(Model model, @PathVariable Integer id) {
		//Mettre la carte dans le modele ou quoi suivant ce qu'on veut faire
		@SuppressWarnings("unused")
		Card card = cardService.getCard(id);
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
