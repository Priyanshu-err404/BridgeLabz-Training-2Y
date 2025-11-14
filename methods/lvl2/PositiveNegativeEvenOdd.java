import java.util.Scanner;
public class PositiveNegativeEvenOdd {
    public static boolean isPositive(int n) { return n > 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int a, int b) { return a > b ? 1 : (a == b ? 0 : -1); }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) a[i] = in.nextInt();
        for (int v : a) {
            if (v > 0) {
                if (isEven(v)) System.out.println(v + " positive even");
                else System.out.println(v + " positive odd");
            } else if (v < 0) System.out.println(v + " negative");
            else System.out.println(v + " zero");
        }
        int cmp = compare(a[0], a[4]);
        if (cmp == 0) System.out.println("first and last are equal");
        else if (cmp > 0) System.out.println("first is greater than last");
        else System.out.println("first is less than last");
    }
}
