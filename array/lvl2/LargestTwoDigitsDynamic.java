import java.util.Scanner;
public class LargestTwoDigitsDynamic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long number = Math.abs(in.nextLong());
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int idx = 0;
        while (number != 0) {
            if (idx == maxDigit) {
                int[] tmp = new int[maxDigit + 10];
                System.arraycopy(digits, 0, tmp, 0, maxDigit);
                digits = tmp;
                maxDigit += 10;
            }
            digits[idx++] = (int)(number % 10);
            number /= 10;
        }
        int largest = -1, second = -1;
        for (int i = 0; i < idx; i++) {
            int d = digits[i];
            if (d > largest) { second = largest; largest = d; }
            else if (d > second && d != largest) second = d;
        }
        if (largest == -1) largest = 0;
        if (second == -1) second = largest;
        System.out.println(largest);
        System.out.println(second);
    }
}
