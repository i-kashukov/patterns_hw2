package patterns.hw2.kashukov.builder;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Robot {
    private String type;
    private String head;
    private String body;
    private String wheels;
    private int id;
    private Map<String, Integer> additionalDevices;

    public Robot() {
        this.additionalDevices = new HashMap<>();
        this.id = new Random().nextInt();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void addDevice(String device, Integer number) {
        additionalDevices.put(device, number);
    }

    public void print() {
        System.out.println(String.format("Робот #%d (%s)",id,type));
        System.out.println("Голова: " + head);
        System.out.println("Корпус: " + body);
        System.out.println("Колеса: " + wheels);
        if(!additionalDevices.isEmpty()) {
            System.out.println("Дополнительные устройства: ");
            additionalDevices.forEach((key, value) -> System.out.println(key + ": " + value));
        }
    }
}
