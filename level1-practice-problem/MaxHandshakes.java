import java.util.Scanner;
public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int combinations = (n * (n - 1)) / 2;
        System.out.println("Maximum handshakes possible are " + combinations);
    }
}
