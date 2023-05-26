package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.CardDTO;
import com.mapper.CardMapper;
import com.service.CardService;

@RestController
@RequestMapping("/card")
@CrossOrigin
public class CardController {
	
	@Autowired
	CardService cardService;
	
	@Autowired
	CardMapper cardMapper;
	
	@GetMapping("/{id}")
	public CardDTO getCard(@PathVariable Integer id) {
		return cardMapper.toCardDTO(cardService.getCard(id));
	}
	
	@PutMapping
	public Boolean editCard(@RequestBody CardDTO cardDto) {
		return cardService.addCard(cardMapper.toCard(cardDto));
	}
	
	@DeleteMapping
	public Boolean removeCard(@RequestBody CardDTO cardDto) {
		return cardService.deleteCard(cardMapper.toCard(cardDto));
	}
	
	@PostMapping
	public Boolean addCard(@RequestBody CardDTO cardDto) {
		return cardService.addCard(cardMapper.toCard(cardDto));
	}
	
	@GetMapping("/shop")
	public List<CardDTO> getAllCardsToSell() {
		return cardMapper.toCardDTO(cardService.getAllCardsForSale());
	}
	
	@GetMapping("/all")
	public List<CardDTO> getAllCards() {
		return cardMapper.toCardDTO(cardService.getAllCards());
	}

	@GetMapping("/user/{id}")
	public List<CardDTO> getAllCardsByUser(@PathVariable Integer id) {
		return cardMapper.toCardDTO(cardService.getAllCardsByUser(id));
	}

}
