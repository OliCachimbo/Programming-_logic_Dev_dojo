package arrays;

public class MultiplicationNumbersInArrays {
    public static void main(String[] args) {

        // Exempli 1
        /*
        int[] numbersX = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        int[] numbersY = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int i = 0; i != numbersX.length && i != numbersY.length; i = i + 1){
            int multiplication = numbersX[i]*numbersY[i];
            System.out.println(multiplication);
        }
        */

        // Exempli 2
        int randomNum = (int) (Math.random() * 10 + 1);
        int[] numbersX = new int[randomNum];
        int[] numbersY = new int[randomNum];
        System.out.println("your array have ".concat(String.valueOf(randomNum)).concat(" length"));
        for (int i = 0; i != numbersX.length; i = i + 1) {
            int randomToV1 = (int) (Math.random() * 10 + 1), randomToV2 = (int) (Math.random() * 10 + 1);
            numbersX[i] = randomToV1;
            numbersY[i] = randomToV2;

            int multiplication = numbersX[i] * numbersY[i];
            System.out.println(multiplication);
        }
    }
}