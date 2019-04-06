/*
 * Copyright (c) 2019. r1p.net
 */

package BurgerKingProduction.Meal;

import BurgerKingProduction.ItemInterface.Item;

import java.util.ArrayList;

//TODO
public class Meal {

    ArrayList<Item> MenuItems = new ArrayList<Item>();
    String name;

    public Meal() {

    }

    public String menuName(String name) {
        this.name = name;
        return name;
    }

    public void additem(Item item) {
        MenuItems.add(item);
    }

    public Meal addextra(Item item) {
        MenuItems.add(item);
        return this;
    }

    public Float getprice() {
        Float menuPrice = 0f;
        for (int i = 0; i < MenuItems.size(); i++) {
            menuPrice += MenuItems.get(i).Price();
        }
        return menuPrice;
    }

    public String showItems() {
        String printItems = "=============\n\n" + this.name + "\n\n";
        for (Item item : MenuItems) {
            printItems += " \n" + item.name() + " -- " + item.Price() + "USD";
        }
        return printItems + "\n\nTotal Price -- " + getprice() + "USD";

    }

}
