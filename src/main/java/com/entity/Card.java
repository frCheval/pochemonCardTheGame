package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Card {
	
	@Id
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
	
	Float price;
	
	Integer userId;
	
}
