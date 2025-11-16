import java.util.Scanner;
public class TrimSubstringCompare {
    public static int[] trimIndices(String s) {
        int n = s.length();
        int start = 0;
        while (start < n && s.charAt(start) == ' ') start++;
        int end = n - 1;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        return new int[] { start, end };
    }
    public static String substringManual(String s, int start, int end) {
        if (start > end) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) sb.append(s.charAt(i));
        return sb.toString();
    }
    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int[] idx = trimIndices(s);
        String manual = substringManual(s, idx[0], idx[1]);
        String builtin = s.trim();
        System.out.println(manual.equals(builtin));
    }
}
