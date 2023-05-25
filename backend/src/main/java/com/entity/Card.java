package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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