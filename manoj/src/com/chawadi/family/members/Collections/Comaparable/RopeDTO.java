package com.chawadi.family.members.Collections.Comaparable;

import java.awt.*;

public class RopeDTO implements Comparable<RopeDTO>{

    private String type;

    private int length;

    private String quality;

    private double cost;

    private int quantity;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "RopeDTO{" +
                "type='" + type + '\'' +
                ", length=" + length +
                ", quality='" + quality + '\'' +
                ", cost=" + cost +
                ", quantity=" + quantity +
                '}';
    }

    public RopeDTO(String type, int length, String quality, double cost, int quantity) {
        this.type = type;
        this.length = length;
        this.quality = quality;
        this.cost = cost;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(RopeDTO o) {
        return 0;
    }
}
