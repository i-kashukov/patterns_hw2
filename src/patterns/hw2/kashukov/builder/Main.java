package patterns.hw2.kashukov.builder;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Класс-строитель позволяет создавать типовых роботов
        Robot android1 = new AndroidBuilder().build();
        android1.print();
        System.out.println("--------------");
        // или менять их параметры
        Robot android2 = new AndroidBuilder()
                .setId(721)
                .addDevice("радиоприемник",1)
                .build();
        android2.print();


    }
}
