import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static String computerChoice(Random r) {
        int v = r.nextInt(3);
        return v == 0 ? "rock" : (v == 1 ? "paper" : "scissors");
    }
    public static int winner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if (user.equals("rock") && comp.equals("scissors")) return 1;
        if (user.equals("scissors") && comp.equals("paper")) return 1;
        if (user.equals("paper") && comp.equals("rock")) return 1;
        return -1;
    }
    public static String[][] statsTable(String[] userChoices, String[] compChoices, int[] results) {
        int n = userChoices.length;
        String[][] table = new String[n + 1][3];
        int userWins = 0, compWins = 0, draws = 0;
        for (int i = 0; i < n; i++) {
            table[i][0] = userChoices[i];
            table[i][1] = compChoices[i];
            table[i][2] = results[i] == 1 ? "User" : (results[i] == -1 ? "Computer" : "Draw");
            if (results[i] == 1) userWins++;
            else if (results[i] == -1) compWins++;
            else draws++;
        }
        table[n][0] = "Stats";
        table[n][1] = "UserWins=" + userWins;
        double total = n;
        double userPerc = total == 0 ? 0 : (userWins / total) * 100.0;
        double compPerc = total == 0 ? 0 : (compWins / total) * 100.0;
        table[n][2] = "User%=" + String.format("%.2f", userPerc) + " Comp%=" + String.format("%.2f", compPerc);
        return table;
    }
    public static void displayTable(String[][] table) {
        for (int i = 0; i < table.length; i++) System.out.println(table[i][0] + " " + table[i][1] + " " + table[i][2]);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int games = in.nextInt();
        String[] userChoices = new String[games];
        String[] compChoices = new String[games];
        int[] results = new int[games];
        Random r = new Random();
        for (int i = 0; i < games; i++) {
            String u = in.next().toLowerCase();
            String c = computerChoice(r);
            userChoices[i] = u;
            compChoices[i] = c;
            results[i] = winner(u, c);
        }
        String[][] table = statsTable(userChoices, compChoices, results);
        displayTable(table);
    }
}
