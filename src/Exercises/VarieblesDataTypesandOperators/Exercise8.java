package Exercises.VarieblesDataTypesandOperators;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        float value, tax, time, installment;

        Scanner input = new Scanner(System.in);

        value = input.nextFloat();

        tax = input.nextFloat();

        time = input.nextFloat();

        installment = value + (value * (tax / 100) * time);
        System.out.println(installment);
    }
}