import java.util.Scanner;
public class ShortestLongestWord {
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
    public static String[] wordsWithLengths(String[] words) {
        String[][] temp = new String[words.length][2];
        String[] out = new String[2];
        if (words.length == 0) return new String[] {"",""};
        int minIdx = 0, maxIdx = 0;
        for (int i = 0; i < words.length; i++) {
            int len = lengthWithoutMethod(words[i]);
            if (len < lengthWithoutMethod(words[minIdx])) minIdx = i;
            if (len > lengthWithoutMethod(words[maxIdx])) maxIdx = i;
        }
        out[0] = words[minIdx];
        out[1] = words[maxIdx];
        return out;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] words = splitManual(line);
        String[] res = wordsWithLengths(words);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
