package com.chawadi.family.members.Collections.Sort;

import com.chawadi.family.members.Collections.Sort.declare.CharcholDTO;
import com.chawadi.family.members.Collections.Sort.declare.SpeakerDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CharcholeDTORunner {

    public static void main(String[] args) {
        CharcholDTO charcholDTO = new CharcholDTO("Navarag", 2, 36.00, "bad");
        CharcholDTO charcholDTO1 = new CharcholDTO("jindal", 11, 39.00, "good");
        CharcholDTO charcholDTO2= new CharcholDTO("indigo", 18, 34.00, "good");
        CharcholDTO charcholDTO3= new CharcholDTO("BDK", 3, 33.00, "bad");


        List<CharcholDTO> list = new ArrayList<>();
        list.add(charcholDTO);
        list.add(charcholDTO1);
        list.add(charcholDTO2);
        list.add(charcholDTO3);


        System.out.println("Acsending order based on Type");
        Comparator<CharcholDTO> comparator1 = new CharcholeDTOCompany();
        Collections.sort(list, comparator1);
        for (CharcholDTO Company : list) {
            System.out.println(Company);
        }

        System.out.println("Acsending order based on Cost");
        Comparator<CharcholDTO> comparator2 = new CharcholDTOCostAsc();
        Collections.sort(list, comparator2);
        for (CharcholDTO Cost : list) {
            System.out.println(Cost);
        }


        System.out.println("Acsending order based on quantity");
        Comparator<CharcholDTO> comparator3 = new CharcholDTOQunatityAsc();
        Collections.sort(list, comparator3);
        for (CharcholDTO quantity : list) {
            System.out.println(quantity);
        }


        System.out.println("Acsending order based on quality");
        Comparator<CharcholDTO> comparator4 = new CharcholDTOQualityAesc();
        Collections.sort(list, comparator4);
        for (CharcholDTO quality : list) {
            System.out.println(quality);
        }


        System.out.println("*******************************************************");
        System.out.println("Starting the decending Order");
        System.out.println("*******************************************************");

        System.out.println("Descending order based on type");
        Comparator<CharcholDTO> comparator5 = new CharcholDTOCompanyDsce();
        Collections.sort(list, comparator5);
        for (CharcholDTO Type : list) {
            System.out.println(Type);
        }


        System.out.println("Descending order based on cost");
        Comparator<CharcholDTO> comparator6 = new CharcholDTOCostDesc();
        Collections.sort(list, comparator6);
        for (CharcholDTO cost : list) {
            System.out.println(cost);
        }


        System.out.println("Descending order based on quantity");
        Comparator<CharcholDTO> comparator7 = new CharcholDTOQunatityDesc();
        Collections.sort(list, comparator7);
        for (CharcholDTO quantity : list) {
            System.out.println(quantity);
        }


        System.out.println("Descending order based on quality");
        Comparator<CharcholDTO> comparator8 = new CharcholDTOQualityDsce();
        Collections.sort(list, comparator8);
        for (CharcholDTO quality : list) {
            System.out.println(quality);
        }
    }
}


