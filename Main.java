/*
 * Copyright (c) 2019. r1p.net
 */

import BurgerKingProduction.Burgers.MeatBurger;
import BurgerKingProduction.Drinks.CocaCola;
import BurgerKingProduction.Drinks.Lemonade;
import BurgerKingProduction.Meal.Meal;
import BurgerKingProduction.PrepareMeal.PrepareMulti;
import BurgerKingProduction.PrepareMeal.PrepareSingle;
import BurgerKingProduction.Terminal.Programme;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        System.out.println("Starting App!\n\n");

        ArrayList<Meal> multimeals = new ArrayList<>();

        multimeals.add(
                new PrepareSingle()
                        .prepareVeganMeal()
                        .addextra(new MeatBurger())
                        .addextra(new CocaCola()));

        multimeals.add(
                new PrepareSingle()
                        .prepareMeatMeal()
                        .addextra(new MeatBurger())
                        .addextra(new Lemonade())
                        .addextra(new CocaCola()));

        System.out.println(
                new PrepareMulti()
                        .totalCost(multimeals)
        );

        //new Programme().execute();
    }
}