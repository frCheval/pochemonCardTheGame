package com.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

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

}
