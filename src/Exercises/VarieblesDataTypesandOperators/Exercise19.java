package Exercises.VarieblesDataTypesandOperators;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float voltage, current, resistance, electricPower;

        System.out.println("what thee wish to calculate: resistance, voltage, current or electric-power: ");
        String option = input.next();

        switch (option) {
            case "resistance" -> {
                System.out.println("inform the voltage in Volt");
                voltage = input.nextFloat();
                System.out.println("inform the current in Ampere");
                current = input.nextFloat();
                resistance = voltage / current;
                System.out.println(resistance + " Ohm");
            }
            case "voltage" -> {
                System.out.println("inform the resistance in Ohm");
                resistance = input.nextFloat();
                System.out.println("inform the current in Ampere");
                current = input.nextFloat();
                voltage = resistance * current;
                System.out.println(voltage + " Volt");
            }
            case "current" -> {
                System.out.println("inform the voltage in Volt");
                voltage = input.nextFloat();
                System.out.println("inform the resistance in Ohm");
                resistance = input.nextFloat();
                current = voltage / resistance;
                System.out.println(current + " Ampere");
            }
            case "electric-power" -> {
                System.out.println("inform the voltage in Volt");
                voltage = input.nextFloat();
                System.out.println("inform the current in Ampere");
                current = input.nextFloat();
                electricPower = voltage * current;
                System.out.println(electricPower + " Watt");
            }
            default -> throw new IllegalStateException("Unexpected value: " + option);
        }
    }
}
