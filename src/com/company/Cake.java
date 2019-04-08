package com.company;


import java.util.ArrayList;

abstract public class Cake {
    private ArrayList<String> baseIngredients = new ArrayList<>();

    //Constructor Method takes an Array List as input
    protected Cake(){
        baseIngredients.add("Sugar");
        baseIngredients.add("Butter");
        baseIngredients.add("Eggs");
        baseIngredients.add("Flour");
    }

    protected ArrayList<String> getBaseIngredients() {
        return baseIngredients;
    }

    protected void printIngredients() {
        for (String item : baseIngredients){
            System.out.println(item);
        }
    }
}
