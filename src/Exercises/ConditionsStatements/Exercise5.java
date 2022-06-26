package Exercises.ConditionsStatements;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (1 < number && number < 9) {
            System.out.println("within the allowed value");
        } else {
            System.out.println("out of the allowed value");
        }
    }
}
