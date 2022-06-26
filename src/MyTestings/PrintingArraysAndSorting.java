package MyTestings;

import java.util.Arrays;

public class PrintingArraysAndSorting {
    public static void main(String[] args) {

        // Printing
        double[] doubles = new double[]{1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println(Arrays.toString(doubles));

        char[][] chars = new char[][]{{'a', 'e', 'i', 'o', 'u'}, {'b', 'c', 'd', 'f', 'g'}};
        System.out.println(Arrays.deepToString(chars));

        boolean[][][] booleans = {{{true}, {false}, {true}}};
        System.out.println(Arrays.deepToString(booleans));

        int[][][] ints = {{{1}}, {{2}}, {{3}}};
        System.out.println(Arrays.deepToString(ints));

        // Sorting
        int [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
