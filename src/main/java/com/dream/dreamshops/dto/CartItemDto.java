package com.dream.dreamshops.dto;

import com.dream.dreamshops.model.Product;

import java.math.BigDecimal;
import java.util.Set;

public class CartItemDto {
    private Long itemId;
    private Integer quantity;
    private BigDecimal unitPrice;
    private Product product;


}
