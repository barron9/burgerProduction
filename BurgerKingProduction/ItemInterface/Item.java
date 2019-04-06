/*
 * Copyright (c) 2019. r1p.net
 */

package BurgerKingProduction.ItemInterface;

import BurgerKingProduction.Packings.Packing;

public interface Item {
    Float Price();

    Packing packedwith();

    String name();
}
