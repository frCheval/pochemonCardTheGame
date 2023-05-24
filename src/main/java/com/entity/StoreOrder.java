package com.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class StoreOrder {

	@Id
	@GeneratedValue
	Integer id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	User user;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cardId")
	Card card;
	
	Float price;
}
