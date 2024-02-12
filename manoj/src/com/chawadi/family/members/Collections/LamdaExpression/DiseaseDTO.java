package com.chawadi.family.members.Collections.LamdaExpression;

import java.io.Serializable;

public class DiseaseDTO implements Serializable,Comparable<DiseaseDTO> {

    private String name;
    private String symptoms;
    private String virus;
    private int attcakedDays;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getVirus() {
        return virus;
    }

    public void setVirus(String virus) {
        this.virus = virus;
    }

    public int getAttcakedDays() {
        return attcakedDays;
    }

    public void setAttcakedDays(int attcakedDays) {
        this.attcakedDays = attcakedDays;
    }

    public DiseaseDTO(String name, String symptoms, String virus, int attcakedDays) {
        this.name = name;
        this.symptoms = symptoms;
        this.virus = virus;
        this.attcakedDays = attcakedDays;
    }

    @Override
    public String toString() {
        return "DiseaseDTO{" +
                "name='" + name + '\'' +
                ", symptoms='" + symptoms + '\'' +
                ", virus='" + virus + '\'' +
                ", attcakedDays=" + attcakedDays +
                '}';
    }

    @Override
    public int compareTo(DiseaseDTO o) {
        return this.name.compareTo(o.getName());
    }
}
