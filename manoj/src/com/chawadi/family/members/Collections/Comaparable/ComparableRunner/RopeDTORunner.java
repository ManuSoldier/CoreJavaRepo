package com.chawadi.family.members.Collections.Comaparable.ComparableRunner;

import com.chawadi.family.members.Collections.Comaparable.RopeDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RopeDTORunner {

    public static void main(String[] args) {

        RopeDTO ropeDTO=new RopeDTO("plastic", 2, "Long",100, 12);
        RopeDTO ropeDTO1=new RopeDTO( "fibre", 4, "medium", 110, 15);
        RopeDTO ropeDTO2=new RopeDTO("cloth", 5, "short",140, 8);
        RopeDTO ropeDTO3=new RopeDTO("plastic", 4, "long",300, 9);
        RopeDTO ropeDTO4=new RopeDTO("fibre", 6, "long",400, 5);
        RopeDTO ropeDTO5=new RopeDTO("cloth", 4, "long",150, 7);



        List<RopeDTO> list=new ArrayList<>();
        list.add(ropeDTO);
        list.add(ropeDTO1);
        list.add(ropeDTO2);
        list.add(ropeDTO3);
        list.add(ropeDTO4);
        list.add(ropeDTO5);

        System.out.println("Comparable using in the RopeDTODTO");
        Collections.sort(list);
        System.out.print(list);
    }
}

