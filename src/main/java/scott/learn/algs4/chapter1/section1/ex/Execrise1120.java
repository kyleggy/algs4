package scott.learn.algs4.chapter1.section1.ex;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by lizhaok on 2021/2/27
 */
public class Execrise1120 {

    public static void main(String[] args) {
        StdOut.println(multipleN(4));
        StdOut.println(ln(4));
        StdOut.println(correctRecursiveLn(4));
    }

    public static double  ln(int N) {
       return Math.log(multipleN(N));
    }

    public static int multipleN(int N) {
        if ( N == 1) return 1;
        return N * multipleN(N-1);
    }

    //ln(n*x) = ln(n) + ln(x)
    public static double correctRecursiveLn(int N) {
        if (N == 1) return 0;
        return correctRecursiveLn(N - 1) + Math.log(N);
    }
}
