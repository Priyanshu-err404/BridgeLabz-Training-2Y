import java.util.Scanner;
public class VowelConsonantTable {
    public static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
    public static String typeOfChar(char c) {
        char lc = c;
        if (lc >= 'A' && lc <= 'Z') lc = (char)(lc - 'A' + 'a');
        if (lc=='a' || lc=='e' || lc=='i' || lc=='o' || lc=='u') return "Vowel";
        if (lc >= 'a' && lc <= 'z') return "Consonant";
        return "Not a Letter";
    }
    public static String[][] table(String s) {
        java.util.List<String[]> rows = new java.util.ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String t = typeOfChar(c);
            rows.add(new String[] { String.valueOf(c), t });
        }
        return rows.toArray(new String[0][]);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[][] rows = table(line);
        for (int i = 0; i < rows.length; i++) System.out.println(rows[i][0] + " " + rows[i][1]);
    }
}
