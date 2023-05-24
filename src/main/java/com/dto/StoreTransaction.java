package com.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StoreTransaction {
    private Integer id;
    private Integer userId;
    private Integer cardId;
    private TransactionType action;
    private LocalDateTime date;
}
