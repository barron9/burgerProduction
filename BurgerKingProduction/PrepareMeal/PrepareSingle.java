/*
 * Copyright (c) 2019. r1p.net
 */

package BurgerKingProduction.PrepareMeal;

import BurgerKingProduction.Burgers.MeatBurger;
import BurgerKingProduction.Burgers.VeganBurger;
import BurgerKingProduction.Drinks.CocaCola;
import BurgerKingProduction.Drinks.Lemonade;
import BurgerKingProduction.Meal.Meal;

public class PrepareSingle {

    public Meal prepareVeganMeal() {
        Meal meal = new Meal();
        meal.menuName("Vegan Meal");
        meal.additem(new VeganBurger());
        meal.additem(new Lemonade());
        return meal;
    }

    public Meal prepareMeatMeal() {
        Meal meal = new Meal();
        meal.menuName("Meat Meal");
        meal.additem(new MeatBurger());
        meal.additem(new CocaCola());
        return meal;
    }

    public Meal customMeal(String name) {

        Meal meal = new Meal();
        meal.menuName(name);
        meal.additem(new MeatBurger());
        meal.additem(new CocaCola());
        return meal;
    }
}
