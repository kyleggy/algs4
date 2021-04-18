package scott.learn.algs4.chapter1.section1.ex;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by lizhaok on 2021/2/28
 */
public class Execrise1124 {

    public static void main(String[] args) {
        StdOut.println("Please enter two integers: ");
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int result = gcd(a, b);
        StdOut.println("The biggest common divisor is " + result);
    }

    public static int gcd(int p, int q)
    {
        StdOut.println(p + " and " + q);
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
}
