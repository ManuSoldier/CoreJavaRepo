package com.chawadi.family.members.Collections.Sort;

import com.chawadi.family.members.Collections.Sort.declare.CoverDTO;
import com.chawadi.family.members.Collections.Sort.declare.ParkingDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ParkingDTORunner {



    public static void main(String[] args) {

        ParkingDTO parkingDTO = new ParkingDTO("hand", 3, 34.00, "bad");
        ParkingDTO parkingDTO1= new ParkingDTO("dustbin", 6, 39.00, "good");
        ParkingDTO parkingDTO2= new ParkingDTO("lagauge", 1, 35.00, "good");
        ParkingDTO parkingDTO3= new ParkingDTO("Wedding Cover", 8, 31.00, "bad");


        List<ParkingDTO> list = new ArrayList<>();
        list.add(parkingDTO);
        list.add(parkingDTO1);
        list.add(parkingDTO2);
        list.add(parkingDTO3);


        System.out.println("Acsending order based on Type");
        Comparator<ParkingDTO> comparator1 = new ParkingDTOCompanyAsc();
        Collections.sort(list, comparator1);
        for (ParkingDTO Company : list) {
            System.out.println(Company);
        }

        System.out.println("Acsending order based on Cost");
        Comparator<ParkingDTO> comparator2 = new ParkingDTOCostAsc();
        Collections.sort(list, comparator2);
        for (ParkingDTO Cost : list) {
            System.out.println(Cost);
        }


        System.out.println("Acsending order based on quantity");
        Comparator<ParkingDTO> comparator3 = new ParkingDTOQunatityAsc();
        Collections.sort(list, comparator3);
        for (ParkingDTO quantity : list) {
            System.out.println(quantity);
        }


        System.out.println("Acsending order based on quality");
        Comparator<ParkingDTO> comparator4 = new ParkingDTOQualityAesc();
        Collections.sort(list, comparator4);
        for (ParkingDTO quality : list) {
            System.out.println(quality);
        }


        System.out.println("*******************************************************");
        System.out.println("Starting the decending Order");
        System.out.println("*******************************************************");

        System.out.println("Descending order based on type");
        Comparator<ParkingDTO> comparator5 = new ParkingDTOCompanyDsce();
        Collections.sort(list, comparator5);
        for (ParkingDTO Type : list) {
            System.out.println(Type);
        }


        System.out.println("Descending order based on cost");
        Comparator<ParkingDTO> comparator6 = new ParkingDTOCostDesc();
        Collections.sort(list, comparator6);
        for (ParkingDTO cost : list) {
            System.out.println(cost);
        }


        System.out.println("Descending order based on quantity");
        Comparator<ParkingDTO> comparator7 = new ParkingDTOQunatityDesc();
        Collections.sort(list, comparator7);
        for (ParkingDTO quantity : list) {
            System.out.println(quantity);
        }


        System.out.println("Descending order based on quality");
        Comparator<ParkingDTO> comparator8 = new ParkingDTOQualityDsce();
        Collections.sort(list, comparator8);
        for (ParkingDTO quality : list) {
            System.out.println(quality);
        }
    }
}
