package Exercises.ConditionsStatements;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        if (n1 < n2 && n2 < n3) {
            System.out.println(n1 + " " + n2 + " " + n3);
        } else if (n2 < n1 && n1 < n3) {
            System.out.println(n2 + " " + n1 + " " + n3);
        } else if (n3 < n1 && n1 < n2) {
            System.out.println(n3 + " " + n1 + " " + n2);
        } else if (n1 < n3 && n3 < n2) {
            System.out.println(n1 + " " + n3 + " " + n2);
        } else if (n2 < n3 && n3 < n1) {
            System.out.println(n2 + " " + n3 + " " + n2);
        } else {
            System.out.println(n3 + " " + n2 + " " + n1);
        }
        */

        System.out.println("inform the quantity of numbers");
        int size = input.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i = i + 1) {
            numbers[i] = input.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
