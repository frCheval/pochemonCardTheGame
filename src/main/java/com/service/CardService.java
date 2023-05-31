package com.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Card;
import com.entity.StoreOrder;
import com.repository.CardRepository;
import com.repository.StoreOrderRepository;

@Service
public class CardService {
	
	@Autowired
	CardRepository cardRepository;
	
	@Autowired
	StoreOrderRepository storeOrderRepository;

	public Boolean addCard(Card card) {	
		if (card != null) {
			cardRepository.save(card);
			return true;
		}
		return false;
	}
	
	
	public Boolean deleteCard(Integer id) {
		if (id != null) {
			cardRepository.deleteById(id);
			return true;
		}
		return false;
	}
	
	public Card getCard(Integer cardId) {
		return cardRepository.findById(cardId).orElse(null);
	}
	
	public List<Card> getAllCards() {
		return cardRepository.findAll();
	}
	
	public List<Card> getAllCardsForSale() {
		List<StoreOrder> listStoreOrder = storeOrderRepository.findAll();
		return listStoreOrder.stream().map(StoreOrder::getCard).collect(Collectors.toList());
	}

    public List<Card> getAllCardsByUser(Integer id) {
		return cardRepository.findAllByUserId(id);
    }
    
}
