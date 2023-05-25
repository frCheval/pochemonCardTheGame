package com.service;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Card;
import com.entity.StoreOrder;
import com.entity.StoreTransaction;
import com.entity.User;
import com.enums.Action;
import com.repository.StoreOrderRepository;
import com.repository.StoreTransactionRepository;

@Service
public class StoreService {

	@Autowired
	StoreTransactionRepository storeTransactionRepository;
	
	@Autowired
	StoreOrderRepository storeOrderRepository;
	
	public List<StoreTransaction> getAllStoreTransaction() {
		return storeTransactionRepository.findAll();
	}
	
	public void sellCard(StoreOrder storeOrder) {
		if(storeOrder.getPrice() < 0f) {
			storeOrder.setPrice(0f);
		}
		storeOrderRepository.save(storeOrder);
	}
	
	public boolean buyCard(StoreOrder storeOrder) {
		User sellerUser = storeOrderRepository.findByCardId(storeOrder.getCard().getId()).getUser();
		
		if(storeOrder.getUser().getAccount() < storeOrder.getPrice()) {
			return false;
		}
		
		StoreTransaction sellerStoreTransaction = createStoreTransaction(sellerUser,storeOrder.getCard(),Action.SELL);
		StoreTransaction buyerStoreTransaction = createStoreTransaction(storeOrder.getUser(), storeOrder.getCard(), Action.BUY);
			
		storeTransactionRepository.save(sellerStoreTransaction);
		storeTransactionRepository.save(buyerStoreTransaction);
			
		storeOrderRepository.delete(storeOrder);
		return true;
		
	}
	
	private StoreTransaction createStoreTransaction(User user, Card card, Action action) {
		StoreTransaction newStoreTransaction = new StoreTransaction();
		
		newStoreTransaction.setCard(card);
		newStoreTransaction.setTimeSt(Date.from(Instant.now()));
		newStoreTransaction.setUser(user);
		newStoreTransaction.setAction(action);
		
		return newStoreTransaction;
	}
	
}
