package patterns.hw2.kashukov.factorymethod.food;

public class Chips implements Food {
    @Override
    public void eat() {
        System.out.println("Standard bag of chips is eaten");
    }
}
