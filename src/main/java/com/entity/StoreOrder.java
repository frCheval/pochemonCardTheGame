package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class StoreOrder {
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
	Integer userId;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cardId")
	Integer cardId;

}
