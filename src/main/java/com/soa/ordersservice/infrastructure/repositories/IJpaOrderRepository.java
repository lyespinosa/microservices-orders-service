package com.soa.ordersservice.infrastructure.repositories;

import com.soa.ordersservice.infrastructure.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJpaOrderRepository extends JpaRepository<OrderEntity, Long> {


}
