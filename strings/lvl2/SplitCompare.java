import java.util.Scanner;
public class SplitCompare {
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
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (!a[i].equals(b[i])) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] manual = splitManual(line);
        String[] builtin = line.trim().isEmpty() ? new String[0] : line.split("\\s+");
        System.out.println(compareArrays(manual, builtin));
    }
}
