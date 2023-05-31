package com.controller;

import java.util.List;

import com.entity.Card;
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

		Card card = cardService.getCard(cardDto.getId());

		card.setName(cardDto.getName());
		card.setDescription(cardDto.getDescription());
		card.setFamily(cardDto.getFamily());
		card.setAffinity(cardDto.getAffinity());
		card.setImgUrl(cardDto.getImgUrl());
		card.setSmallImgUrl(cardDto.getSmallImgUrl());
		card.setEnergy(cardDto.getEnergy());
		card.setHp(cardDto.getHp());
		card.setDefence(cardDto.getDefence());
		card.setAttack(cardDto.getAttack());

		return cardService.addCard(card);

		// return cardService.addCard(cardMapper.toCard(cardDto));
	}
	
	@DeleteMapping("/{id}")
	public Boolean removeCard(@PathVariable Integer id) {
		return cardService.deleteCard(id);
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
