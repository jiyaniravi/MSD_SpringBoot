package com.af.msd.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;

public class Order implements Serializable {

    protected static final long serialVersionUID = 90130107005L;

    private int orderId;
    private String userName;
    private int userId;
    private Timestamp orderDate;
    private byte orderStatus;
    private Timestamp pickupDate;
    private Timestamp deliveryDate;
    private String courierUid;
    private float height;
    private float width;
    private float depth;
    private float weight;
    private int uniqueToken;
    private String description;
    private Timestamp canceledDate;

    public int getOrderId() {
        return orderId;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserId() {
        return userId;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public byte getOrderStatus() {
        return orderStatus;
    }

    public Timestamp getPickupDate() {
        return pickupDate;
    }

    public Timestamp getDeliveryDate() {
        return deliveryDate;
    }

    public String getCourierUid() {
        return courierUid;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public float getDepth() {
        return depth;
    }

    public float getWeight() {
        return weight;
    }

    public int getUniqueToken() {
        return uniqueToken;
    }

    public String getDescription() {
        return description;
    }

    public Timestamp getCanceledDate() {
        return canceledDate;
    }

    public Order withOrderId(int orderId) {
        this.orderId = orderId;
        return this;
    }

    public Order withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public Order withUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public Order withOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    public Order withOrderStatus(byte orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    public Order withPickupDate(Timestamp pickupDate) {
        this.pickupDate = pickupDate;
        return this;
    }

    public Order withDeliveryDate(Timestamp deliveryDate) {
        this.deliveryDate = deliveryDate;
        return this;
    }

    public Order withCourierUid(String courierUid) {
        this.courierUid = courierUid;
        return this;
    }

    public Order withHeight(float height) {
        this.height = height;
        return this;
    }

    public Order withWidth(float width) {
        this.width = width;
        return this;
    }

    public Order withDepth(float depth) {
        this.depth = depth;
        return this;
    }

    public Order withWeight(float weight) {
        this.weight = weight;
        return this;
    }

    public Order withUniqueToken(int uniqueToken) {
        this.uniqueToken = uniqueToken;
        return this;
    }

    public Order withDescription(String description) {
        this.description = description;
        return this;
    }

    public Order withCanceledDate(Timestamp canceledDate) {
        this.canceledDate = canceledDate;
        return this;
    }

    public Order build(){
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return getOrderId() == order.getOrderId() &&
                getUserId() == order.getUserId() &&
                getOrderStatus() == order.getOrderStatus() &&
                getUniqueToken() == order.getUniqueToken() &&
                getOrderDate().equals(order.getOrderDate()) &&
                getPickupDate().equals(order.getPickupDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderId(), getUserId(), getOrderDate(), getOrderStatus(), getPickupDate(), getUniqueToken());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Order.class.getSimpleName() + "[", "]")
                .add("orderId=" + orderId)
                .add("userName='" + userName + "'")
                .add("userId=" + userId)
                .add("orderDate=" + orderDate)
                .add("orderStatus=" + orderStatus)
                .add("pickupDate=" + pickupDate)
                .add("deliveryDate=" + deliveryDate)
                .add("courierUid='" + courierUid + "'")
                .add("height=" + height)
                .add("width=" + width)
                .add("depth=" + depth)
                .add("weight=" + weight)
                .add("uniqueToken=" + uniqueToken)
                .add("description='" + description + "'")
                .add("canceledDate=" + canceledDate)
                .toString();
    }
}
