import java.util.Scanner;
public class Multiplication6to9Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] res = new int[4];
        for (int i = 6, j = 0; i <= 9; i++, j++) res[j] = n * i;
        for (int i = 6, j = 0; i <= 9; i++, j++)
            System.out.println(n + " * " + i + " = " + res[j]);
    }
}
