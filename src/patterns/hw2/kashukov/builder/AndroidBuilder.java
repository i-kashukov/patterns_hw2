package patterns.hw2.kashukov.builder;

public class AndroidBuilder extends RobotBuilder {
    public AndroidBuilder() {
        this
                .setType("андроид")
                .setPart(PartType.HEAD,"голова андроида")
                .setPart(PartType.BODY,"корпус андроида")
                .setPart(PartType.WHEELS,"ноги андроида")
                .addDevice("рука андроида", 2);
    }
}
