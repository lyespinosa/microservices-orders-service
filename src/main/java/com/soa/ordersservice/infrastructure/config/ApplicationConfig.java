package com.soa.ordersservice.infrastructure.config;

import com.soa.ordersservice.application.services.OrderService;
import com.soa.ordersservice.application.usecases.*;
import com.soa.ordersservice.domain.ports.out.IOrderRepositoryPort;
import com.soa.ordersservice.infrastructure.repositories.JpaOrderRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public OrderService orderService(IOrderRepositoryPort orderRepositoryPort) {
        return new OrderService(
                new CreateOrderUseCaseImpl(orderRepositoryPort),
                new DeleteUseCaseImpl(orderRepositoryPort),
                new GetOrderUseCaseImpl(orderRepositoryPort),
                new GetAllOrdersUseCaseImpl(orderRepositoryPort),
                new UpdateOrderStatusUseCaseImpl(orderRepositoryPort)
        );
    }

    @Bean public IOrderRepositoryPort orderRepositoryPort(JpaOrderRepositoryAdapter jpaorderRepositoryAdapter) {
        return jpaorderRepositoryAdapter;
    }

}
