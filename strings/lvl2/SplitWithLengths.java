import java.util.Scanner;
public class SplitWithLengths {
    public static String[] splitManual(String s) {
        int n = s.length();
        java.util.List<String> words = new java.util.ArrayList<>();
        StringBuilder cur = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (cur.length() > 0) { words.add(cur.toString()); cur.setLength(0); }
            } else cur.append(c);
        }
        if (cur.length() > 0) words.add(cur.toString());
        return words.toArray(new String[0]);
    }
    public static int lengthWithoutMethod(String s) {
        int count = 0;
        try {
            while (true) { s.charAt(count); count++; }
        } catch (IndexOutOfBoundsException e) { return count; }
    }
    public static String[][] wordsWithLengths(String[] words) {
        String[][] out = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            out[i][0] = words[i];
            out[i][1] = String.valueOf(lengthWithoutMethod(words[i]));
        }
        return out;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] words = splitManual(line);
        String[][] table = wordsWithLengths(words);
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + " " + Integer.parseInt(table[i][1]));
        }
    }
}
