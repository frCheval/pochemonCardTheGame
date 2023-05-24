package com.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.dto.StoreTransactionDTO;
import com.entity.StoreTransaction;

@Mapper(componentModel = "spring")
public interface StoreTransactionMapper {
	public StoreTransactionDTO toStoreTransactionDTO(StoreTransaction StoreTransaction);
	public StoreTransaction toStoreTransaction(StoreTransactionDTO StoreTransactionDTO);
	public List<StoreTransactionDTO> toListStoreTransactionDTO(List<StoreTransaction> StoreTransaction);
}
