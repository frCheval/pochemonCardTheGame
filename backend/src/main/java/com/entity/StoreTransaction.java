package com.entity;

import java.util.Date;

import com.enums.Action;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class StoreTransaction {

	@Id
	@GeneratedValue
	Integer id;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
	User user;

	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cardId")
	Card card;

	Action action;
	
	Date timeSt;
	
}
