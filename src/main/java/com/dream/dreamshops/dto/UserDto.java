package com.dream.dreamshops.dto;

import com.dream.dreamshops.model.Cart;
import com.dream.dreamshops.model.Order;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<OrderDto> orders;
    private CartDto cart;
}
