package patterns.hw2.kashukov.factorymethod.dispensers;

import patterns.hw2.kashukov.factorymethod.food.Food;
import patterns.hw2.kashukov.factorymethod.food.Pizza;

public class PizzaDispenser extends FoodDispenser {
    @Override
    public Food getFood() {
        return new Pizza();
    }
}
