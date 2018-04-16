package patterns.hw2.kashukov.factorymethod.food;

public class Pizza implements Food {
    @Override
    public void eat() {
        System.out.println("Standard pizza is eaten");
    }
}
