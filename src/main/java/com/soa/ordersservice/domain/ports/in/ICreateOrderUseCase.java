package com.soa.ordersservice.domain.ports.in;

import com.soa.ordersservice.domain.models.Order;

public interface ICreateOrderUseCase {
    Order createOrder(Order order);
}
