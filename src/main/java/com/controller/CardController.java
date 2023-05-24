package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.CardDTO;
import com.entity.Card;
import com.mapper.CardMapper;
import com.service.CardService;

@RestController
@RequestMapping("/card")
public class CardController {
	
	@Autowired
	CardService cardService;
	
	@Autowired
	CardMapper cardMapper;
	
	@GetMapping("/{id}")
	public Card getCard(Model model, @PathVariable Integer id) {
		return cardService.getCard(id);
	}
	
	@PutMapping
	public void editCard(@RequestBody CardDTO cardDto) {
		cardService.addCard(cardMapper.toCard(cardDto));
	}
	
	@DeleteMapping
	public void removeCard(@RequestBody CardDTO cardDto) {
		cardService.deleteCard(cardMapper.toCard(cardDto));
	}
	
	@PostMapping
	public void addCard(@RequestBody CardDTO cardDto) {
		cardService.addCard(cardMapper.toCard(cardDto));
	}
	
	@PostMapping("/to_sell")
	public String getAllCardsToSell(Model model) {
		return "to_sell";
	}
	
	@GetMapping("/all")
	public List<Card> getAllCards() {
		return cardService.getAllCards();
	}

}
