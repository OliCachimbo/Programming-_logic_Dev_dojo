package Exercises.ConditionsStatements;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt(), n2 = input.nextInt(), n3 = input.nextInt(), n4 = input.nextInt(), n5 = input.nextInt();
        if (n1%2 == 0 || n1%3 == 0){
            System.out.println(n1);
        }
        if (n2%2 == 0 || n2%3 == 0){
            System.out.println(n2);
        }
        if (n3%2 == 0 || n3%3 == 0){
            System.out.println(n3);
        }
        if (n4%2 == 0 || n4%3 == 0){
            System.out.println(n4);
        }
        if (n5%2 == 0 || n5%3 == 0){
            System.out.println(n5);
        }
    }
}