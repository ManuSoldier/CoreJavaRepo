package com.chawadi.family.members.Collections.LamdaExpression;

public class GeyserDTO {

    private String brand;

    private int quantity;


    private double cost;

    private String shopName;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Override
    public String toString() {
        return "geyserDTO{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", cost=" + cost +
                ", shopName='" + shopName + '\'' +
                '}';
    }

    public GeyserDTO(String brand, int quantity, double cost, String shopName) {
        this.brand = brand;
        this.quantity = quantity;
        this.cost = cost;
        this.shopName = shopName;
    }
}
