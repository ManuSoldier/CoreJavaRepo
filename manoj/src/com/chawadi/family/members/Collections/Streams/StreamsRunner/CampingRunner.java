package com.chawadi.family.members.Collections.Streams.StreamsRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CampingRunner {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("sleeping bag");
        list.add("pillow");
        list.add("bedsheet");
        list.add("rucksuck");
        list.add("camping stove");
        list.add("lantern");
        list.add("head lamp");
        list.add("hammock");
        list.add("chair");
        list.add("wood");

        System.out.println("printin the contains t in the collections"); //1
        list.stream().filter(t->t.contains("t")).forEach(l-> System.out.println(l));

        System.out.println("printin the contains t in the collections count"); //2
        System.out.println(list.stream().filter(t1->t1.contains("t")).count());

        System.out.println("printin the contains s and o in the collections count"); //3
        list.stream().filter(t1->t1.contains("a")&& t1.contains("o")).sorted().forEach(l-> System.out.println(l));

        System.out.println("printin the converts tp uppercase in the collections"); //4
        list.stream().filter(t->t.contains("a")).forEach(t-> System.out.println(t.toUpperCase()));

        System.out.println("printin the sorting in descending in the collections"); //5
        List<String> sortedList = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        sortedList.forEach(l-> System.out.println(l));

        System.out.println("printing wich has the 5 charecter descending in the collections"); //6
        list.stream().filter(t->t.length()<=5).sorted(Collections.reverseOrder()).forEach(l-> System.out.println(l));

    }
}
