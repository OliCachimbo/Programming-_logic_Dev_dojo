package Exercises.VarieblesDataTypesandOperators;

import java.util.Scanner;

public class Exercise11and12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float dolar, real;

        System.out.println("inform the value in dolar");
        dolar = input.nextFloat();

        real = dolar*5.14f;
        System.out.println("R$ "+real);

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("inform the value in real");
        real = input.nextFloat();

        dolar = (real*(1/5.14f));
        System.out.println("US$ "+dolar);


    }
}
