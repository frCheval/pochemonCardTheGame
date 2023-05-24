package com.entity;

import java.util.Date;

import com.enums.Action;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class StoreTransaction {

	@Id
	@GeneratedValue
	Integer id;
	
	Integer userId;
	
	Integer cardId;
	
	Action action;
	
	Date timeSt;
	
}
