package com.soa.ordersservice.domain.ports.in;

import com.soa.ordersservice.domain.models.Order;

import java.util.List;

public interface IGetAllOrdersUseCase {
    List<Order> getAllOrders();
}
