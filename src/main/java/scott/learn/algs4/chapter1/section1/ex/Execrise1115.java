package scott.learn.algs4.chapter1.section1.ex;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * Created by lizhaok on 2021/2/27
 */
public class Execrise1115 {

    public static void main(String[] args) {
        StdOut.println("Please enter the size of arrays you want to return: ");
        int size = StdIn.readInt();

        StdOut.println("Please enter ints:");
        int[] inputs = null;
        while (!StdIn.isEmpty()) {
            inputs = StdIn.readAllInts();
        }

        Arrays.stream(historgram(inputs, size)).forEach(StdOut::println);

    }

    public static int[] historgram(int[] a, int M) {
        int[] convert = new int[M];
        for (int i = 0 ; i <  M; i ++) {
            int count = 0;
            for (int j = 0; j < a.length; j ++) {
                if (a[j] == i) {
                    count ++;
                }
            }
            convert[i] = count;
        }
        return convert;
    }
}
