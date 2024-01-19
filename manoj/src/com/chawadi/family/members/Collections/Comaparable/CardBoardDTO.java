package com.chawadi.family.members.Collections.Comaparable;

public class CardBoardDTO implements Comparable<CardBoardDTO>{


    private String shopName;

    private int quantity;

    private double cost;

    private String quality;

    private String address;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
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

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CardBoardDTO{" +
                "shopName='" + shopName + '\'' +
                ", quantity=" + quantity +
                ", cost=" + cost +
                ", quality='" + quality + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    public CardBoardDTO(String shopName, int quantity, double cost, String quality, String address) {
        this.shopName = shopName;
        this.quantity = quantity;
        this.cost = cost;
        this.quality = quality;
        this.address = address;
    }

    @Override
    public int compareTo(CardBoardDTO o) {
        return 0;
    }
}
