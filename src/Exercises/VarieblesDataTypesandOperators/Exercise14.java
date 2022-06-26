// addend plus addend equal sum
// minuend minus subtrahend equals difference
// multiplicand times multiplier equals product
// dividend divided divisor equals quotient

package Exercises.VarieblesDataTypesandOperators;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float x = input.nextFloat(), y = input.nextFloat(), sum, difference, product, quotient;

        sum = x + y;
        difference = x - y;
        product = x * y;
        quotient = x / y;

        System.out.println(sum + System.lineSeparator() + difference + System.lineSeparator() + product + System.lineSeparator() + quotient);
    }
}