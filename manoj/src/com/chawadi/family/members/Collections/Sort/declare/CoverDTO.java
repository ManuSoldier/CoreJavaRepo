package com.chawadi.family.members.Collections.Sort.declare;

public class CoverDTO {


    private String type;

    private int quantity;


    private double cost;


    private String Locatioin;

    public void setType(String type) {
        this.type = type;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setLocatioin(String locatioin) {
        Locatioin = locatioin;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    public String getLocatioin() {
        return Locatioin;
    }

    @Override
    public String toString() {
        return "CoverDTO{" +
                "type='" + type + '\'' +
                ", quantity=" + quantity +
                ", cost=" + cost +
                ", Locatioin='" + Locatioin + '\'' +
                '}';
    }

    public CoverDTO(String type, int quantity, double cost, String locatioin) {
        this.type = type;
        this.quantity = quantity;
        this.cost = cost;
        Locatioin = locatioin;
    }
}
