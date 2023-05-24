package com.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.dto.StoreOrderDTO;
import com.entity.StoreOrder;


@Mapper(componentModel = "spring")
public interface StoreOrderMapper {
	public StoreOrderDTO toStoreOrderDTO(StoreOrder storeOrder);
	public StoreOrder toStoreOrder(StoreOrderDTO storeOrderDTO);
	public List<StoreOrderDTO> toListStoreOrderDTO(List<StoreOrder> storeOrder);
}	
