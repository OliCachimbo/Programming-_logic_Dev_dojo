package Exercises.VarieblesDataTypesandOperators;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float baseSalary, percentageOfReadjustment, newSalary;

        System.out.println("inform the salary");
        baseSalary = input.nextFloat();

        System.out.println("inform the percentage of readjustment");
        percentageOfReadjustment = input.nextFloat();

        newSalary = baseSalary + (baseSalary * percentageOfReadjustment * 0.01f);
        System.out.println("the new salary is " + newSalary);
    }
}