package scott.learn.algs4.chapter1.section1.ex;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by lizhaok on 2021/2/27
 */
public class Execrise1121 {

    public static void main(String[] args) {
        StdOut.println("Enter a name, two integers: ");

        while (StdIn.hasNextLine()) {
            String name = StdIn.readString();
            int a = StdIn.readInt();
            int b = StdIn.readInt();

            double c = (double)a/ (double) b;
            StdOut.printf("%8s", name);
            StdOut.printf("%8d", a);
            StdOut.printf("%8d", b);
            StdOut.printf("%8.3f. \n", c);
        }

    }


}
