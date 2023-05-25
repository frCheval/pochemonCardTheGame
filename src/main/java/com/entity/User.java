package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name= "users")
public class User {
	
	@Id
	@GeneratedValue
	Integer id;
	
	String login;
	
	String pwd;
	
	Float account;
	
	String lastName;
	
	String firstName;
	
	String email;
	
	List<Integer> cardList;
	
	@OneToMany(mappedBy = "user")
    List<StoreOrder> storeOrder;
	
	@OneToMany(mappedBy = "user")
    List<StoreTransaction> storeTransaction;

}
