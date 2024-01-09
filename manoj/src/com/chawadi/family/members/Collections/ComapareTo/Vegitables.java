package com.chawadi.family.members.Collections.ComapareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Vegitables {

    public static void main(String[] args) {
        Comparator<String> comparator=new VegtablesImpl();
        List<String> list=new ArrayList<>();
        list.add("Tomato");
        list.add("carrote");
        list.add("onion");
        list.add("patato");
        list.add("chilli");
        list.add("red chilli");
        list.add("drumstick");
        list.add("cucumbar");
        list.add("brinjal");
        list.add("garlic");
        Collections.sort(list);
        for (String i:list)
        {
            System.out.println(i);
        }
        System.out.println("");
        Collections.sort(list,comparator);
        for (String i:list)
        {
            System.out.println(i);
        }

    }
}
