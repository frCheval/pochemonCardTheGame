package com.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name= "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	String login;
	
	String pwd;
	
	Float account;
	
	String lastName;
	
	String firstName;
	
	String email;
	
	@OneToMany(mappedBy = "user")
	List<Card> cardList;
	
	@OneToMany(mappedBy = "user")
    List<StoreOrder> storeOrder;
	
	@OneToMany(mappedBy = "user")
    List<StoreTransaction> storeTransaction;

}
