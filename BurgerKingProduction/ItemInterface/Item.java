package BurgerKingProduction.ItemInterface;

import BurgerKingProduction.Packings.Packing;

public interface Item {
    Float Price();
    Packing packedwith();
    String name();
}
