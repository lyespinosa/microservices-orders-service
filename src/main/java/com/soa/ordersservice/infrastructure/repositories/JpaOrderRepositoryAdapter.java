package com.soa.ordersservice.infrastructure.repositories;

import com.soa.ordersservice.domain.models.Order;
import com.soa.ordersservice.domain.ports.out.IOrderRepositoryPort;
import com.soa.ordersservice.domain.dtos.UpdateOrderStatusRequest;
import com.soa.ordersservice.infrastructure.entities.OrderEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JpaOrderRepositoryAdapter implements IOrderRepositoryPort {

    private final IJpaOrderRepository jpaOrderRepository;

    public JpaOrderRepositoryAdapter(IJpaOrderRepository jpaOrderRepository) {
        this.jpaOrderRepository = jpaOrderRepository;
    }

    @Override
    public Order save(Order order) {
        OrderEntity orderEntity = OrderEntity.fromDomainModel(order);
        OrderEntity savedOrder = jpaOrderRepository.save(orderEntity);
        return savedOrder.toDomainModel();
    }

    @Override
    public Optional<Order> findById(Long id) {
        return jpaOrderRepository.findById(id).map(OrderEntity::toDomainModel);
    }

    @Override
    public List<Order> findAll() {
        return jpaOrderRepository.findAll().stream().map(OrderEntity::toDomainModel).toList();
    }

    @Override
    public Optional<Order> updateOrderStatus(Long id, UpdateOrderStatusRequest request) {
            Optional<OrderEntity> optionalOrderEntity = jpaOrderRepository.findById(id);
            if (optionalOrderEntity.isPresent()) {
                OrderEntity orderEntity = optionalOrderEntity.get();
                orderEntity.setStatus(request.getStatus());
                OrderEntity savedOrder = jpaOrderRepository.save(orderEntity);
                return Optional.of(savedOrder.toDomainModel());
            }
            return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaOrderRepository.existsById(id)) {
            jpaOrderRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
