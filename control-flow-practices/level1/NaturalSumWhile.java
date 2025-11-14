import java.util.Scanner;
public class NaturalSumWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 0) {
            int formula = n * (n + 1) / 2;
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            System.out.println(formula + " " + sum);
        }
    }
}
