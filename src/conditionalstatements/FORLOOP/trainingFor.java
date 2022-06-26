package conditionalstatements.FORLOOP;

import java.util.Scanner;

public class trainingFor {
    public static void main(String[] args) {

        // Part 1
        for (int i = 15; i <= 200; i = i + 1) {
            System.out.println(i * i);
        }

        // Part 2
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i * num);
        }
    }
}