package com.soa.ordersservice.domain.ports.in;

import com.soa.ordersservice.domain.dtos.UpdateOrderStatusRequest;
import com.soa.ordersservice.domain.models.Order;
import com.soa.ordersservice.domain.models.OrderStatus;

import java.util.Optional;

public interface IUpdateOrderStatusUseCase {
    Optional<Order> updateOrderStatus(Long id, UpdateOrderStatusRequest status);
}
