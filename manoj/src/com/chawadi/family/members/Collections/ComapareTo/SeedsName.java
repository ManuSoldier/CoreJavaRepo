package com.chawadi.family.members.Collections.ComapareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SeedsName {
    public static void main(String[] args) {
        Comparator<String> seeds = new SeedsNameImpl();
        List<String> list = new ArrayList<>();
        System.out.println("Ascending Order list");
        list.add("Sunflower seeds");
        list.add("Pumpkin seeds");
        list.add("Sesame seeds");
        list.add("Chia seeds");
        list.add("Flaxseeds");
        list.add("Poppy seeds");
        list.add("Hemp seeds");
        list.add("Quinoa seeds");
        list.add("Mustard seeds");
        list.add("Cumin seeds");
        Collections.sort(list);
        for (String i :list ){
            System.out.println(i);

        }
        System.out.println("Descending orders List");
        Collections.sort(list,seeds);
        for (String i:list){
            System.out.println(i);
        }


    }
}

