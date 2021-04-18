package scott.learn.algs4.chapter1.section1.ex;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by lizhaok on 2021/2/27
 */
public class Execrise1114 {

    public static void main(String[] args) {
        StdOut.println("Enter integer");
        int a = StdIn.readInt();
        System.out.println(lg(a));

    }

    public static int lg(int N) {
        int value = 1;
        if ( N == 1) {
            return 0;
        }

        if ( N == 2 || N == 3) {
            return 1;
        }
        do {
            value ++;
            N = N /2;
        }while (N / 2 != 1);

        return value;
    }
}
