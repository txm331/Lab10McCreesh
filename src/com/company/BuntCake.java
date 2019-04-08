package com.company;
import java.util.ArrayList;
public class BuntCake extends Cake{
    private ArrayList<String> additionalIngredients;

    public BuntCake(){
        ArrayList<String> baseIngredients = super.getBaseIngredients();
        additionalIngredients.addAll(baseIngredients);
        additionalIngredients.add("");
    }
}
