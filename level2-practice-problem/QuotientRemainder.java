import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int q = n1 / n2;
        int r = n1 % n2;
        System.out.println("The Quotient is " + q + " and Reminder is " + r + " of two number " + n1 + " and " + n2);
    }
}
