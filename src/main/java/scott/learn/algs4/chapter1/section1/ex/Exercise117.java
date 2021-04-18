package scott.learn.algs4.chapter1.section1.ex;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by lizhaok on 2021/2/23
 */
public class Exercise117 {
    public static void main(String[] args) {
          a();
          b();
          c();
    }

    public static void a () {
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001) {
            t = (9.0/t + t) / 2.0;
        }
        StdOut.printf("%.5f\n", t);
    }

    public static void b () {
        int sum = 0;
        for (int i = 1; i < 1000; i ++) {
            //StdOut.print("i =" + i + " ");
            for (int j = 0; j < i; j ++) {
                sum ++;
                //StdOut.print("j =" + j + " ");
                //StdOut.print(sum + " ");
            }
        }
        StdOut.println(sum);
    }

    public static void c() {
        int sum = 0;
        for (int i = 1; i < 1000; i *=2) {
            //StdOut.print("i =" + i + " ");
            for (int j = 0; j < 1000; j++) {
                //StdOut.print("j =" + j + " ");
                //StdOut.print(sum + " ");
                sum ++;
            }

        }


        StdOut.println(sum);
    }
}
