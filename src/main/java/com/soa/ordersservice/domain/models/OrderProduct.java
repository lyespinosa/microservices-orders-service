package com.soa.ordersservice.domain.models;

import java.math.BigDecimal;

public class OrderProduct {

    private Long id;
    private Long productId;
    private BigDecimal price;
    private int quantity;

    public OrderProduct(Long id, Long productId, BigDecimal price, int quantity) {
        this.id = id;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
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
