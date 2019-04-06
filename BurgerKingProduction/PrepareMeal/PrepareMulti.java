package BurgerKingProduction.PrepareMeal;

import BurgerKingProduction.Meal.Meal;

import java.util.ArrayList;

public class PrepareMulti {
    ArrayList<Meal> multiMeal = new ArrayList<>();

    public String totalCost(ArrayList<Meal> multiMeal) {
        Float totalCost = 0f;
        String FillPaper = "";
        for (Meal singleMeal : multiMeal) {
            FillPaper += " \n\n" + singleMeal.showItems();
            totalCost += singleMeal.getprice();
        }
        return FillPaper + "\n\n=============" + "\n\n(Unpaid)Total Cost:" + totalCost + "USD";
    }
}
