package com;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.entity.Card;
import com.entity.User;
import com.mapper.UserMapper;
import com.service.CardService;
import com.service.UserService;

@SpringBootApplication
public class SpWebAppStep1Application {

	@Autowired
	CardService cardService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserMapper userMapper;
	
	public static void main(String[] args) {
		SpringApplication.run(SpWebAppStep1Application.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() throws InterruptedException, IOException {
		
		User user = new User();
		
		user.setId(1);
		user.setAccount(10000f);
		userService.addUser(userMapper.toUserDTO(user));
		
		User user2 = new User();
		
		user2.setId(2);
		user2.setAccount(10000f);
		userService.addUser(userMapper.toUserDTO(user2));

        Card card = new Card();
        
        card.setId(1);
        card.setName("Pochemon");

        cardService.addCard(card);
        
        ArrayList<Card> cardList = (ArrayList<Card>) cardService.getAllCards();
        
        System.out.println(cardList.size());
    }

}
