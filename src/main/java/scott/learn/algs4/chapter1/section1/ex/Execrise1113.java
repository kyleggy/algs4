package scott.learn.algs4.chapter1.section1.ex;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by lizhaok on 2021/2/27
 */
public class Execrise1113 {

    public static void main(String[] args) {
        int[][] ints = new int[3][4];
        for (int i = 0; i < ints.length; i ++) {
            for (int j = 0; j < ints[i].length; j ++) {
                ints[i][j] = i * j;
            }
        }
        printNormal(ints);
        printTransposition(ints);

    }

    public static void printTransposition(int[][] ints) {
        int rowLength = ints.length;
        int columnLength = ints[0].length;

        int[][] transpositionArray = new int[columnLength][rowLength];
        for (int i = 0; i < ints.length; i ++) {
            for (int j = 0; j < ints[i].length; j++) {
                transpositionArray[j][i] = ints[i][j];
            }
        }

        System.out.println("Print transposition Array");
        printNormal(transpositionArray);

    }

    public static void printNormal(int[][] ints) {
        for (int i = 0; i < ints.length; i ++) {
            for (int j = 0; j < ints[i].length; j ++) {
                StdOut.println("Row:" + (i + 1) + ", Column: " + (j + 1) + ", Value: " + ints[i][j] + "; ");
            }
        }
    }

}
