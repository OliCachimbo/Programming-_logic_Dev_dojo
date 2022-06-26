package Exercises.ConditionsStatements;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sum = 0;
        for (int i = 1; i <= 4; i = i + 1) {
            float grade = input.nextFloat();
            sum = sum + grade;
        }
        float average = sum / 4;
        System.out.println(average);
        if (average < 5.0f) {
            System.out.println("REPROVADO!!!");
        } else if (average > 5.0f) {
            System.out.println("Para béns, aprovado");
        } else {
            System.out.println("Recuperação");
        }
    }
}
