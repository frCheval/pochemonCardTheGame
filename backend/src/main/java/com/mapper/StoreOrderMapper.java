package com.mapper;

import java.util.List;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.dto.StoreOrderDTO;
import com.entity.Card;
import com.entity.StoreOrder;
import com.entity.User;
import com.service.CardService;
import com.service.UserService;


@Mapper(componentModel = "spring", uses = { UserMapper.class, UserService.class, CardService.class })
public interface StoreOrderMapper {
	
	@Mapping(target = "userId", source = "user.id")
	@Mapping(target = "cardId", source = "card.id")
	public StoreOrderDTO toStoreOrderDTO(StoreOrder storeOrder);
	
	@Mapping(target = "user", source = "userId")
	@Mapping(target = "card", source = "cardId")
	public StoreOrder toStoreOrder(StoreOrderDTO storeOrderDTO);
	
	@Mapping(target = "userId", source = "user.id")
	@Mapping(target = "cardId", source = "card.id")
	public List<StoreOrderDTO> toListStoreOrderDTO(List<StoreOrder> storeOrder);
	
	
	default User map(Integer userId, @Context UserService userService, @Context UserMapper userMapper) {
	       return userMapper.toUser(userService.getUserById(userId));
	}
	
	default Card map(Integer cardId, @Context CardService cardService) {
	       return cardService.getCard(cardId);
	}

}	
