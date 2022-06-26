package Exercises.VarieblesDataTypesandOperators;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("inform the distance in kilometers");
        float speed, distance = input.nextFloat(), time;

        System.out.println("inform the time in hours");
        time = input.nextFloat();

        speed = (distance/1000) / (time/3600);
        System.out.println(speed + "meter per seconds");
    }
}