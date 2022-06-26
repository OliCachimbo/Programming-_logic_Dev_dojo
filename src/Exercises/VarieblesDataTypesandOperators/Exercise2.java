package Exercises.VarieblesDataTypesandOperators;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hoursWorked, workHourValue, discountPercentage, baseSalary, totalDiscounts, netSalary;

        System.out.println("input your hours worked");
        hoursWorked = input.nextDouble();

        System.out.println("input your work hour value");
        workHourValue = input.nextDouble();

        baseSalary = hoursWorked * workHourValue;
        System.out.println("your base salary is ".concat(String.valueOf(baseSalary)));

        System.out.println("what is your discount percentage");
        discountPercentage = input.nextDouble();

        totalDiscounts = 0.01*discountPercentage*baseSalary;
        System.out.println("total discounts is ".concat(String.valueOf(totalDiscounts)));

        netSalary = baseSalary-totalDiscounts;
        System.out.println("your net salary is ".concat(String.valueOf(netSalary)));
    }
}