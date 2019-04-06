package BurgerKingProduction.Burgers;

import BurgerKingProduction.ItemInterface.Item;
import BurgerKingProduction.Packings.Packing;
import BurgerKingProduction.Packings.Wrapper;

public class Burger implements Item {
    @Override
    public Float Price() {
        return 7f;
    }

    @Override
    public Packing packedwith() {
        return new Wrapper();
    }

    @Override
    public String name() {
        return ("Burger");
    }
}
