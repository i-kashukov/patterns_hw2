package patterns.hw2.kashukov.factorymethod.dispensers;

import patterns.hw2.kashukov.factorymethod.food.Chips;
import patterns.hw2.kashukov.factorymethod.food.Food;

public class ChipsDispenser extends FoodDispenser {
    @Override
    public Food getFood() {
        return new Chips();
    }
}
