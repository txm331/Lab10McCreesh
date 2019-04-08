package com.company;

public class Main {

    public static void main(String[] args) {
        //Cake cake = new Cake();  //Cannot be instantiated

        AngelFood angelCake = new AngelFood();
        System.out.println("Angel's Food Ingredients");
        angelCake.printIngredients();

        DevilFood devilCake = new DevilFood();
        System.out.println("Devils's Food Ingredients");
        devilCake.printIngredients();
    }
}
