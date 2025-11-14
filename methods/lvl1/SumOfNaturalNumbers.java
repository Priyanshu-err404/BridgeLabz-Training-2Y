import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static long sumOfNaturalNumbers(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = sumOfNaturalNumbers(n);
        System.out.println(sum);
        scanner.close();
    }
}
