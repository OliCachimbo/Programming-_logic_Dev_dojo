package conditionalstatements.SWITCH;

import java.util.Scanner;

public class BankAccounts {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("hi dear, what type of account do you wise to create");
        System.out.println("savings account type 1");
        System.out.println("checking account type 2");
        System.out.println("investment account type 3");

        byte account = myObj.nextByte();

        switch (account) {
            case 1 -> System.out.println("savings account: 0,05%");
            case 2 -> System.out.println("checking account: 0,02%");
            case 3 -> System.out.println("investment account: 0,1%");
            default -> System.out.println("this account type do not exist");
        }
    }
}
