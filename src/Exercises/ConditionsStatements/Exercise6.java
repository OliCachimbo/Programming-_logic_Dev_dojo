package Exercises.ConditionsStatements;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt()*2;

        if (number >= 30){
            System.out.println(number);
        }
    }
}
