import java.util.Scanner;
public class FactorsStoreArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 10;
        int[] factors = new int[max];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (idx == max) {
                    int[] t = new int[max * 2];
                    System.arraycopy(factors, 0, t, 0, max);
                    factors = t;
                    max *= 2;
                }
                factors[idx++] = i;
            }
        }
        for (int i = 0; i < idx; i++) System.out.println(factors[i]);
    }
}
