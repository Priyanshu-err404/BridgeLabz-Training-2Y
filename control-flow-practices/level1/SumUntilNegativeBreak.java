import java.util.Scanner;
public class SumUntilNegativeBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        while (true) {
            double n = input.nextDouble();
            if (n <= 0) break;
            total += n;
        }
        System.out.println(total);
    }
}
