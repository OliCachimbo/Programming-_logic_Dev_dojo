package Exercises.VarieblesDataTypesandOperators;

import java.util.Scanner;

public class Exercise3and4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float celsius, fahrenheit;

        System.out.println("input your celsius value: ");
        celsius = input.nextFloat();

        fahrenheit = (9 / 5f * celsius) + 32;
        System.out.println(celsius + " is " + fahrenheit + " in fahrenheit");

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("input your fahrenheit value: ");
        fahrenheit = input.nextFloat();

        celsius = (fahrenheit - 32) * (5 / 9f);
        System.out.println(fahrenheit + " is " + celsius + " in celsius");
    }
}