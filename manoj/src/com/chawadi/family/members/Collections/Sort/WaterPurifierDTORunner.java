package com.chawadi.family.members.Collections.Sort;

import com.chawadi.family.members.Collections.Sort.declare.CoverDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WaterPurifierDTORunner {

    public static void main(String[] args) {

        CoverDTO coverDTO = new CoverDTO("Godraj", 3, 3400.00, "bad");
        CoverDTO coverDTO1 = new CoverDTO("7 star", 6, 3900.00, "good");
        CoverDTO coverDTO2= new CoverDTO("philiphs", 1, 3500.00, "good");
        CoverDTO coverDTO3 = new CoverDTO("aqua", 8, 3100.00, "bad");


        List<CoverDTO> list = new ArrayList<>();
        list.add(coverDTO);
        list.add(coverDTO1);
        list.add(coverDTO2);
        list.add(coverDTO3);


        System.out.println("Acsending order based on Type");
        Comparator<CoverDTO> comparator1 = new CoverDTOCompanyAsc();
        Collections.sort(list, comparator1);
        for (CoverDTO Company : list) {
            System.out.println(Company);
        }

        System.out.println("Acsending order based on Cost");
        Comparator<CoverDTO> comparator2 = new CoverDTOCostAsc();
        Collections.sort(list, comparator2);
        for (CoverDTO Cost : list) {
            System.out.println(Cost);
        }


        System.out.println("Acsending order based on quantity");
        Comparator<CoverDTO> comparator3 = new CoverDTOQunatityAsc();
        Collections.sort(list, comparator3);
        for (CoverDTO quantity : list) {
            System.out.println(quantity);
        }


        System.out.println("Acsending order based on quality");
        Comparator<CoverDTO> comparator4 = new CoverDTOQualityAesc();
        Collections.sort(list, comparator4);
        for (CoverDTO quality : list) {
            System.out.println(quality);
        }


        System.out.println("*******************************************************");
        System.out.println("Starting the decending Order");
        System.out.println("*******************************************************");

        System.out.println("Descending order based on type");
        Comparator<CoverDTO> comparator5 = new CoverDTOCompanyDsce();
        Collections.sort(list, comparator5);
        for (CoverDTO Type : list) {
            System.out.println(Type);
        }


        System.out.println("Descending order based on cost");
        Comparator<CoverDTO> comparator6 = new CoverDTOCostDesc();
        Collections.sort(list, comparator6);
        for (CoverDTO cost : list) {
            System.out.println(cost);
        }


        System.out.println("Descending order based on quantity");
        Comparator<CoverDTO> comparator7 = new CoverDTOQunatityDesc();
        Collections.sort(list, comparator7);
        for (CoverDTO quantity : list) {
            System.out.println(quantity);
        }


        System.out.println("Descending order based on quality");
        Comparator<CoverDTO> comparator8 = new CoverDTOQualityDsce();
        Collections.sort(list, comparator8);
        for (CoverDTO quality : list) {
            System.out.println(quality);
        }
    }
}

