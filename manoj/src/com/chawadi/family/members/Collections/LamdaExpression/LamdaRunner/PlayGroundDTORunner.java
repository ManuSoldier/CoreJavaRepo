package com.chawadi.family.members.Collections.LamdaExpression.LamdaRunner;

import com.chawadi.family.members.Collections.LamdaExpression.PlayGroundDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayGroundDTORunner {

    public static void main(String[] args) {

        PlayGroundDTO playGroundDTO1= new PlayGroundDTO("Vivekananda", "DVG", 22.9, 335);
        PlayGroundDTO playGroundDTO2= new PlayGroundDTO("Ambedkar", "Mysour", 25.9, 222);
        PlayGroundDTO playGroundDTO3= new PlayGroundDTO("Sardhar patel", "Banglore", 21.9, 125);
        PlayGroundDTO playGroundDTO4= new PlayGroundDTO("Visveswarayya", "Hebgodi", 20.9, 225);
        PlayGroundDTO playGroundDTO5= new PlayGroundDTO("Magnur Basappa", "Koramangala", 18.9, 55);

        List<PlayGroundDTO> list=new ArrayList<>();
        Collections.sort(list);
        list.add(playGroundDTO1);
        list.add(playGroundDTO2);
        list.add(playGroundDTO3);
        list.add(playGroundDTO4);
        list.add(playGroundDTO5);

        System.out.println("Sorting ascending ordere by name ");
        Collections.sort(list);
        list.forEach(l->System.out.println(l));

        System.out.println("Sorting descending ordere by name ");
        Collections.sort(list, (n1,n2)->n2.getName().compareTo(n1.getName()));
        list.forEach(l->System.out.println(l));

        System.out.println("Sorting ascending ordere by getAreaInSqFeet");
        Collections.sort(list,(l1,l2)->Double.compare(l1.getAreaInSqFeet(),l2.getAreaInSqFeet()));
        list.forEach(l->System.out.println(l));

        System.out.println("Sorting decending ordere by getAreaInSqFeet");
        Collections.sort(list,(l1,l2)->Double.compare(l2.getAreaInSqFeet(),l1.getDistanceInKm()));
        list.forEach(l->System.out.println(l));


        System.out.println("Sorting ascending ordere by shopName");
        Collections.sort(list,(s1,s2)->s1.getPlace().compareTo(s2.getPlace()));
        list.forEach(l->System.out.println(l));

        System.out.println("Sorting decending ordere by shopName");
        Collections.sort(list,(s1,s2)->s2.getPlace().compareTo(s1.getPlace()));
        list.forEach(l->System.out.println(l));

    }
}
