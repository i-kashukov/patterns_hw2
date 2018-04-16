package patterns.hw2.kashukov.factorymethod;

import patterns.hw2.kashukov.factorymethod.dispensers.ChipsDispenser;
import patterns.hw2.kashukov.factorymethod.dispensers.FoodDispenser;
import patterns.hw2.kashukov.factorymethod.dispensers.PizzaDispenser;
import patterns.hw2.kashukov.factorymethod.dispensers.TeaDispenser;
import patterns.hw2.kashukov.factorymethod.food.Food;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // Фабричный метод, getFood(), реализован в трех классах торговых автоматов
    // и генерирует различные классы, реализующие общий интерфейс Food.
    public static void main(String[] args) {
        FoodDispenser fd1 = new ChipsDispenser();
        FoodDispenser fd2 = new PizzaDispenser();
        FoodDispenser fd3 = new TeaDispenser();
        List<Food> foodBag = new ArrayList<>();
        foodBag.add(fd1.getFood());
        foodBag.add(fd2.getFood());
        foodBag.add(fd3.getFood());

        foodBag.forEach(Food::eat);
    }
}
