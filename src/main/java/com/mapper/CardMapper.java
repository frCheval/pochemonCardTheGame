package com.mapper;

import org.mapstruct.Mapper;

import com.dto.CardDTO;
import com.entity.Card;

@Mapper(componentModel = "spring")
public interface CardMapper {

	public CardDTO toCardDTO(Card card);
	public Card toCard(CardDTO cardDTO);
}
