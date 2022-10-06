package net.onibakuland;

import java.util.Scanner;

public class TextHandler {
    private final Scanner scanner = new Scanner(System.in);

    public void printGreetingMessage() {
        System.out.println("Welcome to the Program!!!");
        System.out.println("Please enter...\n"
                + "1 for Air\n"
                + "2 for Steel\n"
                + "3 for Water:\n");
    }

    public void printMaterialMessage() {
        System.out.println("Please enter your distance:\n");
    }

    public Stirng printSpeedMessage(Integer speedType, Double calculatedSpeed) {

        if (calculatedSpeed == -1.0) {
            return "\nINVALID DATA\n");h
            return;
        }

        switch (speedType) {
            case 1:
                System.out.println("This is the fastest speed");
            case 2:
                System.out.println("This is the medium speed");
            case 3:
                System.out.println("This is the slowest speed");
        }

        System.out.println("You went this fast: " + calculatedSpeed.toString());
    }

    public Integer getUserIntegerInput() {
        return scanner.nextInt();
    }

    public Double getUserDouble() {
        return scanner.nextDouble();
    }
}
