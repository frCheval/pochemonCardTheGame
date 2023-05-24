package com.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class StoreOrder {
	
	Integer userId;
	
	Integer cardId;

}
