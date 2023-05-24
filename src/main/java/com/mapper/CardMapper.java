package com.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.dto.CardDTO;
import com.entity.Card;

@Mapper(componentModel = "spring")
public interface CardMapper {

	public CardDTO toCardDTO(Card card);
	public Card toCard(CardDTO cardDTO);
	
	public List<CardDTO> toCardDTO(List<Card> card);
	public List<Card> toCard(List<CardDTO> cardDTO);
	
}
