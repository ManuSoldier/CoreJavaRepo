package com.chawadi.family.members.Collections.Sort.declare;

public class RefillDTO {


    private String Company;
    private int quantity;

    private double cost;

    private String quality;

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
        this.quality = quality;
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
        return quality;
    }

    @Override
    public String toString() {
        return "RefillDTO{" +
                "Company='" + Company + '\'' +
                ", quantity=" + quantity +
                ", cost=" + cost +
                ", quality='" + quality + '\'' +
                '}';
    }

    public RefillDTO(String company, int quantity, double cost, String quality) {
        Company = company;
        this.quantity = quantity;
        this.cost = cost;
        this.quality = quality;
    }
}
