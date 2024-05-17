package com.soa.ordersservice.application.usecases;

import com.soa.ordersservice.domain.models.Order;
import com.soa.ordersservice.domain.ports.in.IGetOrderUseCase;
import com.soa.ordersservice.domain.ports.out.IOrderRepositoryPort;

import java.util.Optional;

public class GetOrderUseCaseImpl implements IGetOrderUseCase {

    private final IOrderRepositoryPort orderRepositoryPort;

    public GetOrderUseCaseImpl(IOrderRepositoryPort orderRepositoryPort) {
        this.orderRepositoryPort = orderRepositoryPort;
    }

    @Override
    public Optional<Order> getOrderById(Long id) {
        return orderRepositoryPort.findById(id);
    }
}
