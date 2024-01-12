package com.chawadi.family.members.Collections.Sort.declare;

public class BeltDTO {

    private String Type;

    private int quantity;

    private double cost;

    private String quality;

    public void setType(String type) {
        Type = type;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return Type;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    public String getQuality() {
        return quality;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "BeltDTO{" +
                "Type='" + Type + '\'' +
                ", quantity=" + quantity +
                ", cost=" + cost +
                ", quality='" + quality + '\'' +
                '}';
    }


    public BeltDTO(String type, int quantity, double cost, String quality) {
        Type = type;
        this.quantity = quantity;
        this.cost = cost;
        this.quality = quality;
    }
}
