package com.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	String name;
	
	String description;
	
	String family;
	
	String affinity;
	
	String imgUrl;
	
	String smallImgUrl;
	
	Float energy;
	
	Float hp;
	
	Float defence;
	
	Float attack;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	User user;
	
	@OneToMany(mappedBy = "card")
    List<StoreOrder> storeOrder;
	
	@OneToMany(mappedBy = "card")
    List<StoreTransaction> storeTransaction;
	
}
