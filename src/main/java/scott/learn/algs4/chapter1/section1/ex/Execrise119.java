package scott.learn.algs4.chapter1.section1.ex;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by lizhaok on 2021/2/26
 */
public class Execrise119 {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(3));
        StdOut.println(convertIntegerToBinary(3));
        int[] a = new int[10];
    }

    public static String convertIntegerToBinary(int n) {
        String s = "";
        for (int i = n; i > 0; i/=2) {
            s = (n%2) + s;
        }
        return s;
    }
}
