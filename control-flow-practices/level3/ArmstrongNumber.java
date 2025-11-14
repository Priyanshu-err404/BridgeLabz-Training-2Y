import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int original = number, sum = 0;
        while (original != 0) {
            int digit = original % 10;
            sum += digit * digit * digit;
            original /= 10;
        }
        if (sum == number) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    }
}
