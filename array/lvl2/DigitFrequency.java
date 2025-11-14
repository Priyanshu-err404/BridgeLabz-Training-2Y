import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long number = Math.abs(in.nextLong());
        int[] freq = new int[10];
        if (number == 0) freq[0] = 1;
        while (number != 0) {
            freq[(int)(number % 10)]++;
            number /= 10;
        }
        for (int d = 0; d < 10; d++) System.out.println(d + " " + freq[d]);
    }
}
