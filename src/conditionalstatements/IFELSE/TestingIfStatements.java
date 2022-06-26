package conditionalstatements.IFELSE;

public class TestingIfStatements {
    public static void main(String[] args) {

        boolean condition;

        byte randomNum1, randomNum2;

        randomNum1 = (byte)(Math.random()*11);
        randomNum2 = (byte)(Math.random()*11);

        System.out.println("it's randomNum1 ".concat(String.valueOf(randomNum1)));
        System.out.println("it's randomNum2 ".concat(String.valueOf(randomNum2)));

        condition = randomNum1>randomNum2;

        if(condition){
            System.out.println("randomNum1>randomNum2");
        } else if (randomNum1==randomNum2) {
            System.out.println("randomNum1 = randomNum2");
        } else {
            System.out.println("randomNum1<randomNum2");
        }
    }
}
