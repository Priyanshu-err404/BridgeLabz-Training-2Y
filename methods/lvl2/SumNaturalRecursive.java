import java.util.Scanner;
public class SumNaturalRecursive {
    public static long sumRecursive(int n) {
        if (n <= 0) return 0;
        return n + sumRecursive(n - 1);
    }
    public static long sumFormula(int n) {
        return (long)n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 0) return;
        long r = sumRecursive(n);
        long f = sumFormula(n);
        System.out.println(r);
        System.out.println(f);
        System.out.println(r == f);
    }
}
