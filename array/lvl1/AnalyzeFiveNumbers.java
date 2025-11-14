import java.util.Scanner;
public class AnalyzeFiveNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) a[i] = in.nextInt();
        for (int v : a) {
            if (v > 0) {
                if (v % 2 == 0) System.out.println(v + " positive even");
                else System.out.println(v + " positive odd");
            } else if (v < 0) System.out.println(v + " negative");
            else System.out.println(v + " zero");
        }
        int first = a[0], last = a[4];
        if (first == last) System.out.println("first and last are equal");
        else if (first > last) System.out.println("first is greater than last");
        else System.out.println("first is less than last");
    }
}
