import java.util.Scanner;
public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int greatest = 1;
        int counter = number - 1;
        while (counter >= 1) {
            if (number % counter == 0) {
                greatest = counter;
                break;
            }
            counter--;
        }
        System.out.println(greatest);
    }
}
