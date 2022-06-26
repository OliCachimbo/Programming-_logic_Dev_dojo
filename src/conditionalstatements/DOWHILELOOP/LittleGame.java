package conditionalstatements.DOWHILELOOP;

import java.util.Scanner;

public class LittleGame {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        int randomNum, attempt;
        randomNum = (int) (Math.random()*11);

        do {
            System.out.println("discover de number!");
            attempt = myObj.nextInt();
            if (attempt > randomNum){
                System.out.println("smaller");
            } else if (attempt < randomNum) {
                System.out.println("larger");
            } else {
                System.out.println("you got it right, the number is "+randomNum);
            }
        } while (attempt != randomNum);
    }
}