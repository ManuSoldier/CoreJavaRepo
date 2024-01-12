package com.chawadi.family.members.Collections.Sort;

import com.chawadi.family.members.Collections.Sort.declare.SparkPlugDTO;
import com.chawadi.family.members.Collections.Sort.declare.SpeakerDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SparkPlugDTORunner {


        public static void main(String[] args) {

            SparkPlugDTO sparkPlugDTO = new SparkPlugDTO("Sai shree", 3, 34.00, "bad");
            SparkPlugDTO sparkPlugDTO1 = new SparkPlugDTO("Veereshwara", 6, 39.00, "good");
            SparkPlugDTO sparkPlugDTO2= new SparkPlugDTO("preethi", 1, 35.00, "good");
            SparkPlugDTO sparkPlugDTO3= new SparkPlugDTO("sheyas gowda hardware", 8, 31.00, "bad");


            List<SparkPlugDTO> list = new ArrayList<>();
            list.add(sparkPlugDTO);
            list.add(sparkPlugDTO1);
            list.add(sparkPlugDTO2);
            list.add(sparkPlugDTO3);


            System.out.println("Acsending order based on Type");
            Comparator<SparkPlugDTO> comparator1 = new SparkPlugDTOShopNameAsce();
            Collections.sort(list, comparator1);
            for (SparkPlugDTO ShopName : list) {
                System.out.println(ShopName);
            }

            System.out.println("Acsending order based on Cost");
            Comparator<SparkPlugDTO> comparator2 = new SparkPlugDTOCostAsc();
            Collections.sort(list, comparator2);
            for (SparkPlugDTO Cost : list) {
                System.out.println(Cost);
            }


            System.out.println("Acsending order based on quantity");
            Comparator<SparkPlugDTO> comparator3 = new SparkPlugDTOQunatityAsc();
            Collections.sort(list, comparator3);
            for (SparkPlugDTO quantity : list) {
                System.out.println(quantity);
            }


            System.out.println("Acsending order based on quality");
            Comparator<SparkPlugDTO> comparator4 = new SparkPlugDTOQualityAesc();
            Collections.sort(list, comparator4);
            for (SparkPlugDTO quality : list) {
                System.out.println(quality);
            }


            System.out.println("*******************************************************");
            System.out.println("Starting the decending Order");
            System.out.println("*******************************************************");

            System.out.println("Descending order based on type");
            Comparator<SparkPlugDTO> comparator5 = new SparkPlugDTOCompanyDsce();
            Collections.sort(list, comparator5);
            for (SparkPlugDTO Type : list) {
                System.out.println(Type);
            }


            System.out.println("Descending order based on cost");
            Comparator<SparkPlugDTO> comparator6 = new SparkPlugDTOCostDesc();
            Collections.sort(list, comparator6);
            for (SparkPlugDTO cost : list) {
                System.out.println(cost);
            }


            System.out.println("Descending order based on quantity");
            Comparator<SparkPlugDTO> comparator7 = new SparkPlugDTOQunatityDesc();
            Collections.sort(list, comparator7);
            for (SparkPlugDTO quantity : list) {
                System.out.println(quantity);
            }


            System.out.println("Descending order based on quality");
            Comparator<SparkPlugDTO> comparator8 = new SparkPlugDTOQualityDsce();
            Collections.sort(list, comparator8);
            for (SparkPlugDTO quality : list) {
                System.out.println(quality);
            }
        }
    }

