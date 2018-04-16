package patterns.hw2.kashukov.builder;

public abstract class RobotBuilder {

    public static enum PartType{HEAD,BODY,WHEELS}

    private Robot robot;

    public RobotBuilder() {
        this.robot = new Robot();
    }

    public RobotBuilder setId(int id) {
        this.robot.setId(id);
        return this;
    }



    public RobotBuilder setPart(PartType type, String description) {
        switch (type) {
            case BODY:
                robot.setBody(description);
                break;
            case HEAD:
                robot.setHead(description);
                break;
            case WHEELS:
                robot.setWheels(description);
                break;
        }
        return this;
    }

    public RobotBuilder setType(String type) {
        robot.setType(type);
        return this;
    }

    public RobotBuilder addDevice(String device, Integer number) {
        robot.addDevice(device,number);
        return this;
    }

    public Robot build() {
        return this.robot;
    }
}
