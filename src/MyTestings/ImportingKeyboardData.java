package MyTestings;

import java.util.Scanner;

public class ImportingKeyboardData {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("say your name");

        String name = keyboard.nextLine();

        System.out.println("hi ".concat(name));
    }
}
