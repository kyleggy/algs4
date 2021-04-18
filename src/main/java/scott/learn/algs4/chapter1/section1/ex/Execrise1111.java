package scott.learn.algs4.chapter1.section1.ex;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by lizhaok on 2021/2/26
 */
public class Execrise1111 {

    public static void main(String[] args) {
        boolean[][] booleans = new boolean[4][5];
        for (int i = 0; i < booleans.length; i ++) {
            for (int j = 0; j < booleans[i].length; j ++) {
                if (i % 2 == 0) {
                    booleans[i][j] = true;
                } else {
                    booleans[i][j] = false;
                }

            }
        }
        printBooleanArrays(booleans);
    }

    public static void printBooleanArrays(boolean[][] booleans) {
        for (int i = 0; i < booleans.length; i ++) {
            for (int j = 0; j < booleans[i].length; j ++) {
                if (booleans[i][j] == true) {
                    StdOut.println("Row:" + (i + 1) + ", Column: " + (j + 1) + ", Value: " + " *; ");
                } else {
                    StdOut.println("Row:" + (i + 1) + ", Column: " + (j + 1) + ", Value: " + "  ;");
                }
            }

        }

    }

}
