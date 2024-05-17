package com.soa.ordersservice.application.services;

import com.soa.ordersservice.domain.dtos.UpdateOrderStatusRequest;
import com.soa.ordersservice.domain.models.Order;
import com.soa.ordersservice.domain.models.OrderStatus;
import com.soa.ordersservice.domain.ports.in.*;

import java.util.List;
import java.util.Optional;

public class OrderService implements ICreateOrderUseCase, IDeleteUseCase, IGetOrderUseCase, IGetAllOrdersUseCase, IUpdateOrderStatusUseCase {

    private final ICreateOrderUseCase createOrderUseCase;
    private final IDeleteUseCase deleteUseCase;
    private final IGetOrderUseCase getOrderUseCase;
    private final IGetAllOrdersUseCase getAllOrdersUseCase;
    private final IUpdateOrderStatusUseCase updateOrderStatusUseCase;

    public OrderService(ICreateOrderUseCase createOrderUseCase, IDeleteUseCase deleteUseCase, IGetOrderUseCase getOrderUseCase, IGetAllOrdersUseCase getAllOrdersUseCase, IUpdateOrderStatusUseCase updateOrderStatusUseCase) {
        this.createOrderUseCase = createOrderUseCase;
        this.deleteUseCase = deleteUseCase;
        this.getOrderUseCase = getOrderUseCase;
        this.getAllOrdersUseCase = getAllOrdersUseCase;
        this.updateOrderStatusUseCase = updateOrderStatusUseCase;
    }


    @Override
    public Order createOrder(Order order) {
        return createOrderUseCase.createOrder(order);
    }

    @Override
    public boolean deleteOrder(Long id) {
        return deleteUseCase.deleteOrder(id);
    }

    @Override
    public List<Order> getAllOrders() {
        return getAllOrdersUseCase.getAllOrders();
    }

    @Override
    public Optional<Order> getOrderById(Long id) {
        return getOrderUseCase.getOrderById(id);
    }

    @Override
    public Optional<Order> updateOrderStatus(Long id, UpdateOrderStatusRequest status) {
        return updateOrderStatusUseCase.updateOrderStatus(id, status);
    }
}
