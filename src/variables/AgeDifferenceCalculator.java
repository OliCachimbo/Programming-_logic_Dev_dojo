package variables;

import java.util.Scanner;

public class AgeDifferenceCalculator {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("input the first age");

        byte firstAge = myObj.nextByte();

        System.out.println("input the secundAge");

        byte secundAge = myObj.nextByte();

        short difference = (byte)(firstAge-secundAge);

        System.out.println("the age difference is "+difference+" years old");
    }
}
