package scott.learn.algs4.chapter1.section1.ex;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by lizhaok on 2021/2/27
 */
public class Execrise1116 {

    public static void main(String[] args) {
        //33
        StdOut.println("" + 3 + "" + 3);
        StdOut.println(exR1(6));
    }

    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n-3) + n + exR1(n-2) + n;
    }
}
