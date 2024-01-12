package com.chawadi.family.members.Collections.LamdaExpression.LamdaRunner;

import com.chawadi.family.members.Collections.LamdaExpression.RadioDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RadioDTORunner {



    public static void main(String[] args) {

        RadioDTO radioDTO= new RadioDTO("udupi", 300, 3, "good");
        RadioDTO radioDTO1= new RadioDTO("davangere", 500, 5, "bad");
        RadioDTO radioDTO2= new RadioDTO("harihara", 100, 1, "bad");
        RadioDTO radioDTO3= new RadioDTO("malebennur", 100, 1, "good");

        List<RadioDTO> list = new ArrayList<>();
        list.add(radioDTO);
        list.add(radioDTO1);
        list.add(radioDTO2);
        list.add(radioDTO3);

        System.out.println("******************************************");
        Collections.sort(list,(o1, o2)->(o1.getBrand().compareTo(o2.getBrand())));
        System.out.println("after sorting Place in Ascending Order");
        for (RadioDTO radio : list)
        {
            System.out.println(radio);
        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o2.getBrand().compareTo(o1.getBrand())));
        System.out.println("after sorting Place( in Descending Order");
        for (RadioDTO radio1 : list) {
            System.out.println(radio1);
        }

        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getWarrenty(), o2.getWarrenty())));
        System.out.println("after sorting Price in Ascending Order");
        for (RadioDTO radio2 : list)
        {
            System.out.println(radio2);
        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getWarrenty(), o1.getWarrenty())));
        System.out.println("after sorting Price in Descending Order");
        for (RadioDTO radio3 : list) {
            System.out.println(radio3);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getCost(), o2.getCost())));
        System.out.println("after sorting tickets in Ascending Order");
        for (RadioDTO radio4 : list) {
            System.out.println(radio4);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getCost(), o1.getCost())));
        System.out.println("after sorting  in Descending Order");
        for (RadioDTO radio5 : list) {
            System.out.println(radio5);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o1.getShopName().compareTo(o2.getShopName())));
        System.out.println("after sorting place in Ascending Order");
        for (RadioDTO radio6 : list) {
            System.out.println(radio6);

        }



        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o2.getShopName().compareTo(o1.getShopName())));
        System.out.println("after sorting place in Descending Order");
        for (RadioDTO radio7 : list) {
            System.out.println(radio7);

        }


    }

}

