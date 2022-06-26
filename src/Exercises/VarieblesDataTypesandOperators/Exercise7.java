package Exercises.VarieblesDataTypesandOperators;

public class Exercise7 {
    public static void main(String[] args) {
        float x = 2, y = 3;
        x = y;
        y = x;
        System.out.println((1 / x) + " and " + (1 / y));
    }
}