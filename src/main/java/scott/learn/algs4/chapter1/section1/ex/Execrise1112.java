package scott.learn.algs4.chapter1.section1.ex;

/**
 * Created by lizhaok on 2021/2/26
 */
public class Execrise1112 {

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i ++) {
            a[i] = 9 - i;
        }

        for (int i = 0; i < 10; i ++) {
            a[i] = a[a[i]];
        }

        for (int i = 0; i < 10; i ++) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i ++) {
            System.out.println(a[i]);
        }
    }
}
