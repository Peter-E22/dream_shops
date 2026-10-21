package com.dream.dreamshops.service.order;

import com.dream.dreamshops.dto.OrderDto;
import com.dream.dreamshops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}
