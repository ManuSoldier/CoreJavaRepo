package com.chawadi.family.members.Collections.Comaparable.ComparableRunner;

import com.chawadi.family.members.Collections.Comaparable.WingsDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WingsDTORunner {

    public static void main(String[] args) {

        WingsDTO wingsDTO=new WingsDTO("swan", 2, "Long","good", 12);
        WingsDTO wingsDTO1=new WingsDTO( "pecock", 4, "medium", "bad", 15);
        WingsDTO wingsDTO2=new WingsDTO("hen", 5, "short","good", 8);
        WingsDTO wingsDTO3=new WingsDTO("parrot", 4, "long","good", 9);
        WingsDTO wingsDTO4=new WingsDTO("eagle", 6, "long","good", 5);
        WingsDTO wingsDTO5=new WingsDTO("Crow", 4, "long","bad", 7);



        List<WingsDTO> list=new ArrayList<>();
        list.add(wingsDTO);
        list.add(wingsDTO1);
        list.add(wingsDTO2);
        list.add(wingsDTO3);
        list.add(wingsDTO4);
        list.add(wingsDTO5);

        System.out.println("Comparable using in the WingsDTODTO");
        Collections.sort(list);
        System.out.print(list);

    }
}

