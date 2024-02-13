package com.chawadi.family.members.Collections.Iterator.ItrRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ShoeRunner {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("puma");
        list.add("addidas");
        list.add("sparks");
        list.add("nike");
        list.add("bata");
        list.add("woodland");
        list.add("crocs");
        list.add("flite");
        list.add("pragan");
        list.add("ducati");

        System.out.println("iterator loop in Forword Direction");

        ListIterator<String> itr=list.listIterator();

        while (itr.hasNext())
        {

           String shoes=itr.next();
           System.out.println(shoes);


        }
        System.out.println("iterator loop in backword Direction");
        while (itr.hasPrevious())
        {
            String shoes=itr.previous();
            System.out.println(shoes);
        }

        System.out.println("iterator loop in index 3 forword Direction");
        ListIterator<String> itr1=list.listIterator(3);

        while (itr1.hasNext())
        {
          String shoes= itr1.next();
            System.out.println(shoes);
        }

        System.out.println("iterator loop in index 3 backword Direction");
        ListIterator<String> itr4=list.listIterator(3);
        while (itr4.hasPrevious())
        {
            String shoes= itr4.previous();
            System.out.println(shoes);
        }

        System.out.println("iterator loop in remove  element");
        ListIterator<String> itr2=list.listIterator();

        while (itr2.hasNext())
        {
            String shoes= itr2.next();
            System.out.println(shoes);

        if (itr2.equals("crocs"))
        {
            itr2.remove();
        }
        }

        System.out.println("after removing element succefully");
        list.forEach(l-> System.out.println(l));

        System.out.println("iterator loop in add element");
        ListIterator<String> itr5=list.listIterator();

        while (itr5.hasNext())
        {

            if ("bata".equals(itr5.next()))
            {
                itr5.add("campus");
            }
        }


        System.out.println("after adding element succefully");
        list.forEach(l-> System.out.println(l));
        
        
        }
    }

