package com.chawadi.family.members.Collections.ComapareTo;

import java.util.*;

public class TreeAge {

    public static void main(String[] args) {
        Comparator<Integer> comparator=new TreeCollectionImpl();
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(18);
        list.add(20);
        list.add(34);
        list.add(45);
        list.add(87);
        list.add(56);
        list.add(49);
        list.add(26);
        list.add(82);
        Collections.sort(list);
         for (Integer i:list)
         {
             System.out.println(i);
         }
        System.out.println("Descending Order");
         Collections.sort(list,comparator);
         for (Integer i:list)
         {
             System.out.println(i);
         }
    }
}
