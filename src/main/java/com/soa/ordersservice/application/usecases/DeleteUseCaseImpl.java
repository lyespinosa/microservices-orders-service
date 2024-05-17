package com.soa.ordersservice.application.usecases;

import com.soa.ordersservice.domain.ports.in.IDeleteUseCase;
import com.soa.ordersservice.domain.ports.out.IOrderRepositoryPort;

public class DeleteUseCaseImpl implements IDeleteUseCase {

    private final IOrderRepositoryPort orderRepositoryPort;

    public DeleteUseCaseImpl(IOrderRepositoryPort orderRepositoryPort) {
        this.orderRepositoryPort = orderRepositoryPort;
    }

    @Override
    public boolean deleteOrder(Long id) {
        return orderRepositoryPort.deleteById(id);
    }
}
