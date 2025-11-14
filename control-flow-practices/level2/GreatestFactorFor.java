import java.util.Scanner;
public class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int greatest = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatest = i;
                break;
            }
        }
        System.out.println(greatest);
    }
}
