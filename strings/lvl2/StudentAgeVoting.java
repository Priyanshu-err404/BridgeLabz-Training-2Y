import java.util.Scanner;
import java.util.Random;
public class StudentAgeVoting {
    public static int[] randomAges(int n) {
        Random r = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = 10 + r.nextInt(90); // 10..99
        return arr;
    }
    public static String[][] canVoteArray(int[] ages) {
        String[][] out = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int a = ages[i];
            if (a < 0) { out[i][0] = String.valueOf(a); out[i][1] = "false"; }
            else out[i][0] = String.valueOf(a); out[i][1] = String.valueOf(a >= 18);
        }
        return out;
    }
    public static void displayTable(String[][] table) {
        for (int i = 0; i < table.length; i++) System.out.println(table[i][0] + " " + table[i][1]);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ages = randomAges(n);
        String[][] res = canVoteArray(ages);
        displayTable(res);
    }
}
