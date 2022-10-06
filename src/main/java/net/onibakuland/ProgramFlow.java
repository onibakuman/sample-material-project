package net.onibakuland;

public class ProgramFlow {

    private final TextHandler textHandler = new TextHandler();
    private MaterialSpeed materialSpeed;

    public void runProgram() {
        textHandler.printGreetingMessage();
        Integer userDistanceType = textHandler.getUserIntegerInput();
        textHandler.printMaterialMessage();
        Double userDistance = textHandler.getUserDouble();

        Double calculatedSpeed = calclateSpeed(userDistance, userDistanceType);

        textHandler.printSpeedMessage(userDistanceType, calculatedSpeed);
    }

    public Double calclateSpeed(Double distance, Integer distanceType) {
        materialSpeed = new MaterialSpeed(distance, distanceType);
        return materialSpeed.getSpeed();
    }
}
