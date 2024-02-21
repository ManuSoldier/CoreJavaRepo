package com.chawadi.family.members.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FoodIngredientMap {

    public static void main(String[] args) {
        

        Map<String,String[]> foodIngredientMap=new HashMap<>();
        String[] Ingredient ={"Groundnut","carrot","beans","lime"};
        foodIngredientMap.put("Chiranna", Ingredient);

        String[] Ingredient1 ={"Groundnut","carrot","beans","lime","patato","Rice"};
        foodIngredientMap.put("Pallav", Ingredient1);

        String[] Ingredient2 ={"Groundnut","carrot","beans","lime","patato","Rice"};
        foodIngredientMap.put("agiculthure", Ingredient2);

        String[] Ingredient3 ={"Groundnut","carrot","beans","Rice"};
        foodIngredientMap.put("urban", Ingredient3);

        String[] Ingredient4 ={"Groundnut","patato","Rice"};
        foodIngredientMap.put("gov", Ingredient4);

        System.out.println("printing the keys of foodIngredientMap");
        Set<String> keys=foodIngredientMap.keySet();
        keys.forEach(System.out::println);
        System.out.println("**************************************************");


        System.out.println("printing the values of foodIngredientMap");
        Collection<String[]> values=foodIngredientMap.values();
        values.forEach(list->{
            for (String i:list){
                System.out.println(i);
            }
        });
    }
}
