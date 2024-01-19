package com.chawadi.family.members.Collections.Comaparable.ComparableRunner;

import com.chawadi.family.members.Collections.Comaparable.ToyDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToyDTORunner{

    public static void main(String[] args) {

            ToyDTO toyDTO=new ToyDTO("Teddy", 1, 100.00,"plastic", "good");
            ToyDTO toyDTO1=new ToyDTO( "Barbiee", 3, 140, "plastic", "bad");
            ToyDTO toyDTO2=new ToyDTO("Monkey", 4, 80,"Faibre", "good");
            ToyDTO toyDTO3=new ToyDTO("Car", 5, 40,"Plastic", "bad");
            ToyDTO toyDTO4=new ToyDTO("Ball", 8, 200,"Plastic", "good");
            ToyDTO toyDTO5=new ToyDTO("Remote car", 7, 300,"Faibre", "good");



            List<ToyDTO> list=new ArrayList<>();
            list.add(toyDTO);
            list.add(toyDTO1);
            list.add(toyDTO2);
            list.add(toyDTO3);
            list.add(toyDTO4);
            list.add(toyDTO5);

            System.out.println("Comparable using in the ToyDTODTO");
            Collections.sort(list);
            System.out.print(list);

        }
    }
