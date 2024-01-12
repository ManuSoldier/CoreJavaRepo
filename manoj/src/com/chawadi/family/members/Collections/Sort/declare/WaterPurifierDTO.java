package com.chawadi.family.members.Collections.Sort.declare;

public class WaterPurifierDTO {

    private String Company;

    private int quantity;

    private double cost;

    private String Quality;

    public void setCompany(String company) {
        Company = company;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setQuality(String quality) {
        Quality = quality;
    }

    public String getCompany() {
        return Company;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    public String getQuality() {
        return Quality;
    }

    @Override
    public String toString() {
        return "WaterPurifierDTO{" +
                "Company='" + Company + '\'' +
                ", quantity=" + quantity +
                ", cost=" + cost +
                ", Quality='" + Quality + '\'' +
                '}';
    }

    public WaterPurifierDTO(String company, int quantity, double cost, String quality) {
        Company = company;
        this.quantity = quantity;
        this.cost = cost;
        Quality = quality;
    }
}
