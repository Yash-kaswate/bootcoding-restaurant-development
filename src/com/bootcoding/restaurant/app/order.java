package com.bootcoding.restaurant.app;

import java.util.Date;
import java.util.List;

public class order {
    private long orderId; // orderNumber
    private double totalAmount;
    private vendor vendor; // Vendor Detail
    private customer customer; // Customer Detail
    private String deliveryAddress;
    private List<orderMenuItem> menuItems;
    private Date orderDate;
    private String orderStatus;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public vendor getVendor() {
        return vendor;
    }

    public void setVendor(vendor vendor) {
        this.vendor = vendor;
    }

    public customer getCustomer() {
        return customer;
    }

    public void setCustomer(customer customer) {
        this.customer = customer;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public List<orderMenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<orderMenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}