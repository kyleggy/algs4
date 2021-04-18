package scott.learn.algs4.chapter1.section1.ex;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by lizhaok on 2021/2/27
 */
public class Execrise1119 {

    public static long F(int N) {
        if (N == 0) return 0;
        if ( N == 1) return 1;
        return F(N-1) + F(N-2);
    }

    public static void main(String[] args) {
        long[] tempSave = new long[100];
        for (int N = 0 ; N < 100; N ++) {
            tempSave[N] = FSaveArray(N, tempSave);
            StdOut.println(N + " " + tempSave[N]);
        }
    }

    public static long FSaveArray(int N, long[] saveArray) {
        if (N == 0) return 0;
        if ( N == 1) return 1;
        return saveArray[N -1] + saveArray[N -2];
    }
}
