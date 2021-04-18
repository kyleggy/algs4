package scott.learn.algs4.chapter1.section1.creative;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by lizhaok on 2021/2/28
 */
public class Execrise1126 {

    public static void main(String[] args) {
        StdOut.println("Enter integer a:");
        int a = StdIn.readInt();

        StdOut.println("Enter integer b:");
        int b = StdIn.readInt();

        StdOut.println("Enter integer c:");
        int c = StdIn.readInt();

        ascend(a, b, c, 0);
        StdOut.println("After running ascend method:");

    }

    public static void ascend(Integer a, Integer b, Integer c, Integer t) {
        if (a > b) { t = a; a = b; b = t; }
        if (a > c) { t = a; a = c; c = t; }
        if (b > c) { t = b; b = c; c = t; };
        StdOut.printf("a: %d, b: %d, c: %d", a, b, c);
    }
}
