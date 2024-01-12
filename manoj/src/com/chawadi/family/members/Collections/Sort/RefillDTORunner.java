package com.chawadi.family.members.Collections.Sort;

import com.chawadi.family.members.Collections.Sort.declare.RefillDTO;
import com.chawadi.family.members.Collections.Sort.declare.SpeakerDTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RefillDTORunner implements Serializable {

    public static void main(String[] args) {

        RefillDTO refillDTO= new RefillDTO("Brite", 2, 44.00, "bad");
        RefillDTO refillDTO1= new RefillDTO("Ronads", 9, 39.00, "good");
        RefillDTO refillDTO2= new RefillDTO("pinpint", 3, 65.00, "bood");
        RefillDTO refillDTO3= new RefillDTO("Writometer", 8, 11.00, "bad");


        List<RefillDTO> list = new ArrayList<>();
        list.add(refillDTO);
        list.add(refillDTO1);
        list.add(refillDTO2);
        list.add(refillDTO3);


        System.out.println("Acsending order based on Type");
        Comparator<RefillDTO> comparator1 = new RefillDTOCompanyAsc();
        Collections.sort(list, comparator1);
        for (RefillDTO Company : list) {
            System.out.println(Company);
        }

        System.out.println("Acsending order based on Cost");
        Comparator<RefillDTO> comparator2 = new RefillDTOCostAsc();
        Collections.sort(list, comparator2);
        for (RefillDTO Cost : list) {
            System.out.println(Cost);
        }


        System.out.println("Acsending order based on quantity");
        Comparator<RefillDTO> comparator3 = new RefillDTOQunatityAsc();
        Collections.sort(list, comparator3);
        for (RefillDTO quantity : list) {
            System.out.println(quantity);
        }


        System.out.println("Acsending order based on quality");
        Comparator<RefillDTO> comparator4 = new RefillDTOQualityAesc();
        Collections.sort(list, comparator4);
        for (RefillDTO quality : list) {
            System.out.println(quality);
        }


        System.out.println("*******************************************************");
        System.out.println("Starting the decending Order");
        System.out.println("*******************************************************");

        System.out.println("Descending order based on type");
        Comparator<RefillDTO> comparator5 = new RefillDTOCompanyDsce();
        Collections.sort(list, comparator5);
        for (RefillDTO Type : list) {
            System.out.println(Type);
        }


        System.out.println("Descending order based on cost");
        Comparator<RefillDTO> comparator6 = new RefillDTOCostDesc();
        Collections.sort(list, comparator6);
        for (RefillDTO cost : list) {
            System.out.println(cost);
        }


        System.out.println("Descending order based on quantity");
        Comparator<RefillDTO> comparator7 = new RefillDTOQunatityDesc();
        Collections.sort(list, comparator7);
        for (RefillDTO quantity : list) {
            System.out.println(quantity);
        }


        System.out.println("Descending order based on quality");
        Comparator<RefillDTO> comparator8 = new RefillDTOQualityDsce();
        Collections.sort(list, comparator8);
        for (RefillDTO quality : list) {
            System.out.println(quality);
        }
    }
}

