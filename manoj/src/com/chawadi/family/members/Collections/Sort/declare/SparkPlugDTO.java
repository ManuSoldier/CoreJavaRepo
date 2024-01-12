package com.chawadi.family.members.Collections.Sort.declare;

public class SparkPlugDTO {


    private String ShopName;

    private int quntity;

    private double cost;

    private String quality;

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public void setQuntity(int quntity) {
        this.quntity = quntity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }


    public String getShopName() {
        return ShopName;
    }

    public int getQuntity() {
        return quntity;
    }

    public double getCost() {
        return cost;
    }

    public String getQuality() {
        return quality;
    }

    @Override
    public String toString() {
        return "SparkPlugDTO{" +
                "ShopName='" + ShopName + '\'' +
                ", quntity=" + quntity +
                ", cost=" + cost +
                ", quality='" + quality + '\'' +
                '}';
    }

    public SparkPlugDTO(String shopName, int quntity, double cost, String quality) {
        ShopName = shopName;
        this.quntity = quntity;
        this.cost = cost;
        this.quality = quality;
    }
}
