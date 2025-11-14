import java.util.Scanner;
public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long number = Math.abs(in.nextLong());
        int[] digits = new int[20];
        int idx = 0;
        while (number != 0) {
            digits[idx++] = (int)(number % 10);
            number /= 10;
        }
        for (int i = 0; i < idx; i++) System.out.println(digits[i]);
    }
}
