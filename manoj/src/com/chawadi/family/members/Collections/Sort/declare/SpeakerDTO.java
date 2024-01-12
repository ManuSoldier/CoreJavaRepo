package com.chawadi.family.members.Collections.Sort.declare;

import java.io.Serializable;

public class SpeakerDTO implements Serializable {

    private String company;

    private int quatity;

    private double cost;

    private String quality;

    public SpeakerDTO(String company, int quatity, double cost, String quality) {
        this.company = company;
        this.quatity = quatity;
        this.cost = cost;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "SpeakerDTO{" +
                "company='" + company + '\'' +
                ", quatity=" + quatity +
                ", cost=" + cost +
                ", quality='" + quality + '\'' +
                '}';
    }

    public String getCompany() {
        return company;
    }

    public int getQuatity() {
        return quatity;
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

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
