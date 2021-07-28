package com.dtcc.consumer.model;

public class OrderRequest {
    private Integer orderId;
    private String paymentType;
    private Integer totalPrice;
    private Integer discount;

    public OrderRequest() {
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "orderId=" + orderId +
                ", paymentType='" + paymentType + '\'' +
                ", totalPrice=" + totalPrice +
                ", discount=" + discount +
                '}';
    }
}
