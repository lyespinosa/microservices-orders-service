package com.soa.ordersservice.infrastructure.entities;

import com.soa.ordersservice.domain.models.Order;
import com.soa.ordersservice.domain.models.OrderStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal total;

    private LocalDateTime date;

    private OrderStatus status;

    public OrderEntity() {}

    public OrderEntity(Long id, BigDecimal total, LocalDateTime date, OrderStatus status) {
        this.id = id;
        this.total = total;
        this.date = date;
        this.status = status;
    }

    public static OrderEntity fromDomainModel(Order order) {
        return new OrderEntity(order.getId(), order.getTotal(), order.getDate(), order.getStatus());
    }

    public Order toDomainModel() {
        return new Order(id, total, date);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
