import java.util.Scanner;
public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        boolean smallest = a < b && a < c;
        System.out.println("Is the first number the smallest? " + smallest);
    }
}
