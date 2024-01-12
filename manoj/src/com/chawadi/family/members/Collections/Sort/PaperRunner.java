package com.chawadi.family.members.Collections.Sort;

import com.chawadi.family.members.Collections.Sort.declare.PaperDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PaperRunner {

    public static void main(String[] args) {


        PaperDTO paperDTO=new PaperDTO("B4", 20, 2, "good");
        PaperDTO paperDTO1=new PaperDTO("A3", 30, 3, "bad");
        PaperDTO paperDTO2=new PaperDTO("D5", 40, 4, "good");
        PaperDTO paperDTO3=new PaperDTO("C6", 50, 5, "bad");

        List<PaperDTO> list=new ArrayList<>();
        list.add(paperDTO);
        list.add(paperDTO1);
        list.add(paperDTO2);
        list.add(paperDTO3);


        System.out.println("Acsending order based on Type");
        Comparator<PaperDTO> comparator1=new PaperDTOTypeAsce();
        Collections.sort(list,comparator1);
        for (PaperDTO Type:list)
        {
            System.out.println(Type);
        }

        System.out.println("Acsending order based on Cost");
        Comparator<PaperDTO> comparator2=new PaperDTOCostAsc();
        Collections.sort(list,comparator2);
        for (PaperDTO Cost:list)
        {
            System.out.println(Cost);
        }


        System.out.println("Acsending order based on quantity");
        Comparator<PaperDTO> comparator3=new PaperDTOQunatityAsc();
        Collections.sort(list,comparator3);
        for (PaperDTO quantity:list)
        {
            System.out.println(quantity);
        }


        System.out.println("Acsending order based on quality");
        Comparator<PaperDTO> comparator4=new PaperDTOQualityAesc ();
        Collections.sort(list,comparator4);
        for (PaperDTO quality:list)
        {
            System.out.println(quality);
        }


        System.out.println("*******************************************************");
        System.out.println("Starting the decending Order");
        System.out.println("*******************************************************");

        System.out.println("Descending order based on type");
        Comparator<PaperDTO> comparator5=new PaperDTOTypeDsce();
        Collections.sort(list,comparator5);
        for (PaperDTO Type:list)
        {
            System.out.println(Type);
        }


        System.out.println("Descending order based on cost");
        Comparator<PaperDTO> comparator6=new PaperDTOCostDesc();
        Collections.sort(list,comparator6);
        for (PaperDTO cost:list)
        {
            System.out.println(cost);
        }


        System.out.println("Descending order based on quantity");
        Comparator<PaperDTO> comparator7=new PaperDTOQunatityDesc();
        Collections.sort(list,comparator7);
        for (PaperDTO quantity:list)
        {
            System.out.println(quantity);
        }


        System.out.println("Descending order based on quality");
        Comparator<PaperDTO> comparator8=new PaperDTOQualityDsce();
        Collections.sort(list,comparator8);
        for (PaperDTO quality:list)
        {
            System.out.println(quality);
        }

            }
    }
