import java.util.Scanner;
public class MaxOfThree {
    public static int max(int a, int b, int c) {
        int m = a;
        if (b > m) m = b;
        if (c > m) m = c;
        return m;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt(), b=in.nextInt(), c=in.nextInt();
        System.out.println(max(a,b,c));
    }
}
