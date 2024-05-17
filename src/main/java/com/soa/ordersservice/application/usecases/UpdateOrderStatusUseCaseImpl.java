package com.soa.ordersservice.application.usecases;

import com.soa.ordersservice.domain.dtos.UpdateOrderStatusRequest;
import com.soa.ordersservice.domain.models.Order;
import com.soa.ordersservice.domain.models.OrderStatus;
import com.soa.ordersservice.domain.ports.in.IUpdateOrderStatusUseCase;
import com.soa.ordersservice.domain.ports.out.IOrderRepositoryPort;

import java.util.Optional;

public class UpdateOrderStatusUseCaseImpl implements IUpdateOrderStatusUseCase {

    private final IOrderRepositoryPort orderRepositoryPort;

    public UpdateOrderStatusUseCaseImpl(IOrderRepositoryPort orderRepositoryPort) {
        this.orderRepositoryPort = orderRepositoryPort;
    }

    @Override
    public Optional<Order> updateOrderStatus(Long id, UpdateOrderStatusRequest status) {
        return orderRepositoryPort.updateOrderStatus(id, status);
    }
}
