import java.util.Scanner;
public class NumberGuessingGame {
    public static int guess() {
        return 1 + (int)(Math.random() * 100);
    }
    public static String feedback(int g, int target) {
        if (g > target) return "high";
        if (g < target) return "low";
        return "correct";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int g;
        while (true) {
            g = guess();
            String f = feedback(g, target);
            if (f.equals("correct")) {
                System.out.println(g);
                break;
            }
        }
    }
}
