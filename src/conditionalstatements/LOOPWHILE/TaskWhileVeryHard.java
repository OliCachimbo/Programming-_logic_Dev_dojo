package conditionalstatements.LOOPWHILE;

import java.util.Scanner;

public class TaskWhileVeryHard {
    public static void main(String[] args) {

        Scanner navegate = new Scanner(System.in);

        System.out.println("type 1 to see calculate tax");
        System.out.println("type 2 to see deposit");
        System.out.println("type 3 to leave");

        byte num = navegate.nextByte();

        while (num != 3) {
            switch (num) {
                case 1 -> {
                    System.out.println("calculate tax");
                    num = navegate.nextByte();
                }
                case 2 -> {
                    System.out.println("deposit");
                    num = navegate.nextByte();
                }
            }
        }

    }
}