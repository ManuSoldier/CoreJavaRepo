package com.chawadi.family.members.Collections.LamdaExpression.LamdaRunner;

import com.chawadi.family.members.Collections.LamdaExpression.WatchDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WatchDTORunner {


    public static void main(String[] args) {
        WatchDTO watchDTO1=new WatchDTO("hMT", 22.0, " sai","BTM Layout");
        WatchDTO watchDTO2=new WatchDTO("sony", 21.0, " ram","Rajajinagar");
        WatchDTO watchDTO3=new WatchDTO("bolt", 20.0, " krishna","Banashakari");
        WatchDTO watchDTO4=new WatchDTO("titan", 19.0, " hanuma","kormagala");
        WatchDTO watchDTO5=new WatchDTO("realme", 18.0, " shakthi","silkbourd");

        List<WatchDTO> list=new ArrayList<>();
        list.add(watchDTO1);
        list.add(watchDTO2);
        list.add(watchDTO3);
        list.add(watchDTO4);
        list.add(watchDTO5);

        System.out.println("Sorting ascending ordere by companyName");
        Collections.sort(list);
        list.forEach(l->System.out.println(l));

        System.out.println("Sorting decending ordere by companyName");
        Collections.sort(list,(c1,c2)->c2.getCompany().compareTo(c1.getCompany()));
        list.forEach(l->System.out.println(l));

        System.out.println("Sorting ascending ordere by cost");
        Collections.sort(list,(l1,l2)->Double.compare(l1.getCost(),l2.getCost()));
        list.forEach(l->System.out.println(l));

        System.out.println("Sorting decending ordere by cost");
        Collections.sort(list,(l1,l2)->Double.compare(l2.getCost(),l1.getCost()));
        list.forEach(l->System.out.println(l));

        System.out.println("Sorting ascending ordere by shopName");
        Collections.sort(list,(s1,s2)->s1.getShopName().compareTo(s2.getShopName()));
        list.forEach(l->System.out.println(l));

        System.out.println("Sorting decending ordere by shopName");
        Collections.sort(list,(s1,s2)->s2.getShopName().compareTo(s1.getShopName()));
        list.forEach(l->System.out.println(l));

    }
}
