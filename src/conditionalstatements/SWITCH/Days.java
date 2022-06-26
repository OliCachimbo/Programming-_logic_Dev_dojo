package conditionalstatements.SWITCH;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        byte day = myObj.nextByte();

        switch (day) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid day");
        }

                /*switch (day) {
                    case 1 -> System.out.println("sunday");
                    case 2 -> System.out.println("monday");
                    case 3 -> System.out.println("tuesday");
                    case 4 -> System.out.println("wednesday");
                    case 5 -> System.out.println("thursday");
                    case 6 -> System.out.println("friday");
                    case 7 -> System.out.println("saturday");
                    default -> System.out.println("invalid day");
                }*/
    }
}
