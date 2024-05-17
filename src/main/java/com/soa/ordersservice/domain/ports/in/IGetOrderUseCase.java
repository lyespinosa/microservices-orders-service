package com.soa.ordersservice.domain.ports.in;

import com.soa.ordersservice.domain.models.Order;

import java.util.Optional;

public interface IGetOrderUseCase {
    Optional<Order> getOrderById(Long id);
}
