package com.rakovets.java.solid.my.standarts;

import com.rakovets.java.solid.my.Pizza;
import com.rakovets.java.solid.my.ingridients.*;

import java.util.List;

public class CountrySide extends Pizza {
    private double price;

    public CountrySide() {
        super(List.of(Meat.LAMB), List.of(Chess.CHEDAR), List.of(Vegetables.BAZILICK), List.of(TypeOfTest.STANDART), List.of(BoardType.WithCheeseBoard), List.of(OtherIngridients.SOUSCREAM));
    }
}
