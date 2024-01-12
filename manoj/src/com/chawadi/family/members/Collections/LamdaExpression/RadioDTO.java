package com.chawadi.family.members.Collections.LamdaExpression;

public class RadioDTO {


    private  String brand;

    private int warrenty;

    private double cost;

    private String ShopName;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrenty() {
        return warrenty;
    }

    public void setWarrenty(int warrenty) {
        this.warrenty = warrenty;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    @Override
    public String toString() {
        return "RadioDTO{" +
                "brand='" + brand + '\'' +
                ", warrenty=" + warrenty +
                ", cost=" + cost +
                ", ShopName='" + ShopName + '\'' +
                '}';
    }

    public RadioDTO(String brand, int warrenty, double cost, String shopName) {
        this.brand = brand;
        this.warrenty = warrenty;
        this.cost = cost;
        ShopName = shopName;
    }
}
