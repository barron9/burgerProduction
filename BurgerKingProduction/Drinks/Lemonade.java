/*
 * Copyright (c) 2019. r1p.net
 */

package BurgerKingProduction.Drinks;

import BurgerKingProduction.ItemInterface.Item;
import BurgerKingProduction.Packings.Bottle;
import BurgerKingProduction.Packings.Packing;

public class Lemonade implements Item {
    @Override
    public Float Price() {
        return 3f;
    }

    @Override
    public Packing packedwith() {
        return new Bottle();
    }

    @Override
    public String name() {
        return ("Lemonade");
    }
}
