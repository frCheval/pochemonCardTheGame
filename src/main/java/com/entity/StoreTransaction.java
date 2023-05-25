package com.entity;

import java.util.Date;

import com.enums.Action;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class StoreTransaction {

	@Id
	@GeneratedValue
	Integer id;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	User user;

	@ManyToOne
	@JoinColumn(name = "card_id")
	Card card;

	Action action;
	
	Date timeSt;
	
}
