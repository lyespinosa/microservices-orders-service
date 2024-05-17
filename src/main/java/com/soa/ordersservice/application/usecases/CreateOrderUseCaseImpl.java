package com.soa.ordersservice.application.usecases;

import com.soa.ordersservice.domain.models.Order;
import com.soa.ordersservice.domain.ports.in.ICreateOrderUseCase;
import com.soa.ordersservice.domain.ports.out.IOrderRepositoryPort;

public class CreateOrderUseCaseImpl implements ICreateOrderUseCase {

    private final IOrderRepositoryPort orderRepositoryPort;

    public CreateOrderUseCaseImpl(IOrderRepositoryPort orderRepositoryPort) {
        this.orderRepositoryPort = orderRepositoryPort;
    }

    @Override
    public Order createOrder(Order order) {
        return orderRepositoryPort.save(order);
    }
}
