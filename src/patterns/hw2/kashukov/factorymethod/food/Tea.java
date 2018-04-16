package patterns.hw2.kashukov.factorymethod.food;

public class Tea implements Food {

    @Override
    public void eat() {
        System.out.println("A bottle of tea is consumed");
    }
}
