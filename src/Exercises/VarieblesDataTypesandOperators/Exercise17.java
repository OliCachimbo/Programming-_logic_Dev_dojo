package Exercises.VarieblesDataTypesandOperators;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float feet = input.nextFloat();
        Float meter = feet * 0.3048f;
        System.out.println(feet + " feet is " + meter + " in meters");
    }
}
