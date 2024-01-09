package com.chawadi.family.members.Collections.classwork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class clsWork {

    public static void main(String[] args) {
        Collection<Integer> collection=new ArrayList<>();
        collection.add(22);
        collection.add(23);
        collection.add(24);
        collection.add(25);
        collection.add(26);
        collection.add(27);
        collection.add(28);
        collection.add(29);
        collection.add(30);

        Collection<Integer> collection0=new ArrayList<>();
        int no=31;
        int no1=32;
        int no3=33;
        int no4=34;

        collection.addAll(collection0);

        Collection<Integer> collection1=new ArrayList<>();
        collection1.add(no);
        collection1.add(no1);
        collection1.add(no3);
        collection1.add(no4);

        collection.addAll(collection1);
        System.out.println(collection);
        System.out.println("remove:"+collection.remove(23));
        collection.removeAll(collection1);
       //collection.add(99);
        //System.out.println(collection);
//System.out.println(collection1);






    }
}

