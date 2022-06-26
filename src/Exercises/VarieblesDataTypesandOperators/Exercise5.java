package Exercises.VarieblesDataTypesandOperators;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float pi = 3.1415926f;

        System.out.println("input the radius");
        float radius = input.nextFloat();

        System.out.println("input the height");
        float height = input.nextFloat();

        float cylinderVolume = (float) (pi * (Math.pow(radius, 2)) * height);
        System.out.println(cylinderVolume + " cm^3");
    }
}