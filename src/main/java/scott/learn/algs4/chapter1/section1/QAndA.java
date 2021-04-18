package scott.learn.algs4.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by lizhaok on 2021/2/22
 */
public class QAndA {
    public static void main(String[] args) {
        //-2147483648
        StdOut.println(Math.abs(-2147483648));

        //Initialize a double variable to infinity
        double a = Double.POSITIVE_INFINITY;
        double b = Double.NEGATIVE_INFINITY;
        StdOut.println(a);
        StdOut.println(b);

        //Infinity
        StdOut.println(1.0/0.0);
    }
}
