package patterns.hw2.kashukov.factorymethod.dispensers;

import patterns.hw2.kashukov.factorymethod.food.Food;
import patterns.hw2.kashukov.factorymethod.food.Tea;

public class TeaDispenser extends FoodDispenser {

    @Override
    public Food getFood() {
        return new Tea();
    }
}
