package Exercises.VarieblesDataTypesandOperators;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*float radius = input.nextFloat();
        float pi = 3.1415926f;
        float circleArea = pi*radius*radius;
        System.out.println(circleArea);*/

        // Outra forma
        Double pi = Math.PI;
        byte c;
        do {
            Double radius = input.nextDouble();
            Double circleArea = pi*radius*radius;
            System.out.println(circleArea);
            System.out.println("do you wish continue, input 1 to yes or 0 to no");
            c = input.nextByte();
        } while (c != 0);
    }
}
