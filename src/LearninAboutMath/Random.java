package LearninAboutMath;

public class Random {
    public static void main(String[] args) {
        while (true) {
            byte random = (byte) (Math.random() * 10 + 1);
            System.out.println(random);
        }
    }
}