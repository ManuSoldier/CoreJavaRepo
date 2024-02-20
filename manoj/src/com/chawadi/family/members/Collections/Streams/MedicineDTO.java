package com.chawadi.family.members.Collections.Streams;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;

public class MedicineDTO implements Serializable,Comparable<MedicineDTO> {

    private String name;

    private int id;
    private String company;
    private LocalDate expiryDate;
    private LocalDate manfDate;
    private double cost;
    private String[] indgredient;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public LocalDate getManfDate() {
        return manfDate;
    }

    public void setManfDate(LocalDate manfDate) {
        this.manfDate = manfDate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String[] getIndgredient() {
        return indgredient;
    }

    public void setIndgredient(String[] indgredient) {
        this.indgredient = indgredient;
    }


    @Override
    public String toString() {
        return "MedicineDTO{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", company='" + company + '\'' +
                ", expiryDate=" + expiryDate +
                ", manfDate=" + manfDate +
                ", cost=" + cost +
                ", indgredient=" + Arrays.toString(indgredient) +
                '}';
    }

    public MedicineDTO(String name, int id, String company, LocalDate expiryDate, LocalDate manfDate, double cost, String[] indgredient) {
        this.name = name;
        this.id = id;
        this.company = company;
        this.expiryDate = expiryDate;
        this.manfDate = manfDate;
        this.cost = cost;
        this.indgredient = indgredient;
    }

    @Override
    public int compareTo(MedicineDTO o) {
        return this.company.compareTo(o.getCompany());
    }
}
