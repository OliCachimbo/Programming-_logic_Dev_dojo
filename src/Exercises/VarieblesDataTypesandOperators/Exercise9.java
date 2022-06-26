package Exercises.VarieblesDataTypesandOperators;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        float width, length, height, baseArea, prismVolume;

        Scanner input = new Scanner(System.in);

        System.out.println("inform the width: ");
        width = input.nextFloat();

        System.out.println("inform the length: ");
        length = input.nextFloat();

        System.out.println("inform the height: ");
        height = input.nextFloat();

        baseArea = width * length;
        prismVolume = baseArea * height;

        System.out.println("the prism volume is " + prismVolume);
    }
}