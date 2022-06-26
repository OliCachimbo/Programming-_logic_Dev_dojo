package arrays;

import java.util.Scanner;

public class AverageOfExamGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("determine the number of exam grade: ");
        byte arraySize = input.nextByte();

        float[] examGrades = new float[arraySize];

        float sumGrades = 0, averageGrade;

        System.out.println("input the exam grades");

        for (int i = 0; i != examGrades.length; i = i + 1) {
            float grades = input.nextFloat();

            examGrades[i] = grades;
            System.out.println("the exam grade ".concat(String.valueOf(i + 1)).concat(" is ").concat(String.valueOf(examGrades[i])));

            sumGrades = sumGrades + examGrades[i];
        }
        averageGrade = (sumGrades / examGrades.length);

        System.out.println("the exam average is ".concat(String.valueOf(averageGrade)));
    }
}