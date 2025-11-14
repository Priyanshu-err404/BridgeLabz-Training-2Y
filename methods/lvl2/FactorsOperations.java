import java.util.Scanner;
public class FactorsOperations {
    public static int[] factors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) count++;
        int[] res = new int[count];
        int idx = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) res[idx++] = i;
        return res;
    }
    public static long sum(int[] arr) {
        long s = 0;
        for (int v : arr) s += v;
        return s;
    }
    public static long product(int[] arr) {
        long p = 1;
        for (int v : arr) p *= v;
        return p;
    }
    public static long sumOfSquares(int[] arr) {
        long s = 0;
        for (int v : arr) s += (long)v * v;
        return s;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n <= 0) return;
        int[] f = factors(n);
        for (int v : f) System.out.println(v);
        System.out.println(sum(f));
        System.out.println(sumOfSquares(f));
        System.out.println(product(f));
    }
}
