package com.soa.ordersservice.application.usecases;

import com.soa.ordersservice.domain.models.Order;
import com.soa.ordersservice.domain.ports.in.IGetAllOrdersUseCase;
import com.soa.ordersservice.domain.ports.out.IOrderRepositoryPort;

import java.util.List;

public class GetAllOrdersUseCaseImpl implements IGetAllOrdersUseCase {

    private final IOrderRepositoryPort orderRepositoryPort;

    public GetAllOrdersUseCaseImpl(IOrderRepositoryPort orderRepositoryPort) {
        this.orderRepositoryPort = orderRepositoryPort;
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepositoryPort.findAll();
    }
}
