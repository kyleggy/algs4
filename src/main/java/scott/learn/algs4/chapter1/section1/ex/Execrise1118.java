package scott.learn.algs4.chapter1.section1.ex;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by lizhaok on 2021/2/27
 */
public class Execrise1118 {

    public static void main(String[] args) {
        StdOut.println(mystery(2, 25));
        StdOut.println(mystery(3, 11));

        StdOut.println(mmystery(2, 25));
        StdOut.println(mmystery(3, 11));
    }

    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b /2);
        return mystery(a + a, b / 2) + a;
    }

    public static int mmystery(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mmystery(a * a, b /2);
        return mmystery(a * a, b / 2) * a;
    }
}
