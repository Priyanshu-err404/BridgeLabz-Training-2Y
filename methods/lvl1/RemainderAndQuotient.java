import java.util.Scanner;

public class RemainderAndQuotient {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] { remainder, quotient };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int divisor = scanner.nextInt();
        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println(result[1]);
        System.out.println(result[0]);
        scanner.close();
    }
}
