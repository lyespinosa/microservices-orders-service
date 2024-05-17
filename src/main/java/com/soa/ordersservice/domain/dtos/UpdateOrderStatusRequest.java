package com.soa.ordersservice.domain.dtos;

import com.soa.ordersservice.domain.models.OrderStatus;

public class UpdateOrderStatusRequest {
    private OrderStatus status;

    public OrderStatus getStatus() {
        return status;
    }
}
