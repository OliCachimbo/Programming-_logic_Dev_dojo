package Exercises.VarieblesDataTypesandOperators;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float distance, timeTravel, speed, liters;

        System.out.println("input the time travel in hours");
        timeTravel = input.nextFloat();

        System.out.println("input the speed in kilometer per hour");
        speed = input.nextFloat();

        distance = timeTravel * speed;
        System.out.println(distance + " kilometers");
        liters = distance / 12;
        System.out.println("and thou need " + liters + " liters for the travel");
    }
}