package com.dto;

import com.entity.Card;
import com.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StoreOrderDTO {
	Integer id;
	User user;
	Card card;
	Float price;
}
