package conditionalstatements.IFELSE;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        // Exercício 1
        /* System.out.println("hi user, you can input your login here: ");

        String login = input.next();

        if (login.equals("") || login.equalsIgnoreCase("admin") || login.equalsIgnoreCase("administrator")){
            System.out.println("you can not do this, please try again with other login name");
        } else {
            System.out.println("Thanks " + login + " you have do your registration with sucess!");
        } */

        // Exercício 2

        /* System.out.println("olá cidadão, insira os seus dados a seguir para fazer o alistamento");

        System.out.println("Sexo: ");
        String male, female;
        male = "masculino";
        female = "feminino";
        String sex = input.next();

        System.out.println("idade: ");
        byte age = input.nextByte();

        if (sex.equalsIgnoreCase(male) && age == 18){
            System.out.println("você está apto a fazer o alistamento obrigatório");
        }
        else if (sex.equalsIgnoreCase(male) && age < 18) {
            System.out.println("você ainda não está apto a fazer o alistamento obrigatório");
        }
        else if (sex.equalsIgnoreCase(female) && age == 18) {
            System.out.println("você está apta a fazer o alistamento, mas não é obrigatório");
        }
        else {
            System.out.println("você ainda não está apta a fazer o alistamento, lembresse que não é obrigatório");
        } */

        // Exercício 3

        System.out.println("insira um valor de 1 à 7, e lhe daremos o dia correspondente da samana");

        byte numWeak = input.nextByte();

        if (numWeak == 1) {
            System.out.println("domingo");
        } else if (numWeak == 2) {
            System.out.println("segunda-feira");
        } else if (numWeak == 3) {
            System.out.println("terça-feira");
        } else if (numWeak == 4) {
            System.out.println("quarta-feira");
        } else if (numWeak == 5) {
            System.out.println("quinta-feira");
        } else if (numWeak == 6) {
            System.out.println("sexta-feira");
        } else if (numWeak == 7) {
            System.out.println("sábado");
        } else {
            System.out.println("dia inválido");
        }

    }
}
