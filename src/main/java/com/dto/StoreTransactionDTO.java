package com.dto;

import java.util.Date;

import com.entity.Card;
import com.entity.User;
import com.enums.Action;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StoreTransactionDTO {
	Integer id;
	User user;
	Card card;
	Action action;
	Date timeSt;
}
