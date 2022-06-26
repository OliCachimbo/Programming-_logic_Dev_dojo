package conditionalstatements.LOOPWHILE;

import java.util.Scanner;

public class OddNumQuest {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();

        int i = 0;

        while (num>=i){
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i = i + 1;
        }
    }
}
