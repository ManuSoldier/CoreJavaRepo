package com.chawadi.family.members.Collections.Sort.declare;


import java.io.Serializable;
import java.lang.reflect.Type;

public class PaperDTO implements Serializable {

    private String Type;

    private double cost;
    private int quantity;

    private String quality;

    public PaperDTO(String type, double cost, int quantity, String quality) {
        Type = type;
        this.cost = cost;
        this.quantity = quantity;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "PaperDTO{" +
                "Type='" + Type + '\'' +
                ", cost=" + cost +
                ", quantity=" + quantity +
                ", quality=" + quality +
                '}';
    }

    public void setType(String type) {
        Type = type;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getType() {
        return Type;
    }

    public double getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getQuality() {

        return quality;
    }
}
