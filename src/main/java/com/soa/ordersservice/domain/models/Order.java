package com.soa.ordersservice.domain.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order {

    private Long id;
    private BigDecimal total;
    private LocalDateTime date;
    private OrderStatus status;

    public Order(Long id, BigDecimal total, LocalDateTime date) {
        this.id = id;
        this.total = total;
        this.date = date;
        this.status = OrderStatus.CREATED;
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
