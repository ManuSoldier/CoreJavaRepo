package com.chawadi.family.members.Collections.Sort.declare;

public class CharcholDTO {

    private String company;

    private int quantity;

    private double cost;

    private String quality;

    public String getCompany() {
        return company;
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

    public void setCompany(String company) {
        this.company = company;


    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "CharcholDTO{" +
                "company='" + company + '\'' +
                ", quantity=" + quantity +
                ", cost=" + cost +
                ", quality='" + quality + '\'' +
                '}';
    }

    public CharcholDTO(String company, int quantity, double cost, String quality) {
        this.company = company;
        this.quantity = quantity;
        this.cost = cost;
        this.quality = quality;
    }
}
