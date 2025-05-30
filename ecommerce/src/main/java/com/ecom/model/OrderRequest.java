package com.ecom.model;

import java.util.Map;

public class OrderRequest {
    private Map<Long,Integer> productQuantity;
    private double totalAmount;

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Map<Long, Integer> getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Map<Long, Integer> productQuantity) {
        this.productQuantity = productQuantity;
    }
}
