package com.chawadi.family.members.Collections.LamdaExpression;

public class ThermoMetreDTO {


    private String use;

    private int quantity;

    private double temprature;

    private String DocterName;

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTemprature() {
        return temprature;
    }

    public void setTemprature(double temprature) {
        this.temprature = temprature;
    }

    public String getDocterName() {
        return DocterName;
    }

    public void setDocterName(String docterName) {
        DocterName = docterName;
    }

    @Override
    public String toString() {
        return "ThermoMetreDTO{" +
                "use='" + use + '\'' +
                ", quantity=" + quantity +
                ", temprature=" + temprature +
                ", DocterName='" + DocterName + '\'' +
                '}';
    }

    public ThermoMetreDTO(String use, int quantity, double temprature, String docterName) {
        this.use = use;
        this.quantity = quantity;
        this.temprature = temprature;
        DocterName = docterName;
    }
}




