package com.chawadi.family.members.Collections.LamdaExpression;


import java.io.Serializable;


public class WatchDTO implements Serializable,Comparable<WatchDTO> {



    private String company;
    private double cost;

    private String shopName;

    private String location;


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public WatchDTO(String company, double cost, String shopName, String location) {
        this.company = company;
        this.cost = cost;
        this.shopName = shopName;
        this.location = location;
    }

    @Override
    public String toString() {
        return "WatchDTO{" +
                "company='" + company + '\'' +
                ", cost=" + cost +
                ", shopName='" + shopName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public int compareTo(WatchDTO o) {
        return this.company.compareTo(o.getCompany());
    }
}
