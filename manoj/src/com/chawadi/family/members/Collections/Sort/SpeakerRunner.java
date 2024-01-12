package com.chawadi.family.members.Collections.Sort;

import com.chawadi.family.members.Collections.Sort.declare.PaperDTO;
import com.chawadi.family.members.Collections.Sort.declare.SpeakerDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SpeakerRunner {

    public static void main(String[] args) {

        SpeakerDTO speakerDTO = new SpeakerDTO("samsung", 3, 34.00, "bad");
        SpeakerDTO speakerDTO1 = new SpeakerDTO("lenova", 6, 39.00, "good");
        SpeakerDTO speakerDTO2 = new SpeakerDTO("bajaj", 1, 35.00, "good");
        SpeakerDTO speakerDTO3 = new SpeakerDTO("tata", 8, 31.00, "bad");


        List<SpeakerDTO> list = new ArrayList<>();
        list.add(speakerDTO);
        list.add(speakerDTO1);
        list.add(speakerDTO2);
        list.add(speakerDTO3);


        System.out.println("Acsending order based on Type");
        Comparator<SpeakerDTO> comparator1 = new SpeakerDTOCompanyAsc();
        Collections.sort(list, comparator1);
        for (SpeakerDTO Company : list) {
            System.out.println(Company);
        }

        System.out.println("Acsending order based on Cost");
        Comparator<SpeakerDTO> comparator2 = new SpeakerDTOCostAsc();
        Collections.sort(list, comparator2);
        for (SpeakerDTO Cost : list) {
            System.out.println(Cost);
        }


        System.out.println("Acsending order based on quantity");
        Comparator<SpeakerDTO> comparator3 = new SpeakerDTOQunatityAsc();
        Collections.sort(list, comparator3);
        for (SpeakerDTO quantity : list) {
            System.out.println(quantity);
        }


        System.out.println("Acsending order based on quality");
        Comparator<SpeakerDTO> comparator4 = new SpeakerDTOQualityAesc();
        Collections.sort(list, comparator4);
        for (SpeakerDTO quality : list) {
            System.out.println(quality);
        }


        System.out.println("*******************************************************");
        System.out.println("Starting the decending Order");
        System.out.println("*******************************************************");

        System.out.println("Descending order based on type");
        Comparator<SpeakerDTO> comparator5 = new SpeakerDTOCompanyDsce();
        Collections.sort(list, comparator5);
        for (SpeakerDTO Type : list) {
            System.out.println(Type);
        }


        System.out.println("Descending order based on cost");
        Comparator<SpeakerDTO> comparator6 = new SpeakerDTOCostDesc();
        Collections.sort(list, comparator6);
        for (SpeakerDTO cost : list) {
            System.out.println(cost);
        }


        System.out.println("Descending order based on quantity");
        Comparator<SpeakerDTO> comparator7 = new SpeakerDTOQunatityDesc();
        Collections.sort(list, comparator7);
        for (SpeakerDTO quantity : list) {
            System.out.println(quantity);
        }


        System.out.println("Descending order based on quality");
        Comparator<SpeakerDTO> comparator8 = new SpeakerDTOQualityDsce();
        Collections.sort(list, comparator8);
        for (SpeakerDTO quality : list) {
            System.out.println(quality);
        }
    }
}



