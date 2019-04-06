package BurgerKingProduction.Burgers;

import BurgerKingProduction.Packings.Packing;
import BurgerKingProduction.Packings.Wrapper;

public class VeganBurger extends Burger {
    @Override
    public Packing packedwith() {
        return new Wrapper();
    }

    @Override
    public Float Price() {
        return 12f;
    }

    @Override
    public String name() {
        return ("Vegan Burger");
    }
}
