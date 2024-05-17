package com.soa.ordersservice.infrastructure.entities;

import com.soa.ordersservice.domain.models.OrderProduct;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class OrderProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;

    private BigDecimal price;

    private int quantity;

    public OrderProductEntity() {}

    public OrderProductEntity(Long id, Long productId, BigDecimal price, int quantity) {
        this.id = id;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }

    public OrderProductEntity fromDomainModel(OrderProductEntity orderProductEntity) {
        return new OrderProductEntity(orderProductEntity.getId(), orderProductEntity.getProductId(), orderProductEntity.getPrice(), orderProductEntity.getQuantity());
    }

    public OrderProduct toDomainModel(){
        return new OrderProduct(id, productId, price, quantity);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
