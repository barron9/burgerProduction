/*
 * Copyright (c) 2019. r1p.net
 */

package BurgerKingProduction.Drinks;

import BurgerKingProduction.ItemInterface.Item;
import BurgerKingProduction.Packings.Bottle;
import BurgerKingProduction.Packings.Packing;

public class CocaCola implements Item {
    @Override
    public Float Price() {
        return 5f;
    }

    @Override
    public Packing packedwith() {
        return new Bottle();
    }

    @Override
    public String name() {
        return ("Coca-Cola");
    }
}
