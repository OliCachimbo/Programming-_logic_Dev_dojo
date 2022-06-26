package Exercises.VarieblesDataTypesandOperators;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("inform the radius of the sphere");
        double radius = input.nextDouble(), volumeSphere;

        volumeSphere = (4 / 3f) * Math.PI * Math.pow(radius, 3);
        System.out.println(volumeSphere);
        System.out.println(Math.pow(2, (1/2f)));
    }
}
