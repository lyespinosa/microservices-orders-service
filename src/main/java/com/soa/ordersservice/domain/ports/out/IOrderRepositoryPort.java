package com.soa.ordersservice.domain.ports.out;

import com.soa.ordersservice.domain.dtos.UpdateOrderStatusRequest;
import com.soa.ordersservice.domain.models.Order;
import com.soa.ordersservice.domain.models.OrderStatus;

import java.util.List;
import java.util.Optional;

public interface IOrderRepositoryPort {
    Order save(Order order);
    Optional<Order> findById(Long id);
    List<Order> findAll();
    Optional<Order> updateOrderStatus(Long id, UpdateOrderStatusRequest status);
    boolean deleteById(Long id);
}
