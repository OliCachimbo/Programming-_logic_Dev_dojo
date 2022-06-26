package Exercises.VarieblesDataTypesandOperators;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short number = input.nextShort();
        System.out.println(number +
                System.lineSeparator() +
                (number - 1) +
                System.lineSeparator() +
                (number + 1));
    }
}
