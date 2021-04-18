package scott.learn.algs4.chapter1.section1.ex;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by lizhaok on 2021/2/23
 */
public class Exercise116 {
    public static void main(String[] args) {
           int f = 0;
           int g = 1;
           for (int i = 0; i <= 15; i ++) {
               StdOut.println(f);
               f = f + g;
               g = f - g;
           }

    }
}
