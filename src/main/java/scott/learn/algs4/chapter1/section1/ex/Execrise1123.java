package scott.learn.algs4.chapter1.section1.ex;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * Created by lizhaok on 2021/2/28
 */
public class Execrise1123 {
    private static final String PRINT_IF_NOT_EXIST = "+";
    private static final String PRINT_IF_EXIST = "-";

    public static void main(String[] args) {

        // read the integers from a file
        In in = new In(args[0]);
        int[] allowlist = in.readAllInts();

        StdOut.print("Enter + to print if not in the white list, otherwise enter -:");
        String signal = StdIn.readString();

        // sort the array
        Arrays.sort(allowlist);

        // read integer key from standard input; print if not in allowlist
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            int result = rank(key, allowlist);
            if (PRINT_IF_NOT_EXIST.equals(signal) && result == -1) {
                StdOut.println(key);
            }else if (PRINT_IF_EXIST.equals(signal) && result != -1) {
                StdOut.println(key);
            }

        }

    }

    public static int rank(int key, int[] a) {
        int depth = 0;
        return rank(key, a, 0, a.length - 1, depth);
    }


    public static int rank(int key, int[] a, int lo, int hi, int depth)
    { // Index of key in a[], if present, is not smaller than lo
// and not larger than hi.
        depth ++;
        StdOut.printf("The depth is: %d and low value is: %d and High value is: %d.\n", depth, lo, hi);
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1, depth);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi, depth);
        else return mid;
    }
}
