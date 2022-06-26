package Exercises.VarieblesDataTypesandOperators;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        int x, square, cube, tenthPower;

        Scanner input = new Scanner(System.in);
        x = input.nextInt();

        square = (int) Math.pow(x, 2);
        cube = (int) Math.pow(x, 3);
        tenthPower = (int) Math.pow(x, 10);
        System.out.println(square + System.lineSeparator() + cube + System.lineSeparator() + tenthPower);
        System.out.println(square + cube + tenthPower);
    }
}