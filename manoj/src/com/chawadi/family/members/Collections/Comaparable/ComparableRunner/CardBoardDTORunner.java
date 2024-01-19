package com.chawadi.family.members.Collections.Comaparable.ComparableRunner;

import com.chawadi.family.members.Collections.Comaparable.CardBoardDTO;
import com.chawadi.family.members.Collections.Comaparable.ToyDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardBoardDTORunner {

    public static void main(String[] args) {

        CardBoardDTO cardBoardDTO=new CardBoardDTO("Shree Sai", 1, 100.00,"plastic", "malebennur");
        CardBoardDTO cardBoardDTO1=new CardBoardDTO( "Arjun", 3, 140, "plastic", "harihar");
        CardBoardDTO cardBoardDTO2=new CardBoardDTO("X-workz", 4, 80,"Faibre", "btm");
        CardBoardDTO cardBoardDTO3=new CardBoardDTO("ganesh", 5, 40,"Plastic", "davangere");
        CardBoardDTO cardBoardDTO4=new CardBoardDTO("ajay", 8, 200,"Plastic", "honnali");
        CardBoardDTO cardBoardDTO5=new CardBoardDTO("mahaveer", 7, 300,"Faibre", "chengiri");



        List<CardBoardDTO> list=new ArrayList<>();
        list.add(cardBoardDTO);
        list.add(cardBoardDTO1);
        list.add(cardBoardDTO2);
        list.add(cardBoardDTO3);
        list.add(cardBoardDTO4);
        list.add(cardBoardDTO5);

        System.out.println("Comparable using in the ToyDTODTO");
        Collections.sort(list);
        System.out.print(list);

    }
}

