package com;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.entity.Card;
import com.service.CardService;

@SpringBootApplication
public class SpWebAppStep1Application {

	@Autowired
	CardService cardService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpWebAppStep1Application.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() throws InterruptedException, IOException {

        Card card = new Card();
        
        card.setId(1);
        card.setName("Pochemon");

        cardService.addCard(card);
        
        ArrayList<Card> cardList = (ArrayList<Card>) cardService.getAllCards();
        
        System.out.println(cardList.get(0).getName());
    }

}
