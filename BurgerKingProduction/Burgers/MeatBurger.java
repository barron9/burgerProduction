/*
 * Copyright (c) 2019. r1p.net
 */

package BurgerKingProduction.Burgers;

import BurgerKingProduction.Packings.Packing;
import BurgerKingProduction.Packings.Wrapper;

public class MeatBurger extends Burger {
    @Override
    public Float Price() {
        return 20f;
    }

    @Override
    public Packing packedwith() {
        return new Wrapper();
    }

    @Override
    public String name() {
        return ("Meat Burger");
    }
}
