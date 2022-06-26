package conditionalstatements.LOOPWHILE;

import java.util.Scanner;

public class AccountAccess {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        String login, password,loginAccess, passwordAccess;

        System.out.println("register your login");
        login = myObj.next();

        System.out.println("register your password");
        password = myObj.next();

        boolean showing = true;

        while (showing){
            System.out.println("input your login");
            loginAccess = myObj.next();

            System.out.println("input your password");
            passwordAccess = myObj.next();
            if (loginAccess.equals(login)  && password.equals(passwordAccess) ){
                System.out.println("allowed access");
                showing = false;
                break;
            }
            System.out.println("access not allowed");
        }
        System.out.println("finish");

    }
}
