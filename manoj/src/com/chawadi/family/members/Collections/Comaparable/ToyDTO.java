package com.chawadi.family.members.Collections.Comaparable;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.*;
public class ToyDTO implements Comparable<ToyDTO>{

    private String name;
    private int quantity;

    private double cost;

    private String type;

    private String quality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }


    @Override
    public String toString() {
        return "ToyDTO{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", cost=" + cost +
                ", type='" + type + '\'' +
                ", quality='" + quality + '\'' +
                '}';
    }

    public ToyDTO(String name, int quantity, double cost, String type, String quality) {
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.type = type;
        this.quality = quality;
    }

    @Override
    public int compareTo(ToyDTO o)
    {
        return 0;
    }
}
