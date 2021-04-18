package scott.learn.algs4.chapter1.section1.ex;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by lizhaok on 2021/2/23
 */
public class Exercise115 {

    public static void main(String[] args) {
        double x = StdIn.readDouble();
        double y = StdIn.readDouble();
        if( ( 0 < x && x < 1) && (0 < y && y < 1)) {
            StdOut.print(true);
        }else {
            StdOut.print(false);
        }

    }
}
