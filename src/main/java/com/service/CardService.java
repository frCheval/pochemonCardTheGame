package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Card;
import com.repository.CardRepository;

@Service
public class CardService {
	
	@Autowired
	CardRepository cardRepository;

	public void addCard(Card card) {	
		cardRepository.save(card);	
	}
	
	
	public void deleteCard(Card card) {
		cardRepository.delete(card);
	}
	
	public Card getCard(Integer cardId) {
		return cardRepository.findById(cardId).orElse(null);
	}
	
	public List<Card> getAllCards() {
		return cardRepository.findAll();
	}
}
