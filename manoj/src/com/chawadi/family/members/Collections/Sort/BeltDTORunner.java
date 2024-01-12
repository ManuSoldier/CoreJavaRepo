package com.chawadi.family.members.Collections.Sort;

import com.chawadi.family.members.Collections.Sort.declare.BeltDTO;
import com.chawadi.family.members.Collections.Sort.declare.SpeakerDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BeltDTORunner {


    public static void main(String[] args) {

        BeltDTO beltDTO = new BeltDTO("samsung", 3, 34.00, "bad");
        BeltDTO beltDTO1 = new BeltDTO("lenova", 6, 39.00, "good");
        BeltDTO beltDTO2= new BeltDTO("bajaj", 1, 35.00, "good");
        BeltDTO beltDTO3= new BeltDTO("tata", 8, 31.00, "bad");


        List<BeltDTO> list = new ArrayList<>();
        list.add(beltDTO);
        list.add(beltDTO1);
        list.add(beltDTO2);
        list.add(beltDTO3);


        System.out.println("Acsending order based on Type");
        Comparator<BeltDTO> comparator1 = new BeltDTOTypeAsce();
        Collections.sort(list, comparator1);
        for (BeltDTO Company : list) {
            System.out.println(Company);
        }

        System.out.println("Acsending order based on Cost");
        Comparator<BeltDTO> comparator2 = new BeltDTOCostAsc();
        Collections.sort(list, comparator2);
        for (BeltDTO Cost : list) {
            System.out.println(Cost);
        }


        System.out.println("Acsending order based on quantity");
        Comparator<BeltDTO> comparator3 = new BeltDTOQunatityAsc();
        Collections.sort(list, comparator3);
        for (BeltDTO quantity : list) {
            System.out.println(quantity);
        }


        System.out.println("Acsending order based on quality");
        Comparator<BeltDTO> comparator4 = new BeltDTOQualityAesc();
        Collections.sort(list, comparator4);
        for (BeltDTO quality : list) {
            System.out.println(quality);
        }


        System.out.println("*******************************************************");
        System.out.println("Starting the decending Order");
        System.out.println("*******************************************************");

        System.out.println("Descending order based on type");
        Comparator<BeltDTO> comparator5 = new BeltDTOCompanyDsce();
        Collections.sort(list, comparator5);
        for (BeltDTO Type : list) {
            System.out.println(Type);
        }


        System.out.println("Descending order based on cost");
        Comparator<BeltDTO> comparator6 = new BeltDTOCostDesc();
        Collections.sort(list, comparator6);
        for (BeltDTO cost : list) {
            System.out.println(cost);
        }


        System.out.println("Descending order based on quantity");
        Comparator<BeltDTO> comparator7 = new BeltDTOQunatityDesc();
        Collections.sort(list, comparator7);
        for (BeltDTO quantity : list) {
            System.out.println(quantity);
        }


        System.out.println("Descending order based on quality");
        Comparator<BeltDTO> comparator8 = new BeltDTOQualityDsce();
        Collections.sort(list, comparator8);
        for (BeltDTO quality : list) {
            System.out.println(quality);
        }
    }
}


