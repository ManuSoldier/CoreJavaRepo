package com.chawadi.family.members.Collections.LamdaExpression.LamdaRunner;

import com.chawadi.family.members.Collections.LamdaExpression.DiseaseDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiseaseDTORunner {

    public static void main(String[] args) {

        DiseaseDTO diseaseDTO1=new DiseaseDTO("Cancer", "bleeding or bruising", "EBV", 12);
        DiseaseDTO diseaseDTO2=new DiseaseDTO("covid-19", "fever,Cough", "Corona VIRUS", 30);
        DiseaseDTO diseaseDTO3=new DiseaseDTO("Dengue", "body pain, fever", "DENV", 15);
        DiseaseDTO diseaseDTO4=new DiseaseDTO("maleria", "fever", "Parasites", 7);
        DiseaseDTO diseaseDTO5=new DiseaseDTO("ebola", "aches, pains,headache and muscle", "EVD", 25);

        List<DiseaseDTO> list=new ArrayList<>();
        Collections.sort(list);
        list.add(diseaseDTO1);
        list.add(diseaseDTO1);
        list.add(diseaseDTO3);
        list.add(diseaseDTO4);
        list.add(diseaseDTO5);

        System.out.println("Sorting ascending ordere by Disease Name ");
        Collections.sort(list);
        list.forEach(l->System.out.println(l));

        System.out.println("Sorting descending ordere by Disease Name ");
        Collections.sort(list, (n1,n2)->n2.getName().compareTo(n1.getName()));
        list.forEach(l->System.out.println(l));

        System.out.println("Sorting ascending ordere by symptoms");
        Collections.sort(list,(s1,s2)->s1.getSymptoms().compareTo(s2.getSymptoms()));
        list.forEach(l->System.out.println(l));

        System.out.println("Sorting decending ordere by symptoms");
        Collections.sort(list,(s1,s2)->s2.getSymptoms().compareTo(s1.getSymptoms()));
        list.forEach(l->System.out.println(l));

        System.out.println("Sorting ascending ordere by virus");
        Collections.sort(list,(s1,s2)->s1.getVirus().compareTo(s2.getVirus()));
        list.forEach(l->System.out.println(l));

        System.out.println("Sorting decending ordere by virus");
        Collections.sort(list,(s1,s2)->s2.getVirus().compareTo(s1.getVirus()));
        list.forEach(l->System.out.println(l));

    }

}
