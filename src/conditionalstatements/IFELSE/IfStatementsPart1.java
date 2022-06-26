package conditionalstatements.IFELSE;

import java.util.Scanner;

public class IfStatementsPart1 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        // parte 1

        /*System.out.println("hi, how older are thee");

        byte years = myObj.nextByte();

        if(years >= 18){
            System.out.println("thou are adult");
        }else{
            System.out.println("enjoy it while you can");
        }*/

        // parte 2

        /*System.out.println("hi input your salary");

        float salary = myObj.nextFloat(), percent;
        String percentage;

        if (salary>4500) {
            percent = 0.3f;
            percentage = "30% of your salary is ";
        } else {
            percent = 0.15f;
            percentage = "15% of your salary is ";
        }

        System.out.println(percentage.concat(String.valueOf(salary*percent)));*/

        // parte 3
        System.out.println("good everning, what is your name?");
        String name = myObj.nextLine();

        System.out.println("nice, now say your age");
        byte age = myObj.nextByte();

        if(age<=10){
            System.out.println(name.concat(" participará da categoria Infantil"));
        } else if (11<=age && age<=15  ) {
            System.out.println(name.concat(" participará da categoria Juvenil"));
        } else if (16<=age && age<=19) {
            System.out.println(name.concat(" participará da categoria Pré-adulto"));
        } else {
            System.out.println(name.concat(" participará da categoria Adulto"));
        }
    }
}