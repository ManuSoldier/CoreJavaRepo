package com.chawadi.family.members.Collections.LamdaExpression;

public class VentilatorDTO {

    private String HospitalName;

    private int quantity;

    private double cost;

    private String place;

    public void setHospitalName(String hospitalName) {
        HospitalName = hospitalName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setPlace(String place) {
        this.place = place;
    }


    public String getHospitalName() {
        return HospitalName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    public String getPlace() {
        return place;
    }


    @Override
    public String toString() {
        return "VentilatorDTO{" +
                "HospitalName='" + HospitalName + '\'' +
                ", quantity=" + quantity +
                ", cost=" + cost +
                ", place='" + place + '\'' +
                '}';
    }


    public VentilatorDTO(String hospitalName, int quantity, double cost, String place) {
        HospitalName = hospitalName;
        this.quantity = quantity;
        this.cost = cost;
        this.place = place;
    }
}
